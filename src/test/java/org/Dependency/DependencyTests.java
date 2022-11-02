package org.Dependency;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.Test;

public class DependencyTests {


    WebDriver driver;

    @Test
    public void TC_launchURL()
    {
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/src/test/resources/executables/chromedriver");
        driver =new ChromeDriver();
        driver.get("https://www.meesho.com/");
    }

    @Test
    public void TC_maximizeBrowser()
    {
        //driver.get("https://www.meesho.com/");
        driver.manage().window().maximize();
    }

    @Test(dependsOnMethods = {"TC_maximizeBrowser","TC_launchURL"})
    public void TC_testTitle()
    {
        String title =driver.getTitle();
        System.out.println(title);

        Assert.assertEquals(title,"Online Shopping Site for Fashion, Electronics, Home & More | Meesho");
    }


    @AfterSuite
    public void closeBrowser() {
        driver.close();
    }
}
