package starter.navigation;

import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.WebDriver;

public class NavigateTo {
    @Managed
    WebDriver driver;

    AutomationPracticeHomePage automationPracticeHomePage;

    @Step("Open the automationpractice home page")
    public void theAutomationPracticeHomePage() {
        automationPracticeHomePage.open();
    }
}
