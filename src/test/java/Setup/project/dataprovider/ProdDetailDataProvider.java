package Setup.project.dataprovider;

import Common.constants.FrameworkConstants;
import Common.helpers.ExcelHelpers;
import Common.helpers.Helpers;
import Setup.project.modals.ProductDetailModal;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.Hashtable;
public class ProdDetailDataProvider {

    public ProdDetailDataProvider() {
    }

    @Test(dataProvider = "getProdsDetailDataHashTable")
    public void testProdsDetailData(Hashtable<String, String> data) {
        System.out.println("ProdsDetailData.ProductName = " + data.get(ProductDetailModal.getProductName()));
        System.out.println("ProdsDetailData.ProductDescription = " + data.get(ProductDetailModal.getProductDescription()));
        System.out.println("ProdsDetailData.ProductPrice = " + data.get(ProductDetailModal.getProductPrice()));
        System.out.println("ProdsDetailData.ProductLink = " + data.get(ProductDetailModal.getProductLink()));

    }

    @DataProvider(name = "getProdsDetailDataHashTable")
    public static Object[][] getProdsDetailDataHashTable() {
        ExcelHelpers excelHelpers = new ExcelHelpers();
        Object[][] data = excelHelpers.getDataHashTable(Helpers.getCurrentDir() + FrameworkConstants.EXCEL_DATA_FILE_PATH, "Product_detail", 1,1 );

        return data;
    }
}
