package testClases;

import pages.Inicio;

public class BuscarProducto {

    Inicio inicio = new Inicio();

    public void buscarProducto(String producto) throws InterruptedException {
        inicio.validarDespliegue();
        inicio.busqueda(producto);
    }
}
