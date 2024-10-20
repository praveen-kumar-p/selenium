package org.example.ex_20102024;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class selenium21 {

    @Test
    public void test_verify_expirymessage(){

        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        chromeOptions.addArguments("Start-Maximized");

        ChromeDriver chromeDriver = new ChromeDriver(chromeOptions);
        chromeDriver.get("https://www.idrive360.com/enterprise/login");

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        chromeDriver.findElement(By.id("username")).sendKeys("augtest_040823@idrive.com");
        chromeDriver.findElement(By.id("password")).sendKeys("123456");
        chromeDriver.findElement(By.id("frm-btn")).click();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


        WebElement error_message_free_trial = chromeDriver.findElement(By.xpath("//h5[@class='id-card-title']"));
        Assert.assertEquals(error_message_free_trial.getText(),"Your free trial has expired");

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        chromeDriver.quit();
    }
}
