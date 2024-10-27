package org.example.ex_26102024;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class selenium025_InputBox_CheckBox_RadioBox {

    public static void main(String[] args) {

        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--start-maximized");

        WebDriver driver = new ChromeDriver(chromeOptions);
        driver.get("https://awesomeqa.com/practice.html");

        // Input Box code
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("firstname")));
        driver.findElement(By.name("firstname")).sendKeys("the testing academy");

        // Radio Button
        WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(2));
        wait1.until(ExpectedConditions.visibilityOfElementLocated(By.name("sex")));
        driver.findElement(By.name("sex")).click();

        // Check Box code
        WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(2));
        wait2.until(ExpectedConditions.visibilityOfElementLocated(By.id("tool-1")));
        driver.findElement(By.id("tool-1")).click();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.quit();

    }
}
