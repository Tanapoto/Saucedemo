package Setup.project.modals;
import lombok.Data;

@Data
public class ListProductsModal {
    public static String productName = "PRODUCT_NAME";
    public static String productDescription = "PRODUCT_DESCRIPTION";
    public static String productPrice = "PRODUCT_PRICE";

    

    public static String getProductName() {
        return productName;
    }

    public static String getProductDescription() {
        return productDescription;
    }

    public static String getProductPrice() {
        return productPrice;
    }
}
