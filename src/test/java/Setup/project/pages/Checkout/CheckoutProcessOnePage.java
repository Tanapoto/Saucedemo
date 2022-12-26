package Setup.project.pages.Checkout;

import Common.constants.FrameworkConstants;
import Common.handle.WebUI;
import Common.helpers.ExcelHelpers;
import Common.utilities.ObjectUtils;
import Setup.project.modals.CheckoutProcessOneModal;
import Setup.project.pages.ListProducts.ListProductsPage;
import org.openqa.selenium.By;
import org.testng.Assert;

public class CheckoutProcessOnePage {

    private String nowPageTitle = "Swag Labs";
    public By checkoutBtnProdCart = ObjectUtils.getByLocatorFromConfig("checkoutBtnProdCart");
    public By numInCart = ObjectUtils.getByLocatorFromConfig("numInCart");
    public By firstName = ObjectUtils.getByLocatorFromConfig("firstName");
    public By lastName = ObjectUtils.getByLocatorFromConfig("lastName");
    public By postalCode = ObjectUtils.getByLocatorFromConfig("postalCode");
    public By errorMess = ObjectUtils.getByLocatorFromConfig("errorMess");

    public By continueButton = ObjectUtils.getByLocatorFromConfig("continueButton");
    public By backToCartButton = ObjectUtils.getByLocatorFromConfig("backToCartButton");

    ExcelHelpers excelHelpers = new ExcelHelpers();

    public ListProductsPage getEmptyFirstName() {
        excelHelpers.setExcelFile(FrameworkConstants.EXCEL_DATA_FILE_PATH, "Checkout_Process");
        WebUI.clickElement(numInCart);
        WebUI.clickElement(checkoutBtnProdCart);
        WebUI.clearText(firstName);
        WebUI.setText(firstName, excelHelpers.getCellData(1, CheckoutProcessOneModal.getFirstname()));
        Assert.assertTrue(WebUI.verifyElementAttributeValue(firstName, "value", excelHelpers.getCellData(1, CheckoutProcessOneModal.getFirstname())));
        WebUI.clearText(lastName);
        WebUI.setText(lastName, excelHelpers.getCellData(1, CheckoutProcessOneModal.getLastname()));
        Assert.assertTrue(WebUI.verifyElementAttributeValue(lastName, "value", excelHelpers.getCellData(1, CheckoutProcessOneModal.getLastname())));
        WebUI.clearText(postalCode);
        WebUI.setText(postalCode, excelHelpers.getCellData(1, CheckoutProcessOneModal.getPostalCode()));
        Assert.assertTrue(WebUI.verifyElementAttributeValue(postalCode, "value", excelHelpers.getCellData(1, CheckoutProcessOneModal.getPostalCode())));
        WebUI.clickElement(continueButton);
        Assert.assertTrue(WebUI.verifyElementTextEquals(errorMess, excelHelpers.getCellData(1, CheckoutProcessOneModal.getErrorMess())));
        return new ListProductsPage();
    }

    public ListProductsPage getEmptyLastName() {
        excelHelpers.setExcelFile(FrameworkConstants.EXCEL_DATA_FILE_PATH, "Checkout_Process");
        WebUI.clickElement(numInCart);
        WebUI.clickElement(checkoutBtnProdCart);
        WebUI.clearText(firstName);
        WebUI.setText(firstName, excelHelpers.getCellData(2, CheckoutProcessOneModal.getFirstname()));
        Assert.assertTrue(WebUI.verifyElementAttributeValue(firstName, "value", excelHelpers.getCellData(2, CheckoutProcessOneModal.getFirstname())));
        WebUI.clearText(lastName);
        WebUI.setText(lastName, excelHelpers.getCellData(2, CheckoutProcessOneModal.getLastname()));
        Assert.assertTrue(WebUI.verifyElementAttributeValue(lastName, "value", excelHelpers.getCellData(2, CheckoutProcessOneModal.getLastname())));
        WebUI.clearText(postalCode);
        WebUI.setText(postalCode, excelHelpers.getCellData(2, CheckoutProcessOneModal.getPostalCode()));
        Assert.assertTrue(WebUI.verifyElementAttributeValue(postalCode, "value", excelHelpers.getCellData(2, CheckoutProcessOneModal.getPostalCode())));
        WebUI.clickElement(continueButton);
        Assert.assertTrue(WebUI.verifyElementTextEquals(errorMess, excelHelpers.getCellData(2, CheckoutProcessOneModal.getErrorMess())));
        return new ListProductsPage();
    }

