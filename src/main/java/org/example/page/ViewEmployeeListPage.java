package org.example.page;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class ViewEmployeeListPage extends PageObject {
    @FindBy(id = "menu_pim_addEmployee")
    WebElementFacade lnkAddEmployee;
    @FindBy(xpath = "//*[@id='pdMainContainer']//*[contains(text(),'Personal Details')]")
    WebElementFacade lblPersonalDetails;
    public void seleccionarSubMenuAddEmployee() {
        lnkAddEmployee.click();
    }

    public boolean validarCreadencialesEmpleado() {
        return lblPersonalDetails.isDisplayed();
    }
}
