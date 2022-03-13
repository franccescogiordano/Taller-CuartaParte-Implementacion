package co.com.sofka.domain.compra.event;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.domain.generic.Precio;

public class PrecioCalculado extends DomainEvent {
    private final Precio precio;

    public PrecioCalculado(Precio precio) {
        super("compra.event.preciocalculado");
        this.precio = precio;
    }

    public Precio getPrecio() {
        return precio;
    }
}
