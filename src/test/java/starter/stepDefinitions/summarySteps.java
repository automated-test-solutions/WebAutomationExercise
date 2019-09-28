package starter.stepDefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.openqa.selenium.WebDriver;
import starter.pageObjects.SummaryPage;

public class summarySteps {
    @Managed
    WebDriver driver;

    @Steps
    SummaryPage summaryPage;

    @Then("^I see shopping-cart summary$")
    public void iSeeShoppingCartSummary() throws Throwable{
        summaryPage.checksummarypage();
    }

    @When("^I proceed to summary-checkout$")
    public void iProceedToSummaryCheckout()throws Throwable {
        summaryPage.proceedtocheckout();
    }
}
