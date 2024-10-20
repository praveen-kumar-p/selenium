package org.example.ex_19102024;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class selenium10 {

    @Test
    public void testVWOLoginPageTitle(){
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--start-maximized");

        WebDriver webDriver = new ChromeDriver(chromeOptions);
        webDriver.get("https://app.vwo.com");

        System.out.println(webDriver.getPageSource());

        Assert.assertEquals(webDriver.getTitle(), "Login - VWO");
        Assert.assertEquals(webDriver.getCurrentUrl(), "https://app.vwo.com/#/login");

        webDriver.quit();
    }
}
