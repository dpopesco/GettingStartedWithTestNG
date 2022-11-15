package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class UiPluralsightTest {

    WebDriver driver;

    @BeforeMethod
    public void startUpBrowser() {
        String localDir = System.getProperty("user.dir");
        System.setProperty("web-driver.chrome.driver", localDir + "/chromedriver.exe");

        driver = new ChromeDriver();
        driver.get("https://pluralsight.com");

        doBasicCheck();
    }

    @Test(description = "No exception thrown by findElement considered a successful test")
    public void checkLoginButtonIsPresent() {
        driver.findElement(By.className("menu-a"));
    }

    @AfterMethod(alwaysRun = true)
    public void closeBrowser() {
        System.out.println("Closing down the browser");
        driver.close();
    }

    private void doBasicCheck() {
        driver.findElement(By.className("ps-nav-brand"));
    }

}
