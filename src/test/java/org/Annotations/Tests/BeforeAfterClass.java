package org.Annotations.Tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class BeforeAfterClass {

 WebDriver driver;
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


    @BeforeClass
    public void beforeClass()
    {
        System.out.println("This is my precondition area");
    }


    @AfterClass
    public void afterClass()
    {
        System.out.println("This is my postcondition area");
    }
}
