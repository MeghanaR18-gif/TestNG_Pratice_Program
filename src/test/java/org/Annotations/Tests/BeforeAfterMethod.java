package org.Annotations.Tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class BeforeAfterMethod {

    WebDriver driver;

    @BeforeMethod
    public void beforeMethod()
    {
        System.out.println(" Application URL validation");
    }


    @Test
    public void TC_applicationURL()
    {
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/src/test/resources/executables/chromedriver");
        driver =new ChromeDriver();
        driver.get("https://www.meesho.com/");
        String title =driver.getTitle();
        System.out.println(title);
        Assert.assertEquals(title,"Online Shopping Site for Fashion, Electronics, Home & More | Meesho");
    }

    @Test
    public void TC_loginClicked()
    {
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/src/test/resources/executables/chromedriver");
        driver =new ChromeDriver();
        driver.get("https://www.meesho.com/auth?redirect=https%3A%2F%2Fwww.meesho.com%2F&source=profile&entry=header&screen=HP");
        String title =driver.getTitle();
        System.out.println(title);
        Assert.assertEquals(title,"Meesho");

    }

    @AfterMethod
    public void afterMethod()
    {
        System.out.println("Close the Application URL");
    }
}