    public ListProductsPage getEmptyPostalCode() {
        excelHelpers.setExcelFile(FrameworkConstants.EXCEL_DATA_FILE_PATH, "Checkout_Process");
        WebUI.clickElement(numInCart);
        WebUI.clickElement(checkoutBtnProdCart);
        WebUI.clearText(firstName);
        WebUI.setText(firstName, excelHelpers.getCellData(3, CheckoutProcessOneModal.getFirstname()));
        Assert.assertTrue(WebUI.verifyElementAttributeValue(firstName, "value", excelHelpers.getCellData(3, CheckoutProcessOneModal.getFirstname())));
        WebUI.clearText(lastName);
        WebUI.setText(lastName, excelHelpers.getCellData(3, CheckoutProcessOneModal.getLastname()));
        Assert.assertTrue(WebUI.verifyElementAttributeValue(lastName, "value", excelHelpers.getCellData(3, CheckoutProcessOneModal.getLastname())));
        WebUI.clearText(postalCode);
        WebUI.setText(postalCode, excelHelpers.getCellData(3, CheckoutProcessOneModal.getPostalCode()));
        Assert.assertTrue(WebUI.verifyElementAttributeValue(postalCode, "value", excelHelpers.getCellData(3, CheckoutProcessOneModal.getPostalCode())));
        WebUI.clickElement(continueButton);
        Assert.assertTrue(WebUI.verifyElementTextEquals(errorMess, excelHelpers.getCellData(3, CheckoutProcessOneModal.getErrorMess())));
        return new ListProductsPage();
    }

    public ListProductsPage getEmptyAllData() {
        excelHelpers.setExcelFile(FrameworkConstants.EXCEL_DATA_FILE_PATH, "Checkout_Process");
        WebUI.clickElement(numInCart);
        WebUI.clickElement(checkoutBtnProdCart);
        WebUI.clearText(firstName);
        WebUI.setText(firstName, excelHelpers.getCellData(4, CheckoutProcessOneModal.getFirstname()));
        Assert.assertTrue(WebUI.verifyElementAttributeValue(firstName, "value", excelHelpers.getCellData(4, CheckoutProcessOneModal.getFirstname())));
        WebUI.clearText(lastName);
        WebUI.setText(lastName, excelHelpers.getCellData(4, CheckoutProcessOneModal.getLastname()));
        Assert.assertTrue(WebUI.verifyElementAttributeValue(lastName, "value", excelHelpers.getCellData(4, CheckoutProcessOneModal.getLastname())));
        WebUI.clearText(postalCode);
        WebUI.setText(postalCode, excelHelpers.getCellData(4, CheckoutProcessOneModal.getPostalCode()));
        Assert.assertTrue(WebUI.verifyElementAttributeValue(postalCode, "value", excelHelpers.getCellData(4, CheckoutProcessOneModal.getPostalCode())));
        WebUI.clickElement(continueButton);
        Assert.assertTrue(WebUI.verifyElementTextEquals(errorMess, excelHelpers.getCellData(4, CheckoutProcessOneModal.getErrorMess())));
        return new ListProductsPage();
    }

    public ListProductsPage getValidIUserInformationSuccessfully() {
        excelHelpers.setExcelFile(FrameworkConstants.EXCEL_DATA_FILE_PATH, "Checkout_Process");
        WebUI.clickElement(numInCart);
        WebUI.clickElement(checkoutBtnProdCart);
        WebUI.clearText(firstName);
        WebUI.setText(firstName, excelHelpers.getCellData(5, CheckoutProcessOneModal.getFirstname()));
        Assert.assertTrue(WebUI.verifyElementAttributeValue(firstName, "value", excelHelpers.getCellData(5, CheckoutProcessOneModal.getFirstname())));
        WebUI.clearText(lastName);
        WebUI.setText(lastName, excelHelpers.getCellData(5, CheckoutProcessOneModal.getLastname()));
        Assert.assertTrue(WebUI.verifyElementAttributeValue(lastName, "value", excelHelpers.getCellData(5, CheckoutProcessOneModal.getLastname())));
        WebUI.clearText(postalCode);
        WebUI.setText(postalCode, excelHelpers.getCellData(5, CheckoutProcessOneModal.getPostalCode()));
        Assert.assertTrue(WebUI.verifyElementAttributeValue(postalCode, "value", excelHelpers.getCellData(5, CheckoutProcessOneModal.getPostalCode())));
        WebUI.clickElement(continueButton);
        Assert.assertTrue(WebUI.verifyElementNotPresent(errorMess));
        WebUI.waitForPageLoaded();
        Assert.assertTrue(WebUI.verifyPageUrl(excelHelpers.getCellData(5, CheckoutProcessOneModal.getCheckoutTwoLink())));
        return new ListProductsPage();
    }
}

