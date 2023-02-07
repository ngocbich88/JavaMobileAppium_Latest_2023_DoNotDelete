import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class LoginPage extends BasePage {
    public LoginPage(AppiumDriver appiumDriver) {
        super((appiumDriver));
    }

    @AndroidFindBy(id = "com.example.ngocapp:id/username")
    MobileElement userNameTxt;
    public void typeUserName() {
        sendKeys(userNameTxt, "ngoc ngoc");
    }

    @AndroidFindBy(id = "com.example.ngocapp:id/password")
    MobileElement passwordTxt;
    public void typePassword() {
        sendKeys(passwordTxt, "ngoc ngoc");
    }

    @AndroidFindBy(id ="com.example.ngocapp:id/login")
    MobileElement loginBtn;
    public void clickLogin() {
        click(loginBtn);
    }
}
