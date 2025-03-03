import BaseData.BaseLibrary;
import BaseData.Browser;
import Pages.LoginPage;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static java.lang.Thread.sleep;

public class SuccessfulLogin extends Browser {

    LoginPage loginPage = new LoginPage();
    BaseLibrary baseLibrary = new BaseLibrary();

    @Test(description = "Başarılı Kullanıcı Girişi Testi")
    public void loginSuccessful() throws InterruptedException {

        driver.get("https://www.netflix.com/login");
        sleep(5000);
        driver.findElement(By.xpath("//button[@id='onetrust-accept-btn-handler' and text()='Kabul et']")).click();
        loginPage.fillEmail();
        loginPage.fillPass();
        loginPage.clickLoginButton();
        baseLibrary.screenshot();
        sleep(5000);
        baseLibrary.screenshot();

    }
}
