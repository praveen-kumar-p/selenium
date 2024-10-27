package org.example.ex_26102024;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

import static org.example.ex_26102024.WaitHelpers.checkVisibilityOfAndTextToBePresentInElement;

public class selenium23 {
    // Locators - Find the Web elements
    // Open the URL .app.vwo.com/#/login](https://app.vwo.com/#/login)
    //Find the Email id** and enter the email as admin@admin.com
    //Find the pass inputbox** and enter passwrod as admin.
    //Find and Click on the submit button
    //Verify that the error message is shown "Your email, password, IP address or location did not match"


    @Description("Verify that with invalid email, pass, error message is shown on the app.vwo.com")
    @Test
    public void VWOloginNegative(){

        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--start-maximized");

        WebDriver driver = new ChromeDriver(chromeOptions);
        driver.navigate().to("https://app.vwo.com");
        System.out.println(driver.getTitle());

        driver.findElement(By.id("login-username")).sendKeys("admin@admin.com");
        driver.findElement(By.id("login-password")).sendKeys("password@321");
        driver.findElement(By.id("js-login-btn")).click();

        WebElement error = driver.findElement(By.className("notification-box-description"));

        // Condition
        WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(3));
        wait2.until(ExpectedConditions.visibilityOf(error));

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
//        checkVisibilityOfAndTextToBePresentInElement(driver, By.className("notification-box-description"));
        wait.until(ExpectedConditions.textToBePresentInElement(error, "Your email, password, IP address or location did not match"));

        Assert.assertEquals(error.getText(), "Your email, password, IP address or location did not match");

        driver.quit();
    }
}
