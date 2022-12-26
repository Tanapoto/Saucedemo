package TestCase;

import Setup.baseSetUp.BaseTest;
import Setup.project.dataprovider.LoginDataProvider;
import Setup.project.pages.Login.LoginPage;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Step;

import org.testng.annotations.Test;

import java.util.Hashtable;

@Epic("Regression Test Automation Practice")
@Feature("Login Test")
public class LoginTest extends BaseTest {

    public LoginTest() {
        loginPage = new LoginPage();
    }

    @Test(priority = 1, dataProvider = "getLoginDataHashTable1", dataProviderClass = LoginDataProvider.class)
    @Step("loginTestDataProvider1")
    public void loginInvalidUsername(Hashtable<String, String> data) {
        loginPage.loginInvalidUsername();
    }

    @Test(priority = 2, dataProvider = "getLoginDataHashTable2", dataProviderClass = LoginDataProvider.class)
    @Step("loginTestDataProvider2")
    public void loginInvalidPassword(Hashtable<String, String> data) {
        loginPage.loginInvalidPassword();
    }

    @Test(priority = 3, dataProvider = "getLoginDataHashTable3", dataProviderClass = LoginDataProvider.class)
    @Step("loginTestDataProvider3")
    public void loginEmptyUsername(Hashtable<String, String> data) {
        loginPage.loginEmptyUsername();
    }

    @Test(priority = 4, dataProvider = "getLoginDataHashTable4", dataProviderClass = LoginDataProvider.class)
    @Step("loginTestDataProvider4")
    public void loginEmptyPassword(Hashtable<String, String> data) {
        loginPage.loginEmptyPassword();
    }

    @Test(priority = 5, dataProvider = "getLoginDataHashTable5", dataProviderClass = LoginDataProvider.class)
    @Step("loginTestDataProvider5")
    public void loginEmptyUsernamePassword(Hashtable<String, String> data) {
        loginPage.loginEmptyUsernamePassword();
    }

    @Test(priority = 6, dataProvider = "getLoginDataHashTable6", dataProviderClass = LoginDataProvider.class)
    @Step("loginTestDataProvider6")
    public void loginWithLockedOutUser(Hashtable<String, String> data) {
        loginPage.loginWithLockedOutUser();
    }

    @Test(priority = 7, dataProvider = "getLoginDataHashTable7", dataProviderClass = LoginDataProvider.class)
    @Step("loginTestDataProvider7")
    public void loginSuccessfully(Hashtable<String, String> data) {
        loginPage.loginSuccessfully();
    }
}

