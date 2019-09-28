package starter.pageObjects;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PaymentsPage extends PageObject {

    @FindBy(xpath = "//a[@title='Pay by bank wire']")
    WebElement tab_paybyWire ;

    @FindBy(xpath = "//a[@title='Pay by check.']")
    WebElement tab_paybycheck ;

    @FindBy(xpath = "//button[@class ='button btn btn-default button-medium']")
    WebElement btn_proceedtocheckout ;

    @FindBy(xpath = "//p[@class= 'cheque-indent']")
    WebElement text_OrderComplete ;

    @FindBy (xpath = "//div[@class='box']/text()[preceding-sibling::br][9]")
    WebElementFacade orderreference ;

    public void checkpaymentpage(){
        waitFor(ExpectedConditions.visibilityOf(tab_paybyWire));
    }

    public void clickpay() {
        tab_paybyWire.click();
    }

    public void clickProceed(){
        waitFor(ExpectedConditions.visibilityOf(btn_proceedtocheckout));
        btn_proceedtocheckout.click();
    }

    public void checkOrderComplete() throws Exception{
        waitFor(ExpectedConditions.visibilityOf(text_OrderComplete));
    }

    public void captureorderreference () throws Exception{
        //TO DO Capture the exact order number from the webelement
        waitFor(ExpectedConditions.visibilityOf(orderreference));
        Pattern p = Pattern.compile("\\d+");
        Matcher m = p.matcher(orderreference.getText());
        while(m.find()) {
            System.out.println(m.group());
        }

    }

}
