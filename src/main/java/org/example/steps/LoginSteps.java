package org.example.steps;

import net.thucydides.core.annotations.Step;
import org.example.page.LoginPage;

public class LoginSteps {

    LoginPage loginPage;
    @Step("ingresar al login de la aplicacion")
    public void queMeEncuentroEnOrange() {
        loginPage.open();
    }
    @Step("ingresar credenciales validas")
    public void credencialesLogin (String usuario, String clave) {
        loginPage.ingresarUsuario(usuario);
        loginPage.ingresarClave(clave);
    }
    @Step("validar acceso correcto al sistema")
    public void accedeButtonlogin(){
        loginPage.accederButtonlogin();
    }

}
