package starter.stepDefinitions;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.openqa.selenium.WebDriver;
import starter.pageObjects.AddressPage;

public class addressSteps {
    @Managed
    WebDriver driver;

    @Steps
    AddressPage addressPage;


    @Then("^I see Address details$")
    public void iSeeAddressDetails() throws Throwable {
        addressPage.checkAddressPage();
    }

    @When("^I proceed to address-checkout$")
    public void iProceedToAddressCheckout() throws Throwable {
        addressPage.clickProceed();
    }


}
