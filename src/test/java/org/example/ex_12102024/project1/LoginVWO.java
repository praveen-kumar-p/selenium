package org.example.ex_12102024.project1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class LoginVWO {

    @Test
    public void testVWOLogin(){

        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("start-maximized");
        chromeOptions.addArguments("incognito");

        ChromeDriver chromeDriver = new ChromeDriver(chromeOptions);
        chromeDriver.get("https://app.vwo.com/#/login");
        chromeDriver.findElement(By.id("login-username")).sendKeys("admin@admin.com");
        chromeDriver.findElement(By.id("login-password")).sendKeys("password@321");

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        chromeDriver.findElement(By.id("js-login-btn")).click();
        chromeDriver.quit();
    }
}
