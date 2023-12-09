package Test;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.CadastroPagesNascimento;
import pages.CadastroPagesNome;

import java.time.Duration;

public class CadastroTest {

    static WebDriver driver;
    static CadastroPagesNome CadastroPages;
    static CadastroPagesNascimento CadastroPagesNascimento;
    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver-win64\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://accounts.google.com/SignUp?hl=pt");
        CadastroPages = new CadastroPagesNome(driver);
        CadastroPagesNascimento = new CadastroPagesNascimento(driver);
    }
    @Test
    public void test() {
        CadastroPages.preencherCampo();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        CadastroPagesNascimento.preencherCampoNascimento();
    }
    @AfterClass
    public static void tearDownClass() throws Exception{

    }

}
