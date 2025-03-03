import BaseData.BaseLibrary;
import BaseData.Browser;
import BaseData.UserData;
import Pages.LoginPage;
import Pages.SearchPage;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static java.lang.Thread.sleep;


public class SelectAccount extends Browser {

    Browser browser = new Browser();
    LoginPage loginPage = new LoginPage();
    BaseLibrary baseLibrary = new BaseLibrary();
    UserData userData = new UserData();
    SearchPage SearchPage = new SearchPage();

    @Test(description = "Hesap seçimi")
    public void accountSelect() throws InterruptedException {

        SuccessfulLogin successfulLogin = new SuccessfulLogin();
        successfulLogin.loginSuccessful();

        driver.findElements(By.cssSelector("[class='profile-icon']")).get(0).click();
        sleep(5000);
        baseLibrary.screenshot();

    }
}
