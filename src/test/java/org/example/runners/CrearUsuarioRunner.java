package org.example.runners;
import io.cucumber.junit.CucumberOptions; // agrega las clases necesarias para interpretar las variables del cucumber options
import net.serenitybdd.cucumber.CucumberWithSerenity; // permite ejecutar el escenario con
import org.junit.runner.RunWith;

import static io.cucumber.junit.CucumberOptions.SnippetType.CAMELCASE;

@RunWith(CucumberWithSerenity.class)   // Esta anotación nos permite ejecutar  nuestra clase cucumber con serenity

@CucumberOptions(
        features="src/test/resources/features/crearUsuario.feature",
        glue = "org.example.stepdefinition",
        snippets = CAMELCASE,
        tags= "")
public class CrearUsuarioRunner {

}
