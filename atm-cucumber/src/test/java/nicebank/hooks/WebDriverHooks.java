package nicebank.hooks;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriverException;
import support.KnowsMyDomain;

public class WebDriverHooks {

    private KnowsMyDomain helper;

    public WebDriverHooks(KnowsMyDomain helper) {
        this.helper = helper;
    }

    @After
    public void finish(Scenario scenario) {
        try {
            byte[] screenshot = ((TakesScreenshot)helper.getWebDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.embed(screenshot, "image/png");
        } catch (WebDriverException SomePlatformsDontSupportScreens) {
            System.err.println(SomePlatformsDontSupportScreens.getMessage());
        } finally {
            helper.getWebDriver().close();
        }
    }
}
