package org.example.ex_12102024;

import org.testng.annotations.Test;

public class selenium03 {
    @Test
    public void testmethod(){
        // SearchContext - Interface - findElement, and findElements - GGF
        // WebDriver - Interface - some incomplete functions - GF
        // RemoteWebDriver - Class- It also has some functions - F
        // ChromeDriver, FirefoxDriver, EdgeDriver, SafariDriver, InternetExplorerDriver  Class - S

        //SearchContext driver = new ChromeDriver();
        //WebDriver driver = new ChromeDriver();
        //RemoteWebDriver driver1 = new ChromeDriver();
        // driver1 = new EdgeDriver()

        //ChromeDriver  driver = new ChromeDriver();

//          RemoteWebDriver driver = new ChromeDriver();
//          driver = new EdgeDriver();

        // Scenario #1
        // 1. Do want to run on  Chrome or Edge?
        //ChromeDriver driver = new ChromeDriver(); ~1%

        // Scenario #2
        // 2  Do you want to run on Chrome then change to Edge ?
        // WebDriver driver = new ChromeDriver();
        // driver = new EdgeDriver(); 97% -

        // Scenario #3
        // 3. do you want to run on multiple browsers, aws machine, ? 2%
        // RemoteWebDriver driver (with GRID) - Advance (Last 2 Sessions)

    }
}
