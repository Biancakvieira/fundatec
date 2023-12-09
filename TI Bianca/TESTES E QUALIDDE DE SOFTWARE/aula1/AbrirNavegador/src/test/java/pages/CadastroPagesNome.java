package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CadastroPagesNome {
    static WebDriver driver;

    public CadastroPagesNome(WebDriver driver) {
        this.driver = driver;
    }
    public void preencherCampo() {
        WebElement nome = driver.findElement(By.id("firstName"));
        nome.sendKeys("Bianca");

        WebElement sobrenome = driver.findElement(By.id("lastName"));
        sobrenome.sendKeys("Vieira");

        WebElement botao = driver.findElement(By.xpath("//span[contains(text(), 'Próxima')]"));
        botao.click();
    }
}
