package org.example.page;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

import java.time.Duration;

public class LoginPage extends PageObject {

    @FindBy(name = "txtUsername")
    WebElementFacade txtUserName;
    @FindBy(name = "txtPassword")
    WebElementFacade txtPassword;
    @FindBy(name = "Submit")
    WebElementFacade btnSubmit;
    public void ingresarUsuario(String usuario) {
//        withTimeoutOf(Duration.ofSeconds(20)).waitFor(txtUserName);
        txtUserName.typeAndTab(usuario);
    }

    public void ingresarClave(String clave) {
        txtPassword.typeAndTab(clave);

    }

    public void accederButtonlogin() {
        btnSubmit.click();
    }
}
