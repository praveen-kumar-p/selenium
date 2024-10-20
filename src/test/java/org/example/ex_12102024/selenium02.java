package org.example.ex_12102024;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class selenium02 {
    @Test
    public void test1(){
        ChromeDriver driver= new ChromeDriver();
        driver.get("https://app.vwo.com");
        driver.manage().window().maximize();
        driver.quit();
    }
}
