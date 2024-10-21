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

public class assign_ebay {

    @Test
    public void testebay(){

        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("Start-Maximized");

        ChromeDriver chromeDriver = new ChromeDriver(chromeOptions);
        chromeDriver.get("https://www.ebay.com/b/Desktops-All-In-One-Computers/171957/bn_1643067");

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        chromeDriver.findElement(By.xpath("//input[@id='gh-ac']")).click();
        chromeDriver.findElement(By.xpath("//input[@id='gh-ac']")).sendKeys("macmini");
        chromeDriver.findElement(By.id("gh-btn")).click();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

//        WebElement macmini_product_names = chromeDriver.findElement(By.xpath("//span[@role='heading']"));
        List<WebElement> searchtitle = chromeDriver.findElements(By.xpath("//span[@role='heading']"));
        List<WebElement> searchprice = chromeDriver.findElements(By.xpath("//span[@class='s-item__price']"));

        int size = Math.min(searchtitle.size(), searchprice.size()); //61
        for(int i = 0; i<= size ; i++ ) {
            System.out.println("Title: " + searchtitle.get(i).getText() + " || " + "Price: " + searchprice.get(i).getText());
            System.out.println();
        }

        chromeDriver.quit();
    }
}
