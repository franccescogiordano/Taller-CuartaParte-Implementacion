package co.com.sofka.domain.producto.event;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.domain.producto.value.DatosProducto;


public class DatoProductoActualizado extends DomainEvent {
    private final DatosProducto datosProducto;

    public DatoProductoActualizado(DatosProducto datosProducto) {
        super("producto.datoproductoactualizado");
        this.datosProducto = datosProducto;
    }
    public DatosProducto getDatosProducto() {
        return datosProducto;
    }
}