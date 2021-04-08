package testSuites;

import Utils.Constants.Navegador;
import Utils.DriverContext;
import Utils.ReadProperties;
import Utils.Reporte.PdfQaNovaReports;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import testClases.BuscarProducto;

public class Pruebas {
    BuscarProducto buscarProducto = new BuscarProducto();

    @BeforeTest
    public void setUp() throws InterruptedException {
        //String url = ReadProperties.readFromConfig("propiedades.properties").getProperty("web");
        String url = "https://www.tottus.cl/";
        DriverContext.setUp(Navegador.Chrome, url);
        PdfQaNovaReports.createPDF();
        Thread.sleep(10000);
    }

    @AfterTest
    public void tearDown(){
        DriverContext.closeDriver();
    }

    @Test
    public void buscarProductoArroz() throws InterruptedException {
        buscarProducto.buscarProducto("arroz");
        PdfQaNovaReports.closePDF();
    }
}
