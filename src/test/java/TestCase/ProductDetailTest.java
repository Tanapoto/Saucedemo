package TestCase;
import Setup.baseSetUp.BaseTest;
import Setup.project.dataprovider.ProdDetailDataProvider;
import Setup.project.pages.ListProducts.ListProductsPage;
import Setup.project.pages.Login.LoginPage;
import Setup.project.pages.ProductsDetail.ProductDetailsPage;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Step;
import org.testng.annotations.Test;

import java.util.Hashtable;

@Epic("Regression Test Automation Practice")
@Feature("ProdDetailTest Test")
public class ProductDetailTest extends BaseTest {
    ProductDetailsPage productDetailPage;
    public ProductDetailTest() {
        loginPage = new LoginPage();
        listProductsPage = new ListProductsPage();
        productDetailPage = new ProductDetailsPage();
    }


    @Test(priority = 1, dataProvider = "getProdsDetailDataHashTable", dataProviderClass = ProdDetailDataProvider.class)
    @Step("testProdsDetailData")
    public void getProductsDetail(Hashtable<String, String> data){
        listProductsPage = loginPage.loginSuccessfully();

        productDetailPage.getProductsDetail();
    }

}
