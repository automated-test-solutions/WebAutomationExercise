package starter.pageObjects;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class SummaryPage extends PageObject {

    @FindBy (id="cart_title")
    WebElement shopping_cart ;

    @FindBy(xpath = "//a[@class= 'button btn btn-default standard-checkout button-medium']")
    WebElement ProceedToCheckout;

    public void checksummarypage() throws Exception{
        waitFor(ExpectedConditions.visibilityOf(shopping_cart));
    }

    public void proceedtocheckout () throws Exception{
        ProceedToCheckout.click();
    }
}
