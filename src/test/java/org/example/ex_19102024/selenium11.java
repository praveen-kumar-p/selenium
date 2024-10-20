package org.example.ex_19102024;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class selenium11 {

    @Test
    public void vwoLogin(){
        ChromeDriver chromeDriver = new ChromeDriver();
        chromeDriver.get("https://sdet.live");
        chromeDriver.quit();
    }
}
