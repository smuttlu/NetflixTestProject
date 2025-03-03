package Pages;

import BaseData.BaseLibrary;
import BaseData.Browser;
import BaseData.UserData;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

public class LoginPage extends Browser {

    UserData userData = new UserData();
    BaseLibrary baseLibrary = new BaseLibrary();

    @Step("Email Alanını Doldurur")
    public LoginPage fillEmail() {
        driver.findElement(By.cssSelector("[autocomplete='email']")).sendKeys(userData.getEmail());
        return this;
    }

    @Step("Şifre Alanını Doldurur")
    public LoginPage fillPass() {
        driver.findElement(By.cssSelector("[autocomplete='password']")).sendKeys(userData.getPass());
        return this;
    }

    @Step("Şifre Alanını Yanlış Bilgi ile Doldurur")
    public LoginPage fillPass(String passwordd) {
        driver.findElement(By.cssSelector("[autocomplete='password']")).sendKeys(passwordd);
        return this;
    }

    @Step("Giriş Yap Butonuna Tıklanır")
    public LoginPage clickLoginButton() {
        driver.findElement(By.cssSelector("[class='pressable_styles__a6ynkg0 button_styles__1kwr4ym0  default-ltr-cache-1mbafvh e1ax5wel2']")).click();
        return this;
    }
}
