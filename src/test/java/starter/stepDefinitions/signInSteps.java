package starter.stepDefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.openqa.selenium.WebDriver;
import starter.pageObjects.SignInPage;

public class signInSteps {

    @Managed
    WebDriver driver;

    @Steps
    SignInPage signInPage ;

    @Then("^I see sign in page$")
    public void iSeeSignInPage() throws Throwable{
        signInPage.checkloginpage();
    }

    @And("^I enter email address (.*)$")
    public void iEnterEmailAddressEmail( String email) throws Throwable {
        signInPage.enteremail(email);
    }

    @And("^I enter password (.*)$")
    public void iEnterPasswordPassword(String pass)throws Throwable {
        signInPage.enterpassword(pass);
    }

    @And("^I click Sign In button$")
    public void iClickSignInButton()throws Throwable {
        signInPage.clickSubmit();
    }



}
