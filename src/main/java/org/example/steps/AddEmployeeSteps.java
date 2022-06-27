package org.example.steps;

import io.cucumber.datatable.DataTable;
import org.example.page.AddEmployeePage;

import java.util.List;
import java.util.Map;

public class AddEmployeeSteps {
    AddEmployeePage addEmployeeSteps;
    public void agregarLosDatosDeEmpleado(DataTable dataTable){
        List<Map<String,String>> datosFeature = dataTable.asMaps(String.class,String.class);
        addEmployeeSteps.diligenciarFirstName(datosFeature.get(0).get("firstName"));
        addEmployeeSteps.diligenciarLastName(datosFeature.get(0).get("lastName"));
        addEmployeeSteps.agregarImagen(datosFeature.get(0).get("photograph"));
        addEmployeeSteps.seleccionarDetalleslogin();
        addEmployeeSteps.diligenciarUserName(datosFeature.get(0).get("nameLogin"));
        addEmployeeSteps.diligenciarPassword(datosFeature.get(0).get("passlogin"));
        addEmployeeSteps.diligenciarRePassword(datosFeature.get(0).get("passlogin"));
        addEmployeeSteps.guardarInformacion();
    }
}
