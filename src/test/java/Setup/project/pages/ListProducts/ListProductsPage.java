package Setup.project.pages.ListProducts;

import Common.constants.FrameworkConstants;
import Common.handle.WebUI;
import Common.helpers.ExcelHelpers;
import Common.utilities.Log;
import Common.utilities.ObjectUtils;
import Setup.project.modals.ListProductsModal;
import Setup.project.pages.Cart.CartPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.Hashtable;
import java.util.List;

import static Common.handle.WebUI.getWebElements;

public class ListProductsPage {

    private String nowPageTitle = "Swag Labs";
    public By sortButton = ObjectUtils.getByLocatorFromConfig("sortButton");
    public By nameProducts = ObjectUtils.getByLocatorFromConfig("nameProducts");
    public By priceProducts = ObjectUtils.getByLocatorFromConfig("pricesProducts");
    public By imageProducts = ObjectUtils.getByLocatorFromConfig("imageProducts");
    public By numInCart = ObjectUtils.getByLocatorFromConfig("numInCart");


    ExcelHelpers excelHelpers = new ExcelHelpers();

    public CartPage getAllProducts(Hashtable<String, String> data) {
        excelHelpers.setExcelFile(FrameworkConstants.EXCEL_DATA_FILE_PATH, "Home");
        Assert.assertTrue(WebUI.verifyPageTitle(nowPageTitle), "The title of Login page not match.");
        List<WebElement> totalRows = getWebElements(By.xpath("//div[@class='inventory_item']"));
        if (totalRows.size() < 1) {
            Log.info("Not found product name");
        } else {
            for (int i = 1; i <= totalRows.size(); i++) {
                By name = By.xpath("//div[1]/div[" + i + "]/div[@class='inventory_item_description']/div[1]/a[1]/div[1]");
                By des = By.xpath("//div[1]/div[" + i + "]/div[@class='inventory_item_description']/div[1]/div[1]");
                By price = By.xpath("//div[" + i + "]/div[2]/div[@class='pricebar']/div[@class='inventory_item_price']");
                WebUI.scrollToElement(name);
                Assert.assertTrue(WebUI.verifyElementTextEquals(name, excelHelpers.getCellData(i, ListProductsModal.getProductName())), "[Name] Row " + i + "don't equals");
                Assert.assertTrue(WebUI.verifyElementTextEquals(des, excelHelpers.getCellData(i, ListProductsModal.getProductDescription())), "[Description] Row " + i + "don't equals");
                Assert.assertTrue(WebUI.verifyElementTextContains(price, excelHelpers.getCellData(i, ListProductsModal.getProductPrice())), "[Price] Row " + i + "don't equals");
            }
        }
        return new CartPage();
    }


    public CartPage testSortProductA_Z() throws Exception {
        Assert.assertTrue(WebUI.verifyPageTitle(nowPageTitle), "The title of Home page not match.");
        //Sort A - Z
        WebUI.selectOptionByValue(sortButton, "az");
        Assert.assertTrue(WebUI.verifyTextWhenSortingA_Z(nameProducts), "Sort A-Z unsuccessfully");
        return new CartPage();
    }

    public CartPage testSortProductFromZ_A() throws Exception {
        Assert.assertTrue(WebUI.verifyPageTitle(nowPageTitle), "The title of Home page not match.");
        //Sort Z-A
        WebUI.selectOptionByValue(sortButton, "za");
        Assert.assertTrue(WebUI.verifyTextWhenSortingZ_A(nameProducts), "Sort Z-A unsuccessfully");
        return new CartPage();
    }


    public CartPage testSortProductLow_High() throws Exception {
        Assert.assertTrue(WebUI.verifyPageTitle(nowPageTitle), "The title of Home page not match.");
        //Sort Price: Low - High
        WebUI.selectOptionByValue(sortButton, "lohi");
        Assert.assertTrue(WebUI.verifyTextWhenSortingLow_High(priceProducts), "Sort Price: Low-High unsuccessfully");
        return new CartPage();
    }

    public CartPage testSortProductHigh_Low() throws Exception {
        Assert.assertTrue(WebUI.verifyPageTitle(nowPageTitle), "The title of Home page not match.");
        //Sort Price: High - Low
        WebUI.selectOptionByValue(sortButton, "hilo");
        Assert.assertTrue(WebUI.verifyTextWhenSortingHigh_Low(priceProducts), "Sort Price: High-Low unsuccessfully");
        return new CartPage();
    }

    public CartPage testAddProducts() {
        Assert.assertTrue(WebUI.verifyPageTitle(nowPageTitle), "The title of Home page not match");
        //Add products to cart and compare with number of products in cart
        Assert.assertTrue(WebUI.checkEqualsNumberInProductWhenAddedInList(nameProducts, numInCart), "Add product to cart is error");
        return new CartPage();
    }
    public CartPage testRemoveProducts() {
        Assert.assertTrue(WebUI.verifyPageTitle(nowPageTitle), "The title of Home page not match");
        //Add products to cart and compare with number of products in cart
        Assert.assertTrue(WebUI.checkEqualsNumberInProductWhenAddedInList(nameProducts, numInCart), "Add product to cart is error");

        //Remove products from cart and compare with number of products in cart
        Assert.assertTrue(WebUI.checkEqualsNumberInProductWhenRemoveInList(nameProducts, numInCart), "Remove product from cart is error");

        return new CartPage();
    }

    public CartPage testImageIsNotBroken() {
        Assert.assertTrue(WebUI.verifyPageTitle(nowPageTitle), "The title of Home page not match");

        //Test image in not broken
        Assert.assertTrue(WebUI.verifyImagesIsNotBroken(imageProducts), "Add product to cart is error");

        return new CartPage();
    }

}

