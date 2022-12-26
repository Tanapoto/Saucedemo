package TestCase;

import Setup.baseSetUp.BaseTest;
import Setup.project.dataprovider.CartDataProvider;
import Setup.project.dataprovider.CheckoutOneDataProvider;
import Setup.project.dataprovider.CheckoutTwoDataProvider;
import Setup.project.pages.Cart.CartPage;
import Setup.project.pages.Checkout.CheckoutProcessOnePage;
import Setup.project.pages.Checkout.CheckoutProcessTwoPage;
import Setup.project.pages.ListProducts.ListProductsPage;
import Setup.project.pages.Login.LoginPage;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Step;
import org.testng.annotations.Test;

import java.util.Hashtable;

@Epic("Regression Test Automation Practice")
@Feature("Cart Test")
public class CheckoutProcessTest extends BaseTest {

    CheckoutProcessOnePage checkoutProcessOnePage;
    CheckoutProcessTwoPage checkoutProcessTwoPage;
    CartPage cartPage;

    public CheckoutProcessTest() {
        loginPage = new LoginPage();
        listProductsPage = new ListProductsPage();
        cartPage = new CartPage();
        checkoutProcessOnePage = new CheckoutProcessOnePage();
        checkoutProcessTwoPage = new CheckoutProcessTwoPage();
    }

    @Test(priority = 1, dataProvider = "getDataCheckoutOneHashTable1", dataProviderClass = CheckoutOneDataProvider.class)
    @Step("testDataCheckoutOne1")
    public void getEmptyFirstName(Hashtable<String, String> data) {
        listProductsPage = loginPage.loginSuccessfully();
        cartPage = listProductsPage.testAddProducts();
        checkoutProcessOnePage.getEmptyFirstName();
    }

    @Test(priority = 2, dataProvider = "getDataCheckoutOneHashTable2", dataProviderClass = CheckoutOneDataProvider.class)
    @Step("testDataCheckoutOne2")
    public void getEmptyLastName(Hashtable<String, String> data) {
        listProductsPage = loginPage.loginSuccessfully();
        cartPage = listProductsPage.testAddProducts();
        checkoutProcessOnePage.getEmptyLastName();
    }

    @Test(priority = 3, dataProvider = "getDataCheckoutOneHashTable3", dataProviderClass = CheckoutOneDataProvider.class)
    @Step("testDataCheckoutOne3")
    public void getEmptyPostalCode(Hashtable<String, String> data) {
        listProductsPage = loginPage.loginSuccessfully();
        cartPage = listProductsPage.testAddProducts();
        checkoutProcessOnePage.getEmptyPostalCode();
    }

    @Test(priority = 4, dataProvider = "getDataCheckoutOneHashTable4", dataProviderClass = CheckoutOneDataProvider.class)
    @Step("testDataCheckoutOne4")
    public void getEmptyAllData(Hashtable<String, String> data) {
        listProductsPage = loginPage.loginSuccessfully();
        cartPage = listProductsPage.testAddProducts();
        checkoutProcessOnePage.getEmptyAllData();
    }

    @Test(priority = 5, dataProvider = "getDataCheckoutOneHashTable5", dataProviderClass = CheckoutOneDataProvider.class)
    @Step("testDataCheckoutOne5")
    public void getValidIUserInformationSuccessfully(Hashtable<String, String> data) {
        listProductsPage = loginPage.loginSuccessfully();
        cartPage = listProductsPage.testAddProducts();
        checkoutProcessOnePage.getValidIUserInformationSuccessfully();
    }
    @Test(priority = 6, dataProvider = "getDataCheckoutTwoHashTable1", dataProviderClass = CheckoutTwoDataProvider.class)
    @Step("testDataCheckoutTwo1")
    public void verifyProdsInCheckoutTwoProcess(Hashtable<String, String> data) {
        listProductsPage = loginPage.loginSuccessfully();
        cartPage = listProductsPage.testAddProducts();
        checkoutProcessOnePage.getValidIUserInformationSuccessfully();
        checkoutProcessTwoPage.verifyProdsInCheckoutTwoProcess();
    }

    @Test(priority = 7, dataProvider = "getDataCheckoutTwoHashTable1", dataProviderClass = CheckoutTwoDataProvider.class)
    @Step("testDataCheckoutTwo2")
    public void verifyCheckoutFinishProcess(Hashtable<String, String> data) {
        listProductsPage = loginPage.loginSuccessfully();
        cartPage = listProductsPage.testAddProducts();
        checkoutProcessOnePage.getValidIUserInformationSuccessfully();
        checkoutProcessTwoPage.verifyCheckoutFinishProcess();
    }

    @Test(priority = 8, dataProvider = "getDataCheckoutTwoHashTable1", dataProviderClass = CheckoutTwoDataProvider.class)
    @Step("testDataCheckoutTwo3")
    public void verifyBackToCheckoutOneProcess(Hashtable<String, String> data) {
        listProductsPage = loginPage.loginSuccessfully();
        cartPage = listProductsPage.testAddProducts();
        checkoutProcessOnePage.getValidIUserInformationSuccessfully();
        checkoutProcessTwoPage.verifyBackToCheckoutOneProcess();
    }

}

