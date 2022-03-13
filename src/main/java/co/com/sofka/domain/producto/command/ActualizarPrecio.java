package co.com.sofka.domain.producto.command;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.domain.generic.Precio;
import co.com.sofka.domain.generic.ProductoId;

public class ActualizarPrecio extends Command {
    private final ProductoId productoId;
    private final Precio precio;

    public ActualizarPrecio(ProductoId productoId, Precio precio) {
        this.productoId = productoId;
        this.precio = precio;
    }

    public ProductoId getProductoId() {
        return productoId;
    }

    public Precio getPrecio() {
        return precio;
    }

}
