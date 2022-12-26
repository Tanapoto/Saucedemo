package Setup.project.modals;
import lombok.Data;

@Data
public class CartModal {

    public static String productName = "PRODUCT_NAME";
    public static String productDescription = "PRODUCT_DESCRIPTION";
    public static String productPrice = "PRODUCT_PRICE";
    public static String listProdLink = "LIST_PROD_LINK";
    public static String cartLink = "CART_LINK";
    public static String checkoutLink = "CHECKOUT_LINK";

    public static String getProductName() {
        return productName;
    }

    public static String getProductDescription() {
        return productDescription;
    }

    public static String getProductPrice() {
        return productPrice;
    }
    public static String getListProdLink() {
        return listProdLink;
    }
    public static String getCartLink() {
        return cartLink;
    }
    public static String getCheckoutLink() {
        return checkoutLink;
    }
}
