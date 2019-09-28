package starter.stepDefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import starter.pageObjects.MyPersonalInformationPage;

public class mypersonalinformationStep {

    @Managed
    WebDriver driver;

    @Steps
    MyPersonalInformationPage myPersonalInformationPage;

    @Then("^I see my-account page$")
    public void iSeeMyAccountPage() throws Throwable {
        myPersonalInformationPage.checkMyInfo();
    }


    @And("^I click my personal information button$")
    public void iClickMyPersonalInformationButton() throws Throwable{
        myPersonalInformationPage.clickmyinfo();
    }

    @And("^I update my first name (.*)$")
    public void iUpdateMyFirstNameUpdatedName(String name)throws Throwable {
        myPersonalInformationPage.editname(name);
    }

    @And("^I enter my current password (.*)")
    public void iEnterMyCurrentPassword(String pass)throws Throwable {
        myPersonalInformationPage.enterpass(pass);
    }

    @And("^I click save button$")
    public void iClickSaveButton()throws Throwable {
        myPersonalInformationPage.entersave();
    }

    @Then("^I see success message$")
    public void iSeeSuccessMessage()throws Throwable {
        myPersonalInformationPage.checksucces();
    }



}
