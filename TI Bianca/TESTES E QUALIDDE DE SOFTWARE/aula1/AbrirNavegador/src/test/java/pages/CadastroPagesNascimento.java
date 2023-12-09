package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CadastroPagesNascimento {
    static WebDriver driver;

    public CadastroPagesNascimento(WebDriver driver) {
        this.driver = driver;
    }

    public void preencherCampoNascimento() {
        WebElement dia = driver.findElement(By.id("day"));
        dia.sendKeys("24");

        WebElement mes = driver.findElement(By.id("month"));
        mes.sendKeys("Fevereiro");

        WebElement ano = driver.findElement(By.id("year"));
        ano.sendKeys("1972");

        WebElement genero = driver.findElement(By.id("gender"));
        genero.sendKeys("feminino");

        WebElement botao = driver.findElement(By.xpath("//span[contains(text(), 'Próxima')]"));
        botao.click();

    }
}
