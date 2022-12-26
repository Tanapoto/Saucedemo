package Setup.project.dataprovider;

import Common.constants.FrameworkConstants;
import Common.helpers.ExcelHelpers;
import Common.helpers.Helpers;
import Setup.project.modals.CheckoutProcessOneModal;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.Hashtable;

public class CheckoutOneDataProvider {

    @Test(dataProvider = "getDataCheckoutOneHashTable1")
    public void testDataCheckoutOneHashTable1(Hashtable<String, String> data) {
        System.out.println("CheckoutData.Firstname = " + data.get(CheckoutProcessOneModal.getFirstname()));
        System.out.println("CheckoutData.Lastname = " + data.get(CheckoutProcessOneModal.getLastname()));
        System.out.println("CheckoutData.PostalCode = " + data.get(CheckoutProcessOneModal.getPostalCode()));
        System.out.println("CheckoutData.ErrorMess = " + data.get(CheckoutProcessOneModal.getErrorMess()));
        System.out.println("CheckoutData.CheckoutOneLink = " + data.get(CheckoutProcessOneModal.getCheckoutOneLink()));
        System.out.println("CheckoutData.CheckoutTwoLink = " + data.get(CheckoutProcessOneModal.getCheckoutTwoLink()));
        System.out.println("CheckoutData.CheckoutCompletedLink = " + data.get(CheckoutProcessOneModal.getCheckoutCompletedLink()));

    }

    @Test(dataProvider = "getDataCheckoutOneHashTable2")
    public void testDataCheckoutOneHashTable2(Hashtable<String, String> data) {
        System.out.println("CheckoutData.Firstname = " + data.get(CheckoutProcessOneModal.getFirstname()));
        System.out.println("CheckoutData.Lastname = " + data.get(CheckoutProcessOneModal.getLastname()));
        System.out.println("CheckoutData.PostalCode = " + data.get(CheckoutProcessOneModal.getPostalCode()));
        System.out.println("CheckoutData.ErrorMess = " + data.get(CheckoutProcessOneModal.getErrorMess()));
        System.out.println("CheckoutData.CheckoutOneLink = " + data.get(CheckoutProcessOneModal.getCheckoutOneLink()));
        System.out.println("CheckoutData.CheckoutTwoLink = " + data.get(CheckoutProcessOneModal.getCheckoutTwoLink()));
        System.out.println("CheckoutData.CheckoutCompletedLink = " + data.get(CheckoutProcessOneModal.getCheckoutCompletedLink()));

    }

    @Test(dataProvider = "getDataCheckoutOneHashTable3")
    public void testDataCheckoutOneHashTable3(Hashtable<String, String> data) {
        System.out.println("CheckoutData.Firstname = " + data.get(CheckoutProcessOneModal.getFirstname()));
        System.out.println("CheckoutData.Lastname = " + data.get(CheckoutProcessOneModal.getLastname()));
        System.out.println("CheckoutData.PostalCode = " + data.get(CheckoutProcessOneModal.getPostalCode()));
        System.out.println("CheckoutData.ErrorMess = " + data.get(CheckoutProcessOneModal.getErrorMess()));
        System.out.println("CheckoutData.CheckoutOneLink = " + data.get(CheckoutProcessOneModal.getCheckoutOneLink()));
        System.out.println("CheckoutData.CheckoutTwoLink = " + data.get(CheckoutProcessOneModal.getCheckoutTwoLink()));
        System.out.println("CheckoutData.CheckoutCompletedLink = " + data.get(CheckoutProcessOneModal.getCheckoutCompletedLink()));

    }

