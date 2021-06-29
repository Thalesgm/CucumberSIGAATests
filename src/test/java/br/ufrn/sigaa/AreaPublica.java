package br.ufrn.sigaa;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Quando;
import io.cucumber.java.pt.Entao;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

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
    public void usuario_seleciona_a_opcao_componentes_curriculares_no_menu_graduacao() {
        // Write code here that turns the phrase above into concrete actions

    }
    @Entao("o sistema deve exibir o form de busca por Componentes")
    public void o_sistema_deve_exibir_o_form_de_busca_por_componentes() {
        // Write code here that turns the phrase above into concrete actions

    }
    @Quando("o cliente busca pelo componete de {string} {string}")
    public void o_cliente_busca_pelo_componete_de(String string, String string2) {
        // Write code here that turns the phrase above into concrete actions

    }
    @Entao("o sistema deve exibir o componente {string} na lista de resultados")
    public void o_sistema_deve_exibir_o_componente_na_lista_de_resultados(String string) {
        // Write code here that turns the phrase above into concrete actions

    }
}
