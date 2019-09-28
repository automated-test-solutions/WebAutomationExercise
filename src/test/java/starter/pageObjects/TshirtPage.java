package starter.pageObjects;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class TshirtPage extends PageObject {

    @FindBy(xpath = "//h1 [@class= 'page-heading product-listing']")
    WebElementFacade product_Tshirts ;

    @FindBy(xpath = "//i[@class='icon-th-list']")
    WebElementFacade product_Listview ;

    @FindBy (xpath = "(//img [@class= 'replace-2x img-responsive'])[2]")
    WebElementFacade product_Image ;

    @FindBy (xpath = "//a [@title= 'Add to cart']")
    WebElementFacade btn_AddToCart ;

    public void ShowAvailableTshirts ()throws Exception{
        waitFor(ExpectedConditions.visibilityOf(product_Tshirts));
    }

    public void clickProduct () throws Exception {product_Image.click();}

    public void clickListView () throws Exception{product_Listview.click();}

    public void clickAddToCart () throws Exception {
        btn_AddToCart.click();}


}
