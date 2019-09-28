package starter.stepDefinitions;

import cucumber.api.java.en.And;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.openqa.selenium.WebDriver;
import starter.pageObjects.ProductPopup;

public class productPopupSteps {
    @Managed
    WebDriver driver;

    @Steps
    ProductPopup productPopup ;


    @And("^I proceed to checkout$")
    public void iProceedToCheckout()throws Throwable {
    productPopup.proceedtocheckout();
    }
}
