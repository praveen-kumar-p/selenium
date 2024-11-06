package org.example.ex_02112024;


import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class selenium028P1 {


    @Test
    public void testaction() throws InterruptedException{
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--start-maximized");

        WebDriver driver = new ChromeDriver(chromeOptions);
        driver.get("https://awesomeqa.com/practice.html");

        WebElement firstname = driver.findElement(By.name("firstname"));

        Actions actions = new Actions(driver);
        actions.keyDown(Keys.SHIFT).sendKeys(firstname, "praveen kumar p iyli")
                .keyUp(Keys.SHIFT).build().perform();
        Thread.sleep(13000);
    }
}
