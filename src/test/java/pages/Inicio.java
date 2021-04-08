package pages;

import Utils.DriverContext;
import Utils.Validaciones;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Inicio {

    @FindBy(xpath = "/html/body/div[1]/div[2]/div[4]/div[1]/div[1]/section/div/div/input")
    WebElement barraBusqueda;

    public Inicio(){
        PageFactory.initElements(DriverContext.getDriver(), this);
    }

    public void validarDespliegue() throws InterruptedException {
        Validaciones.validarObjeto(barraBusqueda, "Barra de busqueda");
    }

    public void busqueda(String producto){
        barraBusqueda.click();
        barraBusqueda.sendKeys(producto);
    }
}
