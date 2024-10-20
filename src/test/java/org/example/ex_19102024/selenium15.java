package org.example.ex_19102024;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class selenium15 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://app.vwo.com");

        driver.close();
        // Close the Current Browser Window
        // Session ID != NULL
        // Not the full browser

        driver.quit();
        // Close all the /sessions/windows and stop the browser
        // Session = null, Error - Session ID is null
    }
}
