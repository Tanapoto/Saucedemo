package Setup.project.modals;
import lombok.Data;

@Data
public class ProductDetailModal {

    public static String productName = "PRODUCT_NAME";
    public static String productDescription = "PRODUCT_DESCRIPTION";
    public static String productPrice = "PRODUCT_PRICE";
    public static String productLink = "PRODUCT_LINK";


    public static String getProductName() {
        return productName;
    }

    public static String getProductDescription() {
        return productDescription;
    }

    public static String getProductPrice() {
        return productPrice;
    }

    public static String getProductLink() {
        return productLink;
    }

}
