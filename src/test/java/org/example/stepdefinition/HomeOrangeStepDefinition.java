package org.example.stepdefinition;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import org.example.steps.AddEmployeeSteps;
import org.example.steps.HomeOrangeSteps;
import org.example.steps.LoginSteps;
import org.example.steps.ViewEmployeeListStep;

public class HomeOrangeStepDefinition {
    @Steps
    HomeOrangeSteps homeOrangeSteps;
    @Steps
    ViewEmployeeListStep viewEmployeeListStep;
    @Steps
    AddEmployeeSteps addEmployeeSteps;

    @Given("que me encuentro en orangeHRM")
    public void queMeEncuentroEnOrangeHRM() {
        homeOrangeSteps.validoElIngresoExitodoAlSistema();
    }

    @When("agregar los datos de empleado")
    public void agregarLosDatosDeEmpleado(DataTable dataTable){
        homeOrangeSteps.seleccionarMenuPim();
        viewEmployeeListStep.seleccionarSubMenuAddEmpleado();
        addEmployeeSteps.agregarLosDatosDeEmpleado(dataTable);
    }

    @Then("valido que el empleado se ha creado en forma correcta")
    public void validoQueElEmpleadoSeHaCreadoDeFormaCorrecta(){
       viewEmployeeListStep.validarCreadencialesEmpleado();
    };
}
