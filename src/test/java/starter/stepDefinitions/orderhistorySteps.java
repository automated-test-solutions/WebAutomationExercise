package starter.stepDefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.openqa.selenium.WebDriver;
import starter.pageObjects.OrderhistoryPage;

public class orderhistorySteps {
    @Managed
    WebDriver driver;

    @Steps
    OrderhistoryPage orderhistoryPage ;

    @And("^I click order history and details$")
    public void iClickOrderHistoryAndDetails() throws Throwable{
        orderhistoryPage.clickorderhistory();
    }

    @Then("^I see my recently purchased order$")
    public void iSeeMyRecentlyPurchasedOrder() throws Throwable{
        orderhistoryPage.checkorderHistory(driver);
    }
}
