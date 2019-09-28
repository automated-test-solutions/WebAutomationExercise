package starter.pageObjects;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class AddressPage extends PageObject {
    @FindBy (xpath = "//button[@name= 'processAddress']")
    WebElement btn_proceedtocheckout ;

    public void checkAddressPage() throws Exception{
        waitFor(ExpectedConditions.visibilityOf(btn_proceedtocheckout));
    }

    public void clickProceed()throws Exception{
        btn_proceedtocheckout.click();
    }


}
