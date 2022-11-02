package org.Amazon.BeforeAfterMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BeforeAfterMethod {

    WebDriver driver;

    @BeforeMethod
    public void openUrl() {

        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/src/test/resources/executables/chromedriver");
        driver = new ChromeDriver();

        // Maximizing the browser
        driver.manage().window().maximize();
        // opening the browser
        driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2Fref%3Dnav_ya_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&");
    }

    @Test(description = "Valid username and password", priority = 2)
    public void TC_login() throws InterruptedException {
        driver.findElement(By.id("ap_email")).sendKeys("rs.megha91@yahoo.com", Keys.ENTER);
        Assert.assertEquals("rs.megha91@yahoo.com", "rs.megha91@yahoo.com", "User Email address is VALID CASE.. ");
        // Continue Button
        driver.findElement(By.xpath("//*[@id='continue']")).click();
        driver.findElement(By.xpath("//*[@id=\"continue\"]")).click();
        // password has given and clicked on CTA
        // Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id='ap_password']")).sendKeys("$sanjeev143", Keys.ENTER);

    }

    @Test(description = "inValid username and password", priority = 1)
    public void TC_loginInvalid() throws InterruptedException {
        driver.findElement(By.id("ap_email")).sendKeys("rs.megha91@yahoo.co", Keys.ENTER);
        Assert.assertEquals("rs.megha91@yahoo.co", "rs.megha91@yahoo.com", "User Email address is INVALID CASE.. ");
        // Continue Button
        driver.findElement(By.xpath("//*[@id='continue']")).click();
        driver.findElement(By.xpath("//*[@id=\"continue\"]")).click();
        // password has given and clicked on CTA
        driver.findElement(By.xpath("//*[@id='ap_password']")).sendKeys("$sanjeev143", Keys.ENTER);

    }

    @AfterMethod
    public void closeBrowser() {
        driver.quit();
    }
}