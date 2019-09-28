package starter.pageObjects;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class SignInPage extends PageObject {

    @FindBy (id = "email")
    WebElement input_email ;

    @FindBy (id = "passwd")
    WebElement input_password ;

    @FindBy(id = "SubmitLogin")
    WebElement btn_Submit ;

    public void checkloginpage() throws Exception {
        waitFor(ExpectedConditions.visibilityOf(input_email)) ;
    }

    public void enteremail (String email) throws Exception { input_email.sendKeys(email); }

    public void enterpassword(String pass) throws Exception{ input_password.sendKeys(pass); }

    public void clickSubmit() throws Exception {btn_Submit.click();}

}
