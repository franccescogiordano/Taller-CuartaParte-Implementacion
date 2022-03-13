package co.com.sofka.domain.compra.command;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.domain.generic.Precio;

public class CalcularPrecio extends Command {
    private final Precio precio;

    public CalcularPrecio(Precio precio) {

        this.precio = precio;
    }

    public Precio getPrecio() {
        return precio;
    }
}
