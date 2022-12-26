package TestCase;

import Setup.baseSetUp.BaseTest;
import Setup.project.dataprovider.ListProductsDataProvider;
import Setup.project.pages.Login.LoginPage;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Step;
import org.testng.annotations.Test;

import java.util.Hashtable;

@Epic("Regression Test Automation Practice")
@Feature("HomeTest Test")
public class ListProductsTest extends BaseTest {
    public ListProductsTest() {
        loginPage = new LoginPage();
    }


    @Test(priority = 1, dataProvider = "getListProdsDataHashTable1", dataProviderClass = ListProductsDataProvider.class)
    @Step("listProdsTestDataProvider")
    public void getAllProducts(Hashtable<String, String> data){
        listProductsPage = loginPage.loginSuccessfully();
        listProductsPage.getAllProducts(data);
    }
    @Test(priority = 2)
    public void testSortProductA_Z() throws Exception {
        listProductsPage = loginPage.loginSuccessfully();
        listProductsPage.testSortProductA_Z();
    }
    @Test(priority = 3)
    public void testSortProductFromZ_A() throws Exception {
        listProductsPage = loginPage.loginSuccessfully();
        listProductsPage.testSortProductFromZ_A();
    }
    @Test(priority = 4)
    public void testSortProductLow_High() throws Exception {
        listProductsPage = loginPage.loginSuccessfully();
        listProductsPage.testSortProductLow_High();
    }

    @Test(priority = 5)
    public void testSortProductHigh_Low() throws Exception {
        listProductsPage = loginPage.loginSuccessfully();
        listProductsPage.testSortProductHigh_Low();
    }
    @Test(priority = 6)
    public void testAddProducts() throws Exception {
        listProductsPage = loginPage.loginSuccessfully();
        listProductsPage.testAddProducts();
    }
    @Test(priority = 7)
    public void testRemoveProducts() throws Exception {
        listProductsPage = loginPage.loginSuccessfully();
        listProductsPage.testRemoveProducts();
    }
    @Test(priority = 8)
    public void testImageIsNotBroken() throws Exception {
        listProductsPage = loginPage.loginSuccessfully();
        listProductsPage.testImageIsNotBroken();
    }
}
