package Setup.project.pages.ProductsDetail;
import Common.constants.FrameworkConstants;
import Common.handle.WebUI;
import Common.helpers.ExcelHelpers;
import Common.utilities.Log;
import Common.utilities.ObjectUtils;
import Setup.project.modals.ProductDetailModal;
import Setup.project.pages.Cart.CartPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

import static Common.handle.WebUI.getWebElements;
public class ProductDetailsPage {

    private String nowPageTitle = "Swag Labs";
    public By nameProducts = ObjectUtils.getByLocatorFromConfig("nameProducts");

    private By backButton = ObjectUtils.getByLocatorFromConfig("backButton");
    private By imageProdDetail = ObjectUtils.getByLocatorFromConfig("imageProdDetail");
    private By nameProdDetail = ObjectUtils.getByLocatorFromConfig("nameProdDetail");
    private By desProdDetail = ObjectUtils.getByLocatorFromConfig("desProdDetail");
    private By priceProdDetail = ObjectUtils.getByLocatorFromConfig("priceProdDetail");
    private By addBtnProdDetail = ObjectUtils.getByLocatorFromConfig("addBtnProdDetail");
    private By removeBtnProdDetail = ObjectUtils.getByLocatorFromConfig("removeBtnProdDetail");
    private By numDetailInCard = ObjectUtils.getByLocatorFromConfig("numDetailInCard");

    ExcelHelpers excelHelpers = new ExcelHelpers();

    public CartPage getProductsDetail() {
        excelHelpers.setExcelFile(FrameworkConstants.EXCEL_DATA_FILE_PATH, "Product_detail");
        List<WebElement> totalRows = getWebElements(By.xpath("//div[@class='inventory_item']"));
        if (totalRows.size() < 1) {
            Log.info("Not found product name");
        } else {
            for (int i = 1; i <= totalRows.size(); i++) {
                By name = By.xpath("//div[1]/div[" + i + "]/div[@class='inventory_item_description']/div[1]/a[1]/div[1]");
                WebUI.clickElement(name);
                WebUI.waitForPageLoaded();
                Assert.assertTrue(WebUI.verifyPageUrl(excelHelpers.getCellData(i, ProductDetailModal.getProductLink())), "Link of product detail page not match.");
                Assert.assertTrue(WebUI.verifyElementTextEquals(nameProdDetail,excelHelpers.getCellData(i,ProductDetailModal.getProductName())),"Name don't equals");
                Assert.assertTrue(WebUI.verifyElementTextEquals(desProdDetail,excelHelpers.getCellData(i,ProductDetailModal.getProductDescription())),"Description don't equals");
                Assert.assertTrue(WebUI.verifyElementTextContains(priceProdDetail,excelHelpers.getCellData(i,ProductDetailModal.getProductPrice())),"Price don't equals");
                Assert.assertTrue(WebUI.verifyImagesIsNotBroken(imageProdDetail),"[Prod detail] Image is not broken");
                //Add products to cart and compare with number of products in cart
                WebUI.clickElement(addBtnProdDetail);
                Assert.assertTrue(WebUI.verifyElementTextEquals(numDetailInCard, "1"), "[In product detail] Add product to cart is error");
                //Remove products from cart and compare with number of products in cart
                WebUI.clickElement(removeBtnProdDetail);
                Assert.assertTrue(WebUI.verifyElementNotPresent(numDetailInCard), "[In product detail] Remove product from cart is error");
                WebUI.clickElement(backButton);
                WebUI.waitForPageLoaded();
                boolean flag = getWebElements(nameProducts).size() > 1 ? true:false;
                Assert.assertTrue(flag,"Click on back button is error");
            }
        }

    return new CartPage();
    }

}
