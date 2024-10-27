package org.example.ex_27102024;

import io.qameta.allure.Description;
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

public class SVGpart1 {

    ChromeDriver chromeDriver;

    @Description("Verify that after search, results are visible")
    @Test
    public void test_flipcart_search(){

        chromeDriver.manage().window().maximize();
//        chromeDriver.get("https://www.amcharts.com/svg-maps/?map=india");
        chromeDriver.get("https://www.flipkart.com/");

        chromeDriver.findElement(By.xpath("//input[@title='Search for Products, Brands and More']")).sendKeys("macmini");
        chromeDriver.findElement(By.xpath("(//*[local-name()='svg'])[1]")).click();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        List<WebElement> titles = chromeDriver.findElements(By.xpath("//a[@class='wjcEIp']"));
        System.out.println(titles);
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
