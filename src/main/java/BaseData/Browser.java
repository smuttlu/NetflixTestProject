package BaseData;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Browser {

    public static WebDriver driver;

    @BeforeMethod
    public void openBrowser() {

        driver = new ChromeDriver();
        driver.manage().window().maximize();

    }

    @AfterMethod
    public void closeBrowser() {

        driver.quit();

    }
}

