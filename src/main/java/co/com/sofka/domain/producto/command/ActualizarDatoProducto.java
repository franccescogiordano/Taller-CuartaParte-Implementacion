package co.com.sofka.domain.producto.command;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.domain.generic.ProductoId;
import co.com.sofka.domain.producto.value.DatosProducto;

public class ActualizarDatoProducto  extends Command {

    private final ProductoId productoId;
    private final DatosProducto datosProducto;

    public ActualizarDatoProducto(ProductoId productoId, DatosProducto datosProducto) {
        this.productoId = productoId;
        this.datosProducto = datosProducto;
    }

    public ProductoId getProductoId() {
        return productoId;
    }

    public DatosProducto getDatosProducto() {
        return datosProducto;
    }
}
