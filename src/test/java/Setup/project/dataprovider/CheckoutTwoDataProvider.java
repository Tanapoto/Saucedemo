package Setup.project.dataprovider;

import Common.constants.FrameworkConstants;
import Common.helpers.ExcelHelpers;
import Common.helpers.Helpers;
import Setup.project.modals.CheckoutProcessTwoModal;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.Hashtable;

public class CheckoutTwoDataProvider {

    @Test(dataProvider = "getDataCheckoutTwoHashTable1")
    public void testDataCheckoutTwoHashTable1(Hashtable<String, String> data) {
        System.out.println("CheckoutData.ProductName = " + data.get(CheckoutProcessTwoModal.getProductName()));
        System.out.println("CheckoutData.ProductDescription = " + data.get(CheckoutProcessTwoModal.getProductDescription()));
        System.out.println("CheckoutData.ProductPrice = " + data.get(CheckoutProcessTwoModal.getProductPrice()));
        System.out.println("CheckoutData.ListProdLink = " + data.get(CheckoutProcessTwoModal.getListProdLink()));
        System.out.println("CheckoutData.CheckoutLinkTwo = " + data.get(CheckoutProcessTwoModal.getCheckoutLinkTwo()));
        System.out.println("CheckoutData.CheckoutLinkFinished = " + data.get(CheckoutProcessTwoModal.getCheckoutLinkFinished()));
    }
    @Test(dataProvider = "getDataCheckoutTwoHashTable2")
    public void testDataCheckoutOneHashTable2(Hashtable<String, String> data) {
        System.out.println("CheckoutData.ProductName = " + data.get(CheckoutProcessTwoModal.getProductName()));
        System.out.println("CheckoutData.ProductDescription = " + data.get(CheckoutProcessTwoModal.getProductDescription()));
        System.out.println("CheckoutData.ProductPrice = " + data.get(CheckoutProcessTwoModal.getProductPrice()));
        System.out.println("CheckoutData.ListProdLink = " + data.get(CheckoutProcessTwoModal.getListProdLink()));
        System.out.println("CheckoutData.CheckoutLinkTwo = " + data.get(CheckoutProcessTwoModal.getCheckoutLinkTwo()));
        System.out.println("CheckoutData.CheckoutLinkFinished = " + data.get(CheckoutProcessTwoModal.getCheckoutLinkFinished()));
    }
    @Test(dataProvider = "getDataCheckoutTwoHashTable3")
    public void testDataCheckoutOneHashTable3(Hashtable<String, String> data) {
        System.out.println("CheckoutData.ProductName = " + data.get(CheckoutProcessTwoModal.getProductName()));
        System.out.println("CheckoutData.ProductDescription = " + data.get(CheckoutProcessTwoModal.getProductDescription()));
        System.out.println("CheckoutData.ProductPrice = " + data.get(CheckoutProcessTwoModal.getProductPrice()));
        System.out.println("CheckoutData.ListProdLink = " + data.get(CheckoutProcessTwoModal.getListProdLink()));
        System.out.println("CheckoutData.CheckoutLinkTwo = " + data.get(CheckoutProcessTwoModal.getCheckoutLinkTwo()));
        System.out.println("CheckoutData.CheckoutLinkFinished = " + data.get(CheckoutProcessTwoModal.getCheckoutLinkFinished()));
    }
    @Test(dataProvider = "getDataCheckoutTwoHashTable4")
    public void testDataCheckoutTwoHashTable4(Hashtable<String, String> data) {
        System.out.println("CheckoutData.ProductName = " + data.get(CheckoutProcessTwoModal.getProductName()));
        System.out.println("CheckoutData.ProductDescription = " + data.get(CheckoutProcessTwoModal.getProductDescription()));
        System.out.println("CheckoutData.ProductPrice = " + data.get(CheckoutProcessTwoModal.getProductPrice()));
        System.out.println("CheckoutData.ListProdLink = " + data.get(CheckoutProcessTwoModal.getListProdLink()));
        System.out.println("CheckoutData.CheckoutLinkTwo = " + data.get(CheckoutProcessTwoModal.getCheckoutLinkTwo()));
        System.out.println("CheckoutData.CheckoutLinkFinished = " + data.get(CheckoutProcessTwoModal.getCheckoutLinkFinished()));
    }
    @Test(dataProvider = "getDataCheckoutTwoHashTable5")
    public void testDataCheckoutTwoHashTable5(Hashtable<String, String> data) {
        System.out.println("CheckoutData.ProductName = " + data.get(CheckoutProcessTwoModal.getProductName()));
        System.out.println("CheckoutData.ProductDescription = " + data.get(CheckoutProcessTwoModal.getProductDescription()));
        System.out.println("CheckoutData.ProductPrice = " + data.get(CheckoutProcessTwoModal.getProductPrice()));
        System.out.println("CheckoutData.ListProdLink = " + data.get(CheckoutProcessTwoModal.getListProdLink()));
        System.out.println("CheckoutData.CheckoutLinkTwo = " + data.get(CheckoutProcessTwoModal.getCheckoutLinkTwo()));
        System.out.println("CheckoutData.CheckoutLinkFinished = " + data.get(CheckoutProcessTwoModal.getCheckoutLinkFinished()));
    }
    @Test(dataProvider = "getDataCheckoutTwoHashTable6")
    public void testDataCheckoutTwoHashTable6(Hashtable<String, String> data) {
        System.out.println("CheckoutData.ProductName = " + data.get(CheckoutProcessTwoModal.getProductName()));
        System.out.println("CheckoutData.ProductDescription = " + data.get(CheckoutProcessTwoModal.getProductDescription()));
        System.out.println("CheckoutData.ProductPrice = " + data.get(CheckoutProcessTwoModal.getProductPrice()));
        System.out.println("CheckoutData.ListProdLink = " + data.get(CheckoutProcessTwoModal.getListProdLink()));
        System.out.println("CheckoutData.CheckoutLinkTwo = " + data.get(CheckoutProcessTwoModal.getCheckoutLinkTwo()));
        System.out.println("CheckoutData.CheckoutLinkFinished = " + data.get(CheckoutProcessTwoModal.getCheckoutLinkFinished()));
    }

