package Test;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CarregarNavegador {
    static WebDriver driver;
@BeforeClass
    public static void setUpBeforeClass() throws Exception {
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver-win64\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.youtube.com/");
    }
    @Test
    public void test(){

    }
    @AfterClass
    public static void setUpAfterClass() throws Exception {
    driver.quit();
    }
}
