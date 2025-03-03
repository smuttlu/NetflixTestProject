import BaseData.BaseLibrary;
import BaseData.Browser;
import Pages.LoginPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class UnSuccessFulLogin extends Browser {

    LoginPage loginPage = new LoginPage();
    BaseLibrary baseLibrary = new BaseLibrary();

    @Test(description = "Başarısız Kullanıcı Girişi Testi")
    public void loginUnSuccessful() throws InterruptedException {

        driver.get("https://www.netflix.com/login");
        Thread.sleep(5000);
        driver.findElement(By.xpath("//button[@id='onetrust-accept-btn-handler' and text()='Kabul et']")).click();
        loginPage.fillEmail();
        loginPage.fillPass("<PASSWORD>");
        loginPage.clickLoginButton();
        Thread.sleep(4000);
        baseLibrary.screenshot();

        WebElement errorMessage = driver.findElement(By.xpath("//span[contains(text(), 'için parola yanlış')]"));
        System.out.println("Hata Mesajı: " + errorMessage.getText());
    }
}
