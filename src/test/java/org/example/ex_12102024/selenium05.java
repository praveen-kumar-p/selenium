package org.example.ex_12102024;

import org.openqa.selenium.chrome.ChromeDriver;

public class selenium05 {

    public static void main(String[] args) {
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://app.vwo.com");
        driver.quit();
    }
}
