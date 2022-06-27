package org.example.page;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.example.utils.Helpers;

public class AddEmployeePage extends PageObject {
    Helpers helpers;
    @FindBy(name= "firstName")
    WebElementFacade txtFirstName;
    @FindBy(name= "lastName")
    WebElementFacade txtLastName;
    @FindBy(name= "photofile")
    WebElementFacade UploadPhoto;
    @FindBy(name= "chkLogin")
    WebElementFacade chkDetailsLog;
    @FindBy(name= "user_name")
    WebElementFacade txtUserName;
    @FindBy(name= "user_password")
    WebElementFacade txtPassword;
    @FindBy(name= "re_password")
    WebElementFacade txtRePassword;
    @FindBy(id= "btnSave")
    WebElementFacade btnSave;
    public void diligenciarFullName(String firstName) {

    }
    public void diligenciarFirstName(String firstName) {
        txtFirstName.typeAndTab(firstName);
    }

    public void diligenciarLastName(String lastName) {
        txtLastName.typeAndTab(lastName);
    }


    public void agregarImagen(String photograph) {
        helpers.agregarAdjunto(photograph,UploadPhoto);
    }

    public void seleccionarDetalleslogin() {
        chkDetailsLog.click();
    }

    public void diligenciarUserName(String nameLogin) {
        txtUserName.typeAndTab(nameLogin);
    }

    public void diligenciarPassword(String passlogin) {
        txtPassword.typeAndTab(passlogin);
    }

    public void diligenciarRePassword(String passlogin) {
        txtRePassword.typeAndTab(passlogin);
    }

    public void guardarInformacion() {
        btnSave.click();
    }


}
