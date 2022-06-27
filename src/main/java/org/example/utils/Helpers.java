package org.example.utils;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Helpers extends PageObject {
    static File localprotect;
    public static void agregarAdjunto(String nombreArchivo, WebElementFacade elementWeb){
        localprotect = new File(".").getAbsoluteFile();
        Path image = Paths.get(localprotect+"\\src\\test\\resources\\testImage\\"+nombreArchivo);
        elementWeb.sendKeys(image.toString());
    }
}
