package org.Amazon.BeforeAfterMethod;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HomeTests {

    WebDriver driver;

    @BeforeMethod
    public void browserlaunchUrl() {

        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/src/test/resources/executables/chromedriver");
        driver = new ChromeDriver();

        // Maximizing the browser
        driver.manage().window().maximize();
        // opening the browser
        driver.get("https://www.amazon.in");
    }

    @Test(description = "Validate browser URL", priority = 0, invocationCount = 4, invocationTimeOut = 3000)
    public void TC_Title() {

        String title = driver.getTitle();
        Assert.assertEquals("Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in", "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in", "APPLICATION TITLE IS MATCHING....");
        System.out.println("Title of the application is:" + title);
    }

    @AfterMethod
    public void closeBrowser() {
        driver.quit();
    }
}
