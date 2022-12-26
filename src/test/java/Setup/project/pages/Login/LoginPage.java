package Setup.project.pages.Login;

import Common.constants.FrameworkConstants;
import Common.handle.WebUI;
import Common.helpers.ExcelHelpers;
import Common.utilities.ObjectUtils;
import Setup.project.modals.LoginModal;
import Setup.project.pages.ListProducts.ListProductsPage;
import org.openqa.selenium.By;
import org.testng.Assert;

public class LoginPage {

    public By inputUsername = ObjectUtils.getByLocatorFromConfig("inputUsername");
    public By inputPassword = ObjectUtils.getByLocatorFromConfig("inputPassword");
    public By alertErrorMessage = ObjectUtils.getByLocatorFromConfig("alertErrorMess");
    public By buttonLogin = ObjectUtils.getByLocatorFromConfig("buttonLogin");
    private String nowPageTitle = "Swag Labs";

    ExcelHelpers excelHelpers;
    public LoginPage() {
        excelHelpers = new ExcelHelpers();
    }

    public ListProductsPage loginInvalidUsername() {
        excelHelpers.setExcelFile(FrameworkConstants.EXCEL_DATA_FILE_PATH, "Login");
        WebUI.getURL(FrameworkConstants.URL_PROJECT);
        Assert.assertTrue(WebUI.verifyPageTitle(nowPageTitle), "The title of Login page not match.");
        WebUI.clearText(inputUsername);
        WebUI.clearText(inputPassword);
        WebUI.setText(inputUsername, excelHelpers.getCellData(1, LoginModal.getUsername()));
        WebUI.setText(inputPassword, excelHelpers.getCellData(1, LoginModal.getPassword()));
        WebUI.clickElement(buttonLogin);
        WebUI.waitForPageLoaded();
        Assert.assertTrue(WebUI.verifyElementTextEquals(alertErrorMessage, excelHelpers.getCellData(1, LoginModal.getExpectedError())));
        return new ListProductsPage();
    }

    public ListProductsPage loginInvalidPassword() {
        excelHelpers.setExcelFile(FrameworkConstants.EXCEL_DATA_FILE_PATH, "Login");
        WebUI.getURL(FrameworkConstants.URL_PROJECT);
        Assert.assertTrue(WebUI.verifyPageTitle(nowPageTitle), "The title of Login page not match.");
        WebUI.clearText(inputUsername);
        WebUI.clearText(inputPassword);
        WebUI.setText(inputUsername, excelHelpers.getCellData(2, LoginModal.getUsername()));
        WebUI.setText(inputPassword, excelHelpers.getCellData(2, LoginModal.getPassword()));
        WebUI.clickElement(buttonLogin);
        WebUI.waitForPageLoaded();
        Assert.assertTrue(WebUI.verifyElementTextEquals(alertErrorMessage, excelHelpers.getCellData(2, LoginModal.getExpectedError())));
        return new ListProductsPage();
    }

    public ListProductsPage loginEmptyUsername() {
        excelHelpers.setExcelFile(FrameworkConstants.EXCEL_DATA_FILE_PATH, "Login");
        WebUI.getURL(FrameworkConstants.URL_PROJECT);
        Assert.assertTrue(WebUI.verifyPageTitle(nowPageTitle), "The title of Login page not match.");
        WebUI.clearText(inputUsername);
        WebUI.clearText(inputPassword);
        WebUI.setText(inputUsername, excelHelpers.getCellData(3, LoginModal.getUsername()));
        WebUI.setText(inputPassword, excelHelpers.getCellData(3, LoginModal.getPassword()));
        WebUI.clickElement(buttonLogin);
        WebUI.waitForPageLoaded();
        Assert.assertTrue(WebUI.verifyElementTextEquals(alertErrorMessage, excelHelpers.getCellData(3, LoginModal.getExpectedError())));
        return new ListProductsPage();
    }

    public ListProductsPage loginEmptyPassword() {
        excelHelpers.setExcelFile(FrameworkConstants.EXCEL_DATA_FILE_PATH, "Login");
        WebUI.getURL(FrameworkConstants.URL_PROJECT);
        Assert.assertTrue(WebUI.verifyPageTitle(nowPageTitle), "The title of Login page not match.");
        WebUI.clearText(inputUsername);
        WebUI.clearText(inputPassword);
        WebUI.setText(inputUsername, excelHelpers.getCellData(4, LoginModal.getUsername()));
        WebUI.setText(inputPassword, excelHelpers.getCellData(4, LoginModal.getPassword()));
        WebUI.clickElement(buttonLogin);
        WebUI.waitForPageLoaded();
        Assert.assertTrue(WebUI.verifyElementTextEquals(alertErrorMessage, excelHelpers.getCellData(4, LoginModal.getExpectedError())));
        return new ListProductsPage();
    }

    public ListProductsPage loginEmptyUsernamePassword() {
        excelHelpers.setExcelFile(FrameworkConstants.EXCEL_DATA_FILE_PATH, "Login");
        WebUI.getURL(FrameworkConstants.URL_PROJECT);
        Assert.assertTrue(WebUI.verifyPageTitle(nowPageTitle), "The title of Login page not match.");
        WebUI.clearText(inputUsername);
        WebUI.clearText(inputPassword);
        WebUI.setText(inputUsername, excelHelpers.getCellData(5, LoginModal.getUsername()));
        WebUI.setText(inputPassword, excelHelpers.getCellData(5, LoginModal.getPassword()));
        WebUI.clickElement(buttonLogin);
        WebUI.waitForPageLoaded();
        Assert.assertTrue(WebUI.verifyElementTextEquals(alertErrorMessage, excelHelpers.getCellData(5, LoginModal.getExpectedError())));
        return new ListProductsPage();
    }

    public ListProductsPage loginWithLockedOutUser() {
        excelHelpers.setExcelFile(FrameworkConstants.EXCEL_DATA_FILE_PATH, "Login");
        WebUI.getURL(FrameworkConstants.URL_PROJECT);
        Assert.assertTrue(WebUI.verifyPageTitle(nowPageTitle), "The title of Login page not match.");
        WebUI.clearText(inputUsername);
        WebUI.clearText(inputPassword);
        WebUI.setText(inputUsername, excelHelpers.getCellData(6, LoginModal.getUsername()));
        WebUI.setText(inputPassword, excelHelpers.getCellData(6, LoginModal.getPassword()));
        WebUI.clickElement(buttonLogin);
        WebUI.waitForPageLoaded();
        Assert.assertTrue(WebUI.verifyElementTextEquals(alertErrorMessage, excelHelpers.getCellData(6, LoginModal.getExpectedError())));
        return new ListProductsPage();
    }

    public ListProductsPage loginSuccessfully() {
        excelHelpers.setExcelFile(FrameworkConstants.EXCEL_DATA_FILE_PATH, "Login");
        WebUI.getURL(FrameworkConstants.URL_PROJECT);
        Assert.assertTrue(WebUI.verifyPageTitle(nowPageTitle), "The title of Login page not match.");
        WebUI.clearText(inputUsername);
        WebUI.clearText(inputPassword);
        WebUI.setText(inputUsername, excelHelpers.getCellData(7, LoginModal.getUsername()));
        WebUI.setText(inputPassword, excelHelpers.getCellData(7, LoginModal.getPassword()));
        WebUI.clickElement(buttonLogin);
        WebUI.waitForPageLoaded();
        Assert.assertTrue(WebUI.verifyPageUrl(excelHelpers.getCellData(7,LoginModal.getExpectedUrl())),"Login failure");
        return new ListProductsPage();
    }
}
