package org.example.steps;

import org.example.page.HomeOrangePage;
import static org.hamcrest.Matchers.*;
import static org.hamcrest.MatcherAssert.*;



public class HomeOrangeSteps {
    HomeOrangePage homeOrangePage;

    public void validoElIngresoExitodoAlSistema() {
        assertThat (true, is(homeOrangePage.validateWelcomeHome()));
    }

    public void seleccionarMenuPim() {
        homeOrangePage.seleccionarManuPim();
    }


}
