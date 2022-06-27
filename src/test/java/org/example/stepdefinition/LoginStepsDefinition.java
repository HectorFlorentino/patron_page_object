package org.example.stepdefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import org.example.steps.LoginSteps;

public class LoginStepsDefinition {
    @Steps
    LoginSteps loginSteps;

    @Given("que me encuentro en orange")
    public void queMeEncuentroEnOrange() {
        loginSteps.queMeEncuentroEnOrange();
    }

    @When("ingreso credenciales usuario {string} y clave {string}")
    public void ingresoCredencialesUsuarioUsuarioYPassPass(String usuario, String clave) {
        loginSteps.credencialesLogin(usuario, clave);
        loginSteps.accedeButtonlogin();
    }
    @Then("valido el ingreso exitoso")
    public void validoElIngresoExitoso() {

    }
}
