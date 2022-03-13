package co.com.sofka.domain.producto.event;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.domain.generic.Precio;
import co.com.sofka.domain.producto.value.Stock;

public class PrecioActualizado extends DomainEvent {
    private final Precio precio;

    public PrecioActualizado(Precio precio) {
        super("producto.precioactualizado");
        this.precio = precio;
    }
    public Precio getPrecio() {
        return precio;
    }
}

