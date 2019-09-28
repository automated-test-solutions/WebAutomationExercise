package starter.pageObjects;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class ShippingPage extends PageObject {

    @FindBy (id = "uniform-cgv")
    WebElement TnCcheckBox ;

    @FindBy (xpath = "//button[@name= 'processCarrier']")
    WebElement btn_proceedtocheckout;

    public void checkshippingpage() throws Exception {
        waitFor(ExpectedConditions.visibilityOf(TnCcheckBox));
    }

    public void selectCheckbox () throws Exception {
        TnCcheckBox.click();
    }

    public void selectproceed () throws Exception {
        btn_proceedtocheckout.click();
    }

}
