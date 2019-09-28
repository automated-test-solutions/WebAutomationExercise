package starter.pageObjects;

import cucumber.api.java.es.E;
import net.serenitybdd.core.pages.PageObject;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class OrderhistoryPage extends PageObject {

    @FindBy (xpath = "//i[@class='icon-list-ol']")
    WebElement tab_orderhistory ;



    public void clickorderhistory() throws Exception{
        waitFor(ExpectedConditions.visibilityOf(tab_orderhistory));
        tab_orderhistory.click();
    }

    public void checkorderHistory(WebDriver driver) throws Exception {
        String expected = "http://automationpractice.com/index.php?controller=history" ;

        String actualURL= driver.getCurrentUrl();

       Assert.assertEquals(expected,actualURL);

    }


}
