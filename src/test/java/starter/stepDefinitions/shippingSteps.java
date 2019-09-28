package starter.stepDefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.openqa.selenium.WebDriver;
import starter.pageObjects.ShippingPage;

public class shippingSteps {

    @Managed
    WebDriver driver;

    @Steps
    ShippingPage shippingPage;

    @Then("^I see shipping details$")
    public void iSeeShippingDetails() throws Throwable {
        shippingPage.checkshippingpage();
    }

    @And("^I accept terms and conditions$")
    public void iAcceptTermsAndConditions() throws Throwable {
        shippingPage.selectCheckbox();
    }

    @When("^I proceed to shipping-checkout$")
    public void iProceedToShippingCheckout() throws Throwable {
        shippingPage.selectproceed();
    }
}
