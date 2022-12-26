package Setup.project.dataprovider;

import Common.constants.FrameworkConstants;
import Common.helpers.ExcelHelpers;
import Common.helpers.Helpers;
import Setup.project.modals.CartModal;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.Hashtable;

public class CartDataProvider {
    @Test(dataProvider = "getProdsInCartHashTable1")
    public void testDataProdInCartHashTable1(Hashtable<String, String> data) {
        System.out.println("CartData.ProductName = " + data.get(CartModal.getProductName()));
        System.out.println("CartData.ProductDescription = " + data.get(CartModal.getProductDescription()));
        System.out.println("CartData.ProductPrice = " + data.get(CartModal.getProductPrice()));
        System.out.println("CartData.ListProdLink = " + data.get(CartModal.getListProdLink()));
        System.out.println("CartData.CartLink = " + data.get(CartModal.getCartLink()));
        System.out.println("CartData.CheckoutLink = " + data.get(CartModal.getCheckoutLink()));

    }

    @DataProvider(name = "getProdsInCartHashTable1")
    public static Object[][] getDataInCartHashTable1() {
        ExcelHelpers excelHelpers = new ExcelHelpers();
        Object[][] data = excelHelpers.getDataHashTable(Helpers.getCurrentDir() + FrameworkConstants.EXCEL_DATA_FILE_PATH, "Cart", 1, 1);

        return data;
    }

}
