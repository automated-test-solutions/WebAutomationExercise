package starter.stepDefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.openqa.selenium.WebDriver;
import starter.navigation.NavigateTo;
import starter.pageObjects.HomePage;


public class homeSteps {

    @Managed
    WebDriver driver;

    @Steps
    HomePage homePage ;

    @Steps
    NavigateTo navigateTo;


    @Given("^I am on the AutomationPractice home page$")
    public void iAmOnTheAutomationPracticeHomePage() throws Throwable{
        navigateTo.theAutomationPracticeHomePage();
    }


    @When("^I clicks the T-Shirt tab$")
    public void iClicksTheTShirtTab() throws Exception{
        homePage.ClickTshirtTab();
    }

    @When("^I navigate to my account$")
    public void iNavigateToMyAccount()throws Throwable {
        homePage.clickMyaccount();
    }

    @And("^I sign out from my account$")
    public void iSignOutFromMyAccount() throws Throwable{
        homePage.logout();
    }

    @And("^I click sign in option$")
    public void iClickSignInOption() throws Throwable{
        homePage.login();
    }
}
