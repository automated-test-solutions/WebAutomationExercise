package starter.pageObjects;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;


public class HomePage extends PageObject {

    //*****************locators****************//
    @FindBy(xpath = "(//a[@title = 'T-shirts'])[2]")
    WebElement tab_Tshirt;

    @FindBy(xpath = "//a[@title='View my customer account']")
    WebElement tab_myAccount ;

    @FindBy (xpath = "//a[@class= 'logout']")
    WebElement btn_signout;

    @FindBy (xpath = "//a[@class= 'login']")
    WebElement btn_signin;

    //*****************************************//

    public void ClickTshirtTab() throws Exception{
        waitFor(ExpectedConditions.visibilityOf(tab_Tshirt));
        tab_Tshirt.click();
    }

    public void clickMyaccount () throws Exception{
        waitFor(ExpectedConditions.visibilityOf(tab_myAccount));
        tab_myAccount.click();
    }

    public void logout() throws Exception {btn_signout.click();}

    public void login() throws Exception {btn_signin.click();}

  }
