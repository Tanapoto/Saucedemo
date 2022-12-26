package TestCase;

import Setup.baseSetUp.BaseTest;
import Setup.project.dataprovider.CartDataProvider;
import Setup.project.pages.Cart.CartPage;
import Setup.project.pages.Login.LoginPage;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Step;
import org.testng.annotations.Test;

import java.util.Hashtable;

@Epic("Regression Test Automation Practice")
@Feature("Cart Test")
public class CartTest extends BaseTest {
    CartPage cartPage;

    public CartTest() {
        loginPage = new LoginPage();
        cartPage = new CartPage();
    }

    @Test(priority = 1, dataProvider = "getProdsInCartHashTable1", dataProviderClass = CartDataProvider.class)
    @Step("testDataProdsInCart")
    public void getProdsInCartAndHandleButton(Hashtable<String, String> data) {
        listProductsPage = loginPage.loginSuccessfully();
        cartPage.getProdsInCart(data);
        cartPage.removeProdsInCart();
        cartPage.clickOnCheckoutBtn();
        cartPage.clickOnContinueShoppingBtn();
    }




}
