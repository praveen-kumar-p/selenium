package org.example.ex_20102024;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class VWOLogin {

    @Test
    public void testVWOLoginDashboard(){

        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--incognito");
        chromeOptions.addArguments("Start-Maximized");

        ChromeDriver chromeDriver = new ChromeDriver(chromeOptions);
        chromeDriver.get("https://app.vwo.com/#/login");

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        chromeDriver.findElement(By.id("login-username")).sendKeys("praveen@ymtsindia.org");
        chromeDriver.findElement(By.id("login-password")).sendKeys("Pr@veen018");
        chromeDriver.findElement(By.id("js-login-btn")).click();
//        chromeDriver.findElement(By.id("js-login-btn")).click();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}