    @DataProvider(name = "getDataCheckoutTwoHashTable1")
    public static Object[][] getDataCheckoutTwoHashTable1() {
        ExcelHelpers excelHelpers = new ExcelHelpers();
        Object[][] data = excelHelpers.getDataHashTable(Helpers.getCurrentDir() + FrameworkConstants.EXCEL_DATA_FILE_PATH, "Checkout_Process_Two", 1, 1);
        return data;
    }
    @DataProvider(name = "getDataCheckoutTwoHashTable2")
    public static Object[][] getDataCheckoutTwoHashTable2() {
        ExcelHelpers excelHelpers = new ExcelHelpers();
        Object[][] data = excelHelpers.getDataHashTable(Helpers.getCurrentDir() + FrameworkConstants.EXCEL_DATA_FILE_PATH, "Checkout_Process_Two", 1, 1);
        return data;
    }
    @DataProvider(name = "getDataCheckoutTwoHashTable3")
    public static Object[][] getDataCheckoutTwoHashTable3() {
        ExcelHelpers excelHelpers = new ExcelHelpers();
        Object[][] data = excelHelpers.getDataHashTable(Helpers.getCurrentDir() + FrameworkConstants.EXCEL_DATA_FILE_PATH, "Checkout_Process_Two", 1, 1);
        return data;
    }
    @DataProvider(name = "getDataCheckoutTwoHashTable4")
    public static Object[][] getDataCheckoutTwoHashTable4() {
        ExcelHelpers excelHelpers = new ExcelHelpers();
        Object[][] data = excelHelpers.getDataHashTable(Helpers.getCurrentDir() + FrameworkConstants.EXCEL_DATA_FILE_PATH, "Checkout_Process_Two", 1, 1);
        return data;
    }
    @DataProvider(name = "getDataCheckoutTwoHashTable5")
    public static Object[][] getDataCheckoutTwoHashTable5() {
        ExcelHelpers excelHelpers = new ExcelHelpers();
        Object[][] data = excelHelpers.getDataHashTable(Helpers.getCurrentDir() + FrameworkConstants.EXCEL_DATA_FILE_PATH, "Checkout_Process_Two", 1, 1);
        return data;
    }
    @DataProvider(name = "getDataCheckoutTwoHashTable6")
    public static Object[][] getDataCheckoutTwoHashTable6() {
        ExcelHelpers excelHelpers = new ExcelHelpers();
        Object[][] data = excelHelpers.getDataHashTable(Helpers.getCurrentDir() + FrameworkConstants.EXCEL_DATA_FILE_PATH, "Checkout_Process_Two", 1, 1);
        return data;
    }
}
