package co.com.sofka.domain.compra.value;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Direccion implements ValueObject<String> {
    private final String direccion;
    public Direccion(String direccion){
        this.direccion= Objects.requireNonNull(direccion, "la direccion del proveedor no puede ser null");
    }
    public String direccion() {
        return direccion;
    }

    @Override
    public String value() {
        return this.direccion;
    }
}
