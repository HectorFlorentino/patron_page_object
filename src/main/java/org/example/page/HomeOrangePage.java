package org.example.page;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

import java.time.Duration;


public class HomeOrangePage extends PageObject {
    @FindBy(xpath = "//*[@id='welcome' and contains(text().'Welcome')]")
    WebElementFacade lblWelcomeHome;
    @FindBy(xpath = "//*[contains(text(),'PIM')]")
    WebElementFacade lnkPim;

    public boolean validateWelcomeHome() {
        withTimeoutOf(Duration.ofSeconds(10)).waitFor(lblWelcomeHome);
        return lblWelcomeHome.isVisible();
    }

    public void seleccionarManuPim() {
        withTimeoutOf(Duration.ofSeconds(10)).waitFor(lnkPim);
        lnkPim.click();
    }
}
