import BaseData.BaseLibrary;
import BaseData.Browser;
import BaseData.UserData;
import Pages.LoginPage;
import Pages.SearchPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import static java.lang.Thread.sleep;

public class ChangeAccount extends Browser {

    LoginPage loginPage = new LoginPage();
    SearchPage searchPage = new SearchPage();
    BaseLibrary baseLibrary = new BaseLibrary();
    UserData userData = new UserData();

    @Test(description = "Hesap Değişimi Yapılır")
    public void changeAccount() throws InterruptedException {

        SelectAccount selectAccount = new SelectAccount();
        selectAccount.accountSelect();

        WebElement accountChange = driver.findElement(By.cssSelector("[class='account-dropdown-button']"));
        accountChange.click();
        sleep(5000);
        baseLibrary.screenshot();

        driver.findElement(By.xpath("//span[@class='profile-name' and text()='Jemree']")).click();
        sleep(5000);
        baseLibrary.screenshot();

    }
}
