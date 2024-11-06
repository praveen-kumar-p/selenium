package org.example.ex_02112024;


import io.qameta.allure.Description;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class selenium030P3 {

    @Test
    public void testaction() throws InterruptedException {
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--start-maximized");

        WebDriver driver = new ChromeDriver(chromeOptions);
        driver.get("https://www.makemytrip.com/");

        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[@class=\"commonModal__close\"]"))).click();

//        WebElement fromcity = driver.findElement(By.cssSelector("//input[@placeholder=\"From\"]"));
        WebElement fromcity = driver.findElement(By.cssSelector("//input[@placeholder=\"From\"]"));
        Actions actions = new Actions(driver);
        actions.moveToElement(fromcity).click().sendKeys("New Delhi").build().perform();

        List<WebElement> list_auto_completex = driver.findElements(By.xpath("(//div[@class=\"makeFlex flexOne spaceBetween appendRight10\"])[2]"));
        for (WebElement e : list_auto_completex){
            if(e.getText().contains("New Delhi")){
                e.click();
                break;
            }
        }

    }
}
