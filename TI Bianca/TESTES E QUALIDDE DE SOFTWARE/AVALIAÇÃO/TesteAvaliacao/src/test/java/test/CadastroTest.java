package test;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.CadastroPagesPFPositivo;
import pages.CadastroPagesPJPositivo;
import pages.CadastroPagesPF_CPF_ERRO;
import pages.CadastroPagesPF_DN_ERRO;
import pages.CadastroPagesPJ_CNPJ_ERRO;

import java.time.Duration;

public class CadastroTest {
    static WebDriver driver;

    static CadastroPagesPFPositivo cadastropagespfpositivo;
    static CadastroPagesPJPositivo cadastropagespjpositivo;
    static CadastroPagesPF_CPF_ERRO cadastroPagesPF_cpf_erro;
    static CadastroPagesPF_DN_ERRO cadastroPagesPF_Dn_ERRO;
    static CadastroPagesPJ_CNPJ_ERRO cadastroPagesPJ_CNPJ_ERRO;

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver-win64\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://cliente.advancedcorretora.com.br/signup");

        cadastropagespfpositivo = new CadastroPagesPFPositivo(driver);
	    cadastropagespjpositivo = new CadastroPagesPJPositivo(driver);
        cadastroPagesPF_cpf_erro = new CadastroPagesPF_CPF_ERRO(driver);
        cadastroPagesPF_Dn_ERRO = new CadastroPagesPF_DN_ERRO(driver);
        cadastroPagesPJ_CNPJ_ERRO = new CadastroPagesPJ_CNPJ_ERRO(driver);

        driver.manage().window().maximize();
	    WebElement aceitarCookies = driver.findElement(By.id("onetrust-accept-btn-handler"));
        aceitarCookies.click();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }
        @Test
        public void CadastroPagesPFPositivo () {
            cadastropagespfpositivo.preencherCampoPF();
	}

	    @Test
        public void CadastroPagesPJPositivo () {
            cadastropagespjpositivo.preencherCampoPJ();
        }

        @Test
        public void CadastroPagesPF_CPF_ERRO() {
        cadastroPagesPF_cpf_erro.preencherCampoPF_CPF_ERRO();
        cadastroPagesPF_cpf_erro.verificaAvisoCpfInvalido();
        }

        @Test
        public void CadastroPagesPF_DN_ERRO() {
        cadastroPagesPF_Dn_ERRO.preencherCampoPF_DN_ERRO();
        cadastroPagesPF_Dn_ERRO.verificaAvisoDnInvalido();
        }

        @Test
        public void CadastroPagesPJ_CNPJ_ERRO() {
        cadastroPagesPJ_CNPJ_ERRO.preencherCampoPJ_CNPJ_ERRO();
        cadastroPagesPJ_CNPJ_ERRO.verificaAvisoCpfInvalido();
        }

        @AfterClass
        public static void tearDownClass() throws Exception{

        }
    }




/*
CENARIO   CASO DE TESTE                       RESULTADO
01        CADASTRO PESSOA FISICA CORRETO      PAGINA ACEITAR O CADASTRO
02        CADASTRO PESSOA JURIDICA CORRETO    PAGINA ACEITAR O CADASTRO
03        CADASTRO PESSOA FISICA CPF ERRO     PAGINA NÃO ACEITAR CADASTRO
04        CADASTRO PESSOA FISICA D.N.ERRO     PAGINA NÃO ACEITAR CADASTRO
05        CADASTRO PESSOA JURIDICA CNPJ ERRO  PAGINA NÃO ACEITAR CADASTRO
*/
