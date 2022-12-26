package Setup.project.pages.Cart;

import Common.constants.FrameworkConstants;
import Common.driver.DriverManager;
import Common.handle.WebUI;
import Common.helpers.ExcelHelpers;
import Common.utilities.ObjectUtils;
import Setup.project.modals.CartModal;
import Setup.project.pages.Checkout.CheckoutProcessOnePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.Hashtable;

import static Common.handle.WebUI.getWebElements;

public class CartPage {
    private String nowPageTitle = "Swag Labs";
    public By nameProducts = ObjectUtils.getByLocatorFromConfig("nameProducts");
    public By cartLink = ObjectUtils.getByLocatorFromConfig("cartLink");
    public By nameProdsCart = ObjectUtils.getByLocatorFromConfig("nameProdsCart");
    public By continueBtnProdCart = ObjectUtils.getByLocatorFromConfig("continueBtnProdCart");
    public By checkoutBtnProdCart = ObjectUtils.getByLocatorFromConfig("checkoutBtnProdCart");
    public By backToCartBtn = ObjectUtils.getByLocatorFromConfig("backToCartButton");

    ExcelHelpers excelHelpers = new ExcelHelpers();

    public CheckoutProcessOnePage getProdsInCart(Hashtable<String, String> data) {
        excelHelpers.setExcelFile(FrameworkConstants.EXCEL_DATA_FILE_PATH, "Cart");
        //Add prods to Cart
        for (int i = 1; i <= getWebElements(nameProducts).size(); i++) {
            WebElement element = DriverManager.getDriver().findElement(By.xpath("//div[1]/div[1]/div[1]/div[" + i + "]/div[2]/div[2]/button[1]"));
            WebUI.scrollToElement(element);
            element.click();
        }
        WebUI.clickElement(cartLink);
        Assert.assertTrue(WebUI.verifyPageUrl(excelHelpers.getCellData(5, "CART_LINK")));
        //Verify Prods in Cart
        WebUI.waitForPageLoaded();
        for (int i = 3; i <= getWebElements(nameProdsCart).size() + 2; i++) {
            By name = By.xpath("//div[1]/div[" + i + "]/div[2]/a[1]/div[1]");
            By des = By.xpath("//div[1]/div[1]/div[" + i + "]/div[2]/div[1]");
            By price = By.xpath("//div[1]/div[1]/div[" + i + "]/div[2]/div[2]/div[1]");
            WebUI.scrollToElement(name);

            Assert.assertTrue(WebUI.verifyElementTextEquals(name, excelHelpers.getCellData(i - 2, CartModal.getProductName())), "[Name] Row " + i + "don't equals");
            Assert.assertTrue(WebUI.verifyElementTextEquals(des, excelHelpers.getCellData(i - 2, CartModal.getProductDescription())), "[Description] Row " + i + "don't equals");
            Assert.assertTrue(WebUI.verifyElementTextContains(price, excelHelpers.getCellData(i - 2, CartModal.getProductPrice())), "[Price] Row " + i + "don't equals");
        }
        return new CheckoutProcessOnePage();
    }

    public CheckoutProcessOnePage removeProdsInCart() {
        //Remove Prods in Cart
        for (int i = 3; i <= getWebElements(nameProdsCart).size(); i++) {
            By removeBtn = By.xpath("//div[1]/div[1]/div[" + i + "]/div[2]/div[2]/button[1]");
            WebUI.scrollToElement(removeBtn);
            WebUI.clickElement(removeBtn);
        }
        return new CheckoutProcessOnePage();
    }

    public CheckoutProcessOnePage clickOnCheckoutBtn() {
        //Click on CheckoutBtn
        WebUI.clickElement(checkoutBtnProdCart);
        WebUI.waitForPageLoaded();
        Assert.assertTrue(WebUI.verifyPageUrl(excelHelpers.getCellData(1, CartModal.getCheckoutLink())));
        return new CheckoutProcessOnePage();
    }


    public CheckoutProcessOnePage clickOnContinueShoppingBtn() {
        //Back to Cart
        WebUI.clickElement(backToCartBtn);
        WebUI.waitForPageLoaded();
        Assert.assertTrue(WebUI.verifyPageUrl(excelHelpers.getCellData(1, CartModal.getCartLink())));
        //Continue shopping
        WebUI.clickElement(continueBtnProdCart);
        WebUI.waitForPageLoaded();
        Assert.assertTrue(WebUI.verifyPageUrl(excelHelpers.getCellData(1, CartModal.getListProdLink())));
        return new CheckoutProcessOnePage();
    }

}