package starter.pageObjects;

import cucumber.api.java.en.Then;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class MyPersonalInformationPage extends PageObject {

    @FindBy (xpath = "//i[@class='icon-user']")
    WebElement tab_personalInfo ;

    @FindBy(id = "firstname")
    WebElement field_firstname;

    @FindBy (id = "old_passwd")
    WebElement field_oldpass ;

    @FindBy (xpath = "//button[@name ='submitIdentity']")
    WebElement btn_save ;

    @FindBy (xpath = "//p[@class= 'alert alert-success']")
    WebElement message_success ;

    public void checkMyInfo() throws Exception{
        waitFor(ExpectedConditions.visibilityOf(tab_personalInfo));
    }

    public void clickmyinfo() throws Exception{
        tab_personalInfo.click();
    }

    public void editname(String name) throws Exception {
        field_firstname.clear();
        field_firstname.sendKeys(name);}

    public void enterpass(String pass) throws Exception{field_oldpass.sendKeys(pass);}

    public void entersave() throws Exception { btn_save.click(); }

    public void checksucces() throws Exception {
        waitFor(ExpectedConditions.visibilityOf(message_success));
    }





}
