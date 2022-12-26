package Setup.project.pages;

import Setup.project.pages.Cart.CartPage;
import Setup.project.pages.ListProducts.ListProductsPage;
import Setup.project.pages.Login.LoginPage;
import Setup.project.pages.ProductsDetail.ProductDetailsPage;

public class CommonPage {

    public LoginPage loginPage;
    public ListProductsPage listProductsPage;
//    public ProductDetailsPage productDetailPage;

//    public CartPage cartPage;
    public LoginPage getLoginPage() {
        if (loginPage == null) {
            loginPage = new LoginPage();
        }
        return loginPage;
    }

    public ListProductsPage getListProductsPage() {
        if (listProductsPage == null) {
            listProductsPage = new ListProductsPage();
        }
        return listProductsPage;
    }

//    public ProductDetailsPage getProductDetailsPage() {
//        if (productDetailPage == null) {
//            productDetailPage = new ProductDetailsPage();
//        }
//        return productDetailPage;
//    }

//    public CartPage getCartPage() {
//        if (cartPage == null) {
//            cartPage = new CartPage();
//        }
//        return cartPage;
//    }

}
