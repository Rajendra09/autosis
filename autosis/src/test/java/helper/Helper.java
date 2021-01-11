package helper;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Helper  {
    private static WebDriver REAL_DRIVER;

    public static void openBrowser() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/webdriver/chromedriver/mac/chromedriver");
        REAL_DRIVER = new ChromeDriver();
    }


    public static WebDriver getWebDriver() {
        return REAL_DRIVER;
    }


}
