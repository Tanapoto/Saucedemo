package Setup.project.pages.Checkout;

import Common.constants.FrameworkConstants;
import Common.handle.WebUI;
import Common.helpers.ExcelHelpers;
import Common.utilities.ObjectUtils;
import Setup.project.modals.CartModal;
import Setup.project.modals.CheckoutProcessTwoModal;
import Setup.project.pages.ListProducts.ListProductsPage;
import org.openqa.selenium.By;
import org.testng.Assert;

import java.text.DecimalFormat;

import static Common.handle.WebUI.getTextElement;
import static Common.handle.WebUI.getWebElements;

public class CheckoutProcessTwoPage {
    public By nameProdsCart = ObjectUtils.getByLocatorFromConfig("nameProdsCart");
    public By totalPriceWithoutTax = ObjectUtils.getByLocatorFromConfig("totalPriceWithoutTax");
    public By tax = ObjectUtils.getByLocatorFromConfig("tax");
    public By totalPriceWithTax = ObjectUtils.getByLocatorFromConfig("totalPriceWithTax");
    public By finishBtn = ObjectUtils.getByLocatorFromConfig("finishBtn");
    public By backToProcessOne = ObjectUtils.getByLocatorFromConfig("backToProcessOne");
    public By numDetailInCard = ObjectUtils.getByLocatorFromConfig("numDetailInCard");

    ExcelHelpers excelHelpers = new ExcelHelpers();


    public ListProductsPage verifyProdsInCheckoutTwoProcess() {
        excelHelpers.setExcelFile(FrameworkConstants.EXCEL_DATA_FILE_PATH, "Checkout_Process_Two");
        double priceProdWithoutTax = 0;
        //Verify Prods in CheckoutTwoProcess
        for (int i = 3; i <= getWebElements(nameProdsCart).size() + 2; i++) {
            By name = By.xpath("//div[1]/div[" + i + "]/div[2]/a[1]/div[1]");
            By des = By.xpath("//div[1]/div[1]/div[" + i + "]/div[2]/div[1]");
            By price = By.xpath("//div[1]/div[1]/div[" + i + "]/div[2]/div[2]/div[1]");
            WebUI.scrollToElement(name);
            Assert.assertTrue(WebUI.verifyElementTextEquals(name, excelHelpers.getCellData(i - 2, CheckoutProcessTwoModal.getProductName())), "[Name] Row " + i + "don't equals");
            Assert.assertTrue(WebUI.verifyElementTextEquals(des, excelHelpers.getCellData(i - 2, CheckoutProcessTwoModal.getProductDescription())), "[Description] Row " + i + "don't equals");
            Assert.assertTrue(WebUI.verifyElementTextContains(price, excelHelpers.getCellData(i - 2, CheckoutProcessTwoModal.getProductPrice())), "[Price] Row " + i + "don't equals");
            priceProdWithoutTax += Double.parseDouble(getTextElement(price).replace("$", ""));
        }
        //Verify total prices
        DecimalFormat df = new DecimalFormat("#.##");
        double taxProd = Double.parseDouble((df.format(priceProdWithoutTax * 0.08)).replace(",", "."));
        double priceProdWithTax = taxProd + priceProdWithoutTax;
        Assert.assertTrue(WebUI.verifyElementTextContains(totalPriceWithoutTax, String.valueOf(priceProdWithoutTax)), "priceProd dont equal");
        Assert.assertTrue(WebUI.verifyElementTextContains(tax, String.valueOf(taxProd)), "taxProd dont equal");
        Assert.assertTrue(WebUI.verifyElementTextContains(totalPriceWithTax, String.valueOf(priceProdWithTax)), "priceProdWithTax dont equal");
        return new ListProductsPage();

    }

    public ListProductsPage verifyCheckoutFinishProcess() {
        excelHelpers.setExcelFile(FrameworkConstants.EXCEL_DATA_FILE_PATH, "Checkout_Process_Two");
        WebUI.scrollToElement(finishBtn);
        WebUI.clickElement(finishBtn);
        WebUI.waitForPageLoaded();
        WebUI.verifyElementNotPresent(numDetailInCard);
        Assert.assertTrue(WebUI.verifyPageUrl(excelHelpers.getCellData(7,CheckoutProcessTwoModal.getCheckoutLinkFinished())));
        return new ListProductsPage();
    }

    public ListProductsPage verifyBackToCheckoutOneProcess() {
        excelHelpers.setExcelFile(FrameworkConstants.EXCEL_DATA_FILE_PATH, "Checkout_Process_Two");
        WebUI.scrollToElement(backToProcessOne);
        WebUI.clickElement(backToProcessOne);
        WebUI.waitForPageLoaded();
        Assert.assertTrue(WebUI.verifyPageUrl(excelHelpers.getCellData(5,CheckoutProcessTwoModal.getListProdLink())));
        return new ListProductsPage();
    }


}
