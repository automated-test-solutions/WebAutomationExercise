package starter.stepDefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.openqa.selenium.WebDriver;
import starter.pageObjects.PaymentsPage;

public class paymentsSteps {
    @Managed
    WebDriver driver;

    @Steps
    PaymentsPage paymentsPage ;

    @Then("^I see Payments page$")
    public void iSeePaymentsPage() throws Throwable {
        paymentsPage.checkpaymentpage();
    }


    @And("^I select to pay by bank wire$")
    public void iSelectToPayByBankWire() throws Throwable{
        paymentsPage.clickpay();
    }

    @And("^I confirm my order$")
    public void iConfirmMyOrder() throws Throwable{
        paymentsPage.clickProceed();
    }

    @Then("^I see order confirmation page$")
    public void iSeeOrderConfirmationPage() throws Throwable {
        paymentsPage.checkOrderComplete();
    }

    @And("^I capture order reference number$")
    public void iCaptureOrderReferenceNumber() throws Throwable{
        //Future enhancement -- capture precise data and then compare
       // paymentsPage.captureorderreference();
    }
}
