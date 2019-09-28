package starter.stepDefinitions;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pageObjects.HomePage;
import starter.pageObjects.TshirtPage;

public class tshirtSteps {

    @Steps
    HomePage homePage ;

    @Steps
    TshirtPage tshirtPage;

    @Then("^I see available T-Shirts$")
    public void iSeeAvailableTShirts() throws Throwable{
        tshirtPage.ShowAvailableTshirts();
    }


    @When("^I add a Tshirt to card$")
    public void iAddATshirtToCard()throws Throwable {
        tshirtPage.clickListView();
      //  tshirtPage.clickProduct();
        tshirtPage.clickAddToCart();
    }
}
