package br.ufrn.sigaa;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Quando;
import io.cucumber.java.pt.Entao;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class AreaPublica {
    public String url;
    public WebDriver driver;

    @Before
    public void iniciar(){
        url = "https://sigaa.ufrn.br/sigaa/public";
        System.setProperty("webdriver.chrome.driver", "chromedriver91.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @After
    public void finalizar(){
        //driver.quit();
    }
    @Dado("que o usuario acessa a pagina publica do SIGAA")
    public void que_o_usuario_acessa_a_pagina_publica_do_sigaa() {
        driver.get(url);
    }
    @Quando("usuario seleciona a opcao componentes curriculares no menu graduacao")
    public void usuario_seleciona_a_opcao_componentes_curriculares_no_menu_graduacao() throws InterruptedException {
        driver.findElement(By.id("l-graduacao")).click();
        TimeUnit.SECONDS.sleep(1);
        driver.findElement(By.xpath("/html/body/div/div/div[2]/div[1]/div[2]/div[2]/div/div[2]/dl/dt[2]/div")).click();

    }
    @Entao("o sistema deve exibir o form de busca por Componentes")
    public void o_sistema_deve_exibir_o_form_de_busca_por_componentes() {
        // Write code here that turns the phrase above into concrete actions
        String expected;
        expected = "Consulta de Componentes Curriculares";
        String actual = driver.findElement(By.cssSelector("#corpo > h2")).getText();
        Assert.assertEquals(expected, actual);
    }
    @Quando("o usuario busca pelo componete de GRADUACAO {string}")
    public void o_usuario_busca_pelo_componete_de_graduacao(String string) {
        WebElement nivel = driver.findElement(By.id("form:nivel"));
        new Select(nivel).selectByVisibleText(("GRADUAÇÃO"));
        driver.findElement(By.name("form:j_id_jsp_190531263_11")).sendKeys(string);
        driver.findElement(By.id("form:btnBuscarComponentes")).click();

    }
    @Entao("o sistema deve exibir o componente {string} na lista de resultados")
    public void o_sistema_deve_exibir_o_componente_na_lista_de_resultados(String string) {
        String expected = "FUNDAMENTOS MATEMÁTICOS DA COMPUTAÇÃO I";
        String actual = driver.findElement(By.cssSelector("#formListagemComponentes > table > tbody > tr > td:nth-child(2)")).getText();
        Assert.assertEquals(expected, actual);
    }
}
