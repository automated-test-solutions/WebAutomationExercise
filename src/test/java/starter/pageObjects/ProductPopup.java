package starter.pageObjects;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductPopup extends PageObject {


    @FindBy(xpath = "//div[@class= 'layer_cart_cart col-xs-12 col-md-6']")
    WebElement productpopup ;

    @FindBy(xpath = "//a[@title ='Proceed to checkout']")
    WebElement btn_ProceedToCheckOut ;

    public void proceedtocheckout() throws Exception{
        //driver.switchTo().activeElement()
        btn_ProceedToCheckOut.click();
    }


}
