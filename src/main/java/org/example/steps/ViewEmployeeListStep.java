package org.example.steps;

import org.example.page.ViewEmployeeListPage;
import org.junit.Assert;

public class ViewEmployeeListStep {
    ViewEmployeeListPage viewEmployeeListPage;

    public void seleccionarSubMenuAddEmpleado() {
        viewEmployeeListPage.seleccionarSubMenuAddEmployee();
    }

    public void validarCreadencialesEmpleado() {
        Assert.assertTrue("No se creo el usuario exitosamente",
                viewEmployeeListPage.validarCreadencialesEmpleado());
    }

}
