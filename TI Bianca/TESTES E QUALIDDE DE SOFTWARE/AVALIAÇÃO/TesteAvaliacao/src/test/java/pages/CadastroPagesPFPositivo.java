package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.time.Duration;


public class CadastroPagesPFPositivo {

    static WebDriver driver;

    public CadastroPagesPFPositivo(WebDriver driver) {this.driver = driver;}

    public void preencherCampoPF() {

        WebElement Nome = driver.findElement(By.id("name"));
        Nome.sendKeys("Vitoria");

        WebElement Sobrenome = driver.findElement(By.id("lastname"));
        Sobrenome.sendKeys("Invencivel");

        WebElement Data_de_nascimento = driver.findElement(By.id("date"));
        Data_de_nascimento.sendKeys("11112000");

        WebElement document = driver.findElement(By.id("document"));
        document.sendKeys("537.771.350-89");

        WebElement ddi = driver.findElement(By.xpath("//body/div[@id='root-app']/div[1]/div[1]/form[1]/div[1]/div[3]/div[5]/div[1]/div[1]/a[1]/span[2]"));
        ddi.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));

        WebElement pesquisaDDIInput = driver.findElement(By.xpath("//body/div[6]/div[1]/input[1]"));
        pesquisaDDIInput.sendKeys("brasil");

        WebElement ddiSelecionado = driver.findElement(By.xpath(" //a[contains(text(),'Brasil - +55')]"));
        ddiSelecionado.click();

        WebElement ddd = driver.findElement(By.id("ddd"));
        ddd.sendKeys("51");

        WebElement telefone = driver.findElement(By.id("phone"));
        telefone.sendKeys("996667777");

        WebElement email = driver.findElement(By.id("email"));
        email.sendKeys("vitoriainvencivel@gmail.com");

        WebElement confEmail = driver.findElement(By.id("confEmail"));
        confEmail.sendKeys("vitoriainvencivel@gmail.com");

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(9));


        WebElement checkboxSouPEP = driver.findElement(By.xpath("//body/div[@id='root-app']/div[1]/div[1]/form[1]/div[1]/div[3]/div[10]/div[1]/div[1]/label[1]/span[1]"));
        checkboxSouPEP.click();

        WebElement checkboxLGPD = driver.findElement(By.xpath("//body/div[@id='root-app']/div[1]/div[1]/form[1]/div[1]/div[3]/div[12]/div[1]/div[1]/div[1]/label[1]/span[1]"));
        checkboxLGPD.click();

        WebElement cadastrar = driver.findElement(By.xpath("//body/div[@id='root-app']/div[1]/div[1]/form[1]/div[1]/div[3]/div[14]/button[1]"));
        cadastrar.click();
    }
}