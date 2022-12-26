package Setup.project.dataprovider;

import Common.constants.FrameworkConstants;
import Common.helpers.ExcelHelpers;
import Common.helpers.Helpers;
import Setup.project.modals.ListProductsModal;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.Hashtable;

public class ListProductsDataProvider {


    private ListProductsDataProvider() {
    }

    @Test(dataProvider = "getListProdsDataHashTable1")
    public void testListProdsData1(Hashtable<String, String> data) {
        System.out.println("HomeData.ProductName = " + data.get(ListProductsModal.getProductName()));
        System.out.println("HomeData.ProductDescription = " + data.get(ListProductsModal.getProductDescription()));
        System.out.println("HomeData.ProductPrice = " + data.get(ListProductsModal.getProductPrice()));
    }

    @DataProvider(name = "getListProdsDataHashTable1")
    public static Object[][] getListProdsData1() {
        ExcelHelpers excelHelpers = new ExcelHelpers();
        Object[][] data = excelHelpers.getDataHashTable(Helpers.getCurrentDir() + FrameworkConstants.EXCEL_DATA_FILE_PATH, "Home", 1, 1);

        return data;
    }
}
