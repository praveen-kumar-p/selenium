package org.example.ex_02112024;


import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class selenium029P2 {

    @Test
    public void testaction() throws InterruptedException{
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--start-maximized");

        WebDriver driver = new ChromeDriver(chromeOptions);
        driver.get("https://www.spicejet.com/");

        WebElement source = driver.findElement(By.xpath("//div[@data-testid=\"to-testID-origin\"]"));
        Actions actions = new Actions(driver);
        actions.moveToElement(source).click().build().perform();
        actions.moveToElement(source).click().sendKeys("BLR").build().perform();

        Thread.sleep(8000);

        driver.quit();
    }
}