    @Test(dataProvider = "getDataCheckoutOneHashTable4")
    public void testDataCheckoutOneHashTable4(Hashtable<String, String> data) {
        System.out.println("CheckoutData.Firstname = " + data.get(CheckoutProcessOneModal.getFirstname()));
        System.out.println("CheckoutData.Lastname = " + data.get(CheckoutProcessOneModal.getLastname()));
        System.out.println("CheckoutData.PostalCode = " + data.get(CheckoutProcessOneModal.getPostalCode()));
        System.out.println("CheckoutData.ErrorMess = " + data.get(CheckoutProcessOneModal.getErrorMess()));
        System.out.println("CheckoutData.CheckoutOneLink = " + data.get(CheckoutProcessOneModal.getCheckoutOneLink()));
        System.out.println("CheckoutData.CheckoutTwoLink = " + data.get(CheckoutProcessOneModal.getCheckoutTwoLink()));
        System.out.println("CheckoutData.CheckoutCompletedLink = " + data.get(CheckoutProcessOneModal.getCheckoutCompletedLink()));

    }

    @Test(dataProvider = "getDataCheckoutOneHashTable5")
    public void testDataCheckoutOneHashTable5(Hashtable<String, String> data) {
        System.out.println("CheckoutData.Firstname = " + data.get(CheckoutProcessOneModal.getFirstname()));
        System.out.println("CheckoutData.Lastname = " + data.get(CheckoutProcessOneModal.getLastname()));
        System.out.println("CheckoutData.PostalCode = " + data.get(CheckoutProcessOneModal.getPostalCode()));
        System.out.println("CheckoutData.ErrorMess = " + data.get(CheckoutProcessOneModal.getErrorMess()));
        System.out.println("CheckoutData.CheckoutOneLink = " + data.get(CheckoutProcessOneModal.getCheckoutOneLink()));
        System.out.println("CheckoutData.CheckoutTwoLink = " + data.get(CheckoutProcessOneModal.getCheckoutTwoLink()));
        System.out.println("CheckoutData.CheckoutCompletedLink = " + data.get(CheckoutProcessOneModal.getCheckoutCompletedLink()));

    }

    @DataProvider(name = "getDataCheckoutOneHashTable1")
    public static Object[][] getDataCheckoutOneHashTable1() {
        ExcelHelpers excelHelpers = new ExcelHelpers();
        Object[][] data = excelHelpers.getDataHashTable(Helpers.getCurrentDir() + FrameworkConstants.EXCEL_DATA_FILE_PATH, "Checkout_Process", 1, 1);
        return data;
    }

    @DataProvider(name = "getDataCheckoutOneHashTable2")
    public static Object[][] getDataCheckoutOneHashTable2() {
        ExcelHelpers excelHelpers = new ExcelHelpers();
        Object[][] data = excelHelpers.getDataHashTable(Helpers.getCurrentDir() + FrameworkConstants.EXCEL_DATA_FILE_PATH, "Checkout_Process", 2, 2);
        return data;
    }

    @DataProvider(name = "getDataCheckoutOneHashTable3")
    public static Object[][] getDataCheckoutOneHashTable3() {
        ExcelHelpers excelHelpers = new ExcelHelpers();
        Object[][] data = excelHelpers.getDataHashTable(Helpers.getCurrentDir() + FrameworkConstants.EXCEL_DATA_FILE_PATH, "Checkout_Process", 3, 3);
        return data;
    }

    @DataProvider(name = "getDataCheckoutOneHashTable4")
    public static Object[][] getDataCheckoutOneHashTable4() {
        ExcelHelpers excelHelpers = new ExcelHelpers();
        Object[][] data = excelHelpers.getDataHashTable(Helpers.getCurrentDir() + FrameworkConstants.EXCEL_DATA_FILE_PATH, "Checkout_Process", 4, 4);
        return data;
    }

    @DataProvider(name = "getDataCheckoutOneHashTable5")
    public static Object[][] getDataCheckoutOneHashTable5() {
        ExcelHelpers excelHelpers = new ExcelHelpers();
        Object[][] data = excelHelpers.getDataHashTable(Helpers.getCurrentDir() + FrameworkConstants.EXCEL_DATA_FILE_PATH, "Checkout_Process", 5, 5);
        return data;
    }
}
