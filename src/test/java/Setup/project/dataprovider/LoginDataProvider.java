package Setup.project.dataprovider;

import Common.constants.FrameworkConstants;
import Common.helpers.ExcelHelpers;
import Common.helpers.Helpers;
import Setup.project.modals.LoginModal;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.Hashtable;

public final class LoginDataProvider {

    private LoginDataProvider() {
    }

    @Test(dataProvider = "getLoginDataHashTable1")
    public void testGetLoginData1(Hashtable<String, String> data) {
        System.out.println("loginData.username = " + data.get(LoginModal.getUsername()));
        System.out.println("loginData.password = " + data.get(LoginModal.getPassword()));
        System.out.println("loginData.expectedError = " + data.get(LoginModal.getExpectedError()));
    }
    @Test(dataProvider = "getLoginDataHashTable2")
    public void testGetLoginData2(Hashtable<String, String> data) {
        System.out.println("loginData.username = " + data.get(LoginModal.getUsername()));
        System.out.println("loginData.password = " + data.get(LoginModal.getPassword()));
        System.out.println("loginData.expectedError = " + data.get(LoginModal.getExpectedError()));
    }

    @Test(dataProvider = "getLoginDataHashTable3")
    public void testGetLoginData3(Hashtable<String, String> data) {
        System.out.println("loginData.username = " + data.get(LoginModal.getUsername()));
        System.out.println("loginData.password = " + data.get(LoginModal.getPassword()));
        System.out.println("loginData.expectedError = " + data.get(LoginModal.getExpectedError()));
    }
    @Test(dataProvider = "getLoginDataHashTable4")
    public void testGetLoginData4(Hashtable<String, String> data) {
        System.out.println("loginData.username = " + data.get(LoginModal.getUsername()));
        System.out.println("loginData.password = " + data.get(LoginModal.getPassword()));
        System.out.println("loginData.expectedError = " + data.get(LoginModal.getExpectedError()));
    }
    @Test(dataProvider = "getLoginDataHashTable5")
    public void testGetLoginData5(Hashtable<String, String> data) {
        System.out.println("loginData.username = " + data.get(LoginModal.getUsername()));
        System.out.println("loginData.password = " + data.get(LoginModal.getPassword()));
        System.out.println("loginData.expectedError = " + data.get(LoginModal.getExpectedError()));
    }
    @Test(dataProvider = "getLoginDataHashTable6")
    public void testGetLoginData6(Hashtable<String, String> data) {
        System.out.println("loginData.username = " + data.get(LoginModal.getUsername()));
        System.out.println("loginData.password = " + data.get(LoginModal.getPassword()));
        System.out.println("loginData.expectedError = " + data.get(LoginModal.getExpectedError()));
    }
    @Test(dataProvider = "getLoginDataHashTable7")
    public void testGetLoginData7(Hashtable<String, String> data) {
        System.out.println("loginData.username = " + data.get(LoginModal.getUsername()));
        System.out.println("loginData.password = " + data.get(LoginModal.getPassword()));
        System.out.println("loginData.expectedError = " + data.get(LoginModal.getExpectedError()));
    }
    
    @DataProvider(name = "getLoginDataHashTable1")
    public static Object[][] getLoginData1() {
        ExcelHelpers excelHelpers = new ExcelHelpers();
        Object[][] data = excelHelpers.getDataHashTable(Helpers.getCurrentDir() + FrameworkConstants.EXCEL_DATA_FILE_PATH, "Login", 1, 1);
        return data;
    }
    @DataProvider(name = "getLoginDataHashTable2")
    public static Object[][] getLoginData2() {
        ExcelHelpers excelHelpers = new ExcelHelpers();
        Object[][] data = excelHelpers.getDataHashTable(Helpers.getCurrentDir() + FrameworkConstants.EXCEL_DATA_FILE_PATH, "Login", 2, 2);
        return data;
    }
    @DataProvider(name = "getLoginDataHashTable3")
    public static Object[][] getLoginData3() {
        ExcelHelpers excelHelpers = new ExcelHelpers();
        Object[][] data = excelHelpers.getDataHashTable(Helpers.getCurrentDir() + FrameworkConstants.EXCEL_DATA_FILE_PATH, "Login", 3, 3);
        return data;
    }
    @DataProvider(name = "getLoginDataHashTable4")
    public static Object[][] getLoginData4() {
        ExcelHelpers excelHelpers = new ExcelHelpers();
        Object[][] data = excelHelpers.getDataHashTable(Helpers.getCurrentDir() + FrameworkConstants.EXCEL_DATA_FILE_PATH, "Login", 4, 4);
        return data;
    }
    @DataProvider(name = "getLoginDataHashTable5")
    public static Object[][] getLoginData5() {
        ExcelHelpers excelHelpers = new ExcelHelpers();
        Object[][] data = excelHelpers.getDataHashTable(Helpers.getCurrentDir() + FrameworkConstants.EXCEL_DATA_FILE_PATH, "Login", 5, 5);
        return data;
    }
    @DataProvider(name = "getLoginDataHashTable6")
    public static Object[][] getLoginData6() {
        ExcelHelpers excelHelpers = new ExcelHelpers();
        Object[][] data = excelHelpers.getDataHashTable(Helpers.getCurrentDir() + FrameworkConstants.EXCEL_DATA_FILE_PATH, "Login", 6, 6);
        return data;
    }
    @DataProvider(name = "getLoginDataHashTable7")
    public static Object[][] getLoginData7() {
        ExcelHelpers excelHelpers = new ExcelHelpers();
        Object[][] data = excelHelpers.getDataHashTable(Helpers.getCurrentDir() + FrameworkConstants.EXCEL_DATA_FILE_PATH, "Login", 7, 7);
        return data;
    }
    
}