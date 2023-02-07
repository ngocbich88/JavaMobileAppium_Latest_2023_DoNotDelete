import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class LoginTest {
    AndroidDriver driver;

    @BeforeTest
    public void setUp() throws MalformedURLException {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("platformName", "Android");
        caps.setCapability("platformVersion", "13");
        caps.setCapability("automationName", "UiAutomator2");
        caps.setCapability("app", System.getProperty("user.dir") + "/apps/app-release.apk");
        caps.setCapability("deviceName", "emulator-5554");
        driver = new AndroidDriver(new URL("http://localhost:4723/wd/hub"), caps);
    }

    @Test
    public void loginSucessTest() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.typeUserName();
        loginPage.typePassword();
        loginPage.clickLogin();
    }

    @Test
    public void loginFailedTest() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.typeUserName();
        loginPage.typePassword();
        loginPage.clickLogin();
    }

    @AfterTest
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }

}
