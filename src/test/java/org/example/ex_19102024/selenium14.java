package org.example.ex_19102024;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.openqa.selenium.chrome.ChromeDriver;

public class selenium14 {
    public static void main(String[] args) {
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://katalon-demo-cura.herokuapp.com/");
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        if (driver.getPageSource().contains("CURA Healthcare Service")) {
            System.out.println("Verified");
            Assert.assertTrue(true);
        } else {
            Assert.assertTrue(false);
        }
        driver.quit();
    }
}
