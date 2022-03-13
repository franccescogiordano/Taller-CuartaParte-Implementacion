package co.com.sofka.domain.compra.value;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Nombre implements ValueObject<String> {
    private final String nombre;
    public Nombre(String nombre){
        this.nombre=Objects.requireNonNull(nombre, "El nombre no puede ser null");
    }
    public String nombre() {
        return nombre;
    }

    @Override
    public String value() {
        return this.nombre;
    }
}
