package Common.helpers;

import Common.utilities.LanguageUtils;
import Common.utilities.Log;
import io.qameta.allure.Step;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Properties;

public class PropertiesHelpers {

    private static Properties properties;
    private static String linkFile;
    private static FileInputStream file;
    private static FileOutputStream out;
    private static final String relPropertiesFilePathDefault = "src\\test\\resources\\config\\configs.properties";
    private static final String relPropertiesFileLocators = "src\\test\\resources\\config\\locators.properties";

    @Step("Loaded all properties files")
    public static Properties loadAllFiles() {
        LinkedList<String> files = new LinkedList<String>();
        files.add("src\\test\\resources\\config\\configs.properties");
        files.add("src\\test\\resources\\config\\DataTest.xlsx");
        files.add("src\\test\\resources\\config\\locators.properties");
        try {
            properties = new Properties();
            for (String f : files) {
                Properties tempProp = new Properties();
                linkFile = Helpers.getCurrentDir() + f;
                file = new FileInputStream(linkFile);
                tempProp.load(file);
                properties.putAll(tempProp);
            }
            Log.info("Loaded all properties files.");
            return properties;
        } catch (IOException ioe) {
            return new Properties();
        }
    }


    public static void setDefaultFile() {
        properties = new Properties();
        try {
            linkFile = Helpers.getCurrentDir() + relPropertiesFilePathDefault;
            file = new FileInputStream(linkFile);
            properties.load(file);
            file.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

//    public static String getValueLocators(String key) {
//        String keyVal = null;
//        System.out.println("KEY: " + key);
//
//        try {
//            if (file == null) {
//                properties = new Properties();
//                linkFile = Helpers.getCurrentDir() + relPropertiesFileLocators;
//                file = new FileInputStream(linkFile);
//                System.out.println("CCC: " + file);
//
//                properties.load(file);
//                keyVal = properties.getProperty(key);
////                file.close();
//
//            } else {
//                properties.load(file);
////                file.close();
//                System.out.println("DDD: " + file);
//
//                keyVal = properties.getProperty(key);
//                System.out.println("keyVal: " + keyVal);
//            }
////                file.close();
//
//            return LanguageUtils.convertCharset_ISO_8859_1_To_UTF8(keyVal);
//        } catch (Exception e) {
//            System.out.println(e.getMessage());
//        }
//        return keyVal;
//    }

    public static String getValueLocators(String key) {
        String keyval = null;
        try {
            properties = new Properties();
            linkFile = Helpers.getCurrentDir() + relPropertiesFileLocators;
            file = new FileInputStream(linkFile);
            properties.load(file);
            file.close();
            keyval = properties.getProperty(key);
            return LanguageUtils.convertCharset_ISO_8859_1_To_UTF8(keyval);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return keyval;
    }

    public static String getValue(String key) {
        String keyVal = null;
        try {
            if (file == null) {
                properties = new Properties();
                linkFile = Helpers.getCurrentDir() + relPropertiesFilePathDefault;
                file = new FileInputStream(linkFile);
                properties.load(file);
                file.close();
            }
            keyVal = properties.getProperty(key);
            return LanguageUtils.convertCharset_ISO_8859_1_To_UTF8(keyVal);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return keyVal;
    }

    public static void setValue(String key, String keyValue) {
        try {
            if (file == null) {
                properties = new Properties();
                file = new FileInputStream(Helpers.getCurrentDir() + relPropertiesFilePathDefault);
                properties.load(file);
                file.close();
                out = new FileOutputStream(Helpers.getCurrentDir() + relPropertiesFilePathDefault);
            }
            //Ghi vào cùng file Prop với file lấy ra
            out = new FileOutputStream(linkFile);
            System.out.println(linkFile);
            properties.setProperty(key, keyValue);
            properties.store(out, null);
            out.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}


//https://gpcoder.com/2720-lop-properties-trong-java/












