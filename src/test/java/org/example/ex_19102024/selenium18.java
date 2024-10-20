package org.example.ex_19102024;

import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.chrome.ChromeDriver;

public class selenium18 {

    public static void main(String[] args) {

        ChromeOptions options = new ChromeOptions();
//        options.addArguments("--start-maximized");
//        options.addArguments("--window-size=800,600");
//        options.addArguments("--guest");

        Proxy proxy = new Proxy();
        proxy.setHttpProxy("188.255.245.205:1080");
        options.setCapability("proxy", proxy);


        WebDriver driver = new ChromeDriver(options);
        driver.get("https://whatismyipaddress.com/");
        driver.manage().window().maximize();
    }
}
