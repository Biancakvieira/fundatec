package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.time.Duration;

import static org.junit.Assert.assertEquals;

public class CadastroPagesPJ_CNPJ_ERRO {
    static WebDriver driver;

    public CadastroPagesPJ_CNPJ_ERRO(WebDriver driver) {this.driver = driver;}

    public void preencherCampoPJ_CNPJ_ERRO() {

        WebElement PessoaJuridica = driver.findElement(By.id("PjButton"));
        PessoaJuridica.click();

        WebElement Nome = driver.findElement(By.id("name"));
        Nome.sendKeys("Vitoria");

        WebElement sobrenome = driver.findElement(By.id("lastname"));
        sobrenome.sendKeys("Invencivel");

        WebElement razao_Social = driver.findElement(By.id("companyName"));
        razao_Social.sendKeys("VitoriaInvencivel");

        WebElement Data_de_abertura_da_empresa
                = driver.findElement(By.id("date"));
        Data_de_abertura_da_empresa.sendKeys("11112000");

        WebElement cnpj = driver.findElement(By.id("document"));
        cnpj.sendKeys("70.380.218/0001-");

        WebElement ddi = driver.findElement(By.xpath("//body/div[@id='root-app']/div[1]/div[1]/form[1]/div[1]/div[3]/div[6]/div[1]/div[1]/a[1]/span[2]"));
        ddi.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));

        WebElement ddiSelecionado = driver.findElement(By.xpath(" //a[contains(text(),'Brasil - +55')]"));
        ddiSelecionado.click();

        WebElement ddd = driver.findElement(By.id("ddd"));
        ddd.sendKeys("51");

        WebElement telefone = driver.findElement(By.id("phone"));
        telefone.sendKeys("998966255");

        WebElement email = driver.findElement(By.id("email"));
        email.sendKeys("vitoriainvencivel1@gmail.com");

        WebElement confEmail = driver.findElement(By.id("confEmail"));
        confEmail.sendKeys("vitoriainvencivel1@gmail.com");

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(9));

        WebElement checkboxLGPD = driver.findElement(By.xpath("//body/div[@id='root-app']/div[1]/div[1]/form[1]/div[1]/div[3]/div[11]/div[1]/div[1]/div[1]/label[1]/span[1]"));
        checkboxLGPD.click();
    }
    public void verificaAvisoCpfInvalido() {
        WebElement Tamanhoinválido = driver.findElement(By.xpath("//span[contains(text(),'Tamanho inválido.')]"));
        String mensagemErro = Tamanhoinválido.getText();
        String mensagemErroEsperada = "Tamanho inválido.";
        assertEquals(mensagemErroEsperada, mensagemErro);
    }
}
