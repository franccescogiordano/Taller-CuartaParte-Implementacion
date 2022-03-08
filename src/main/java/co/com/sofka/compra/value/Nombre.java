package co.com.sofka.compra.value;

import co.com.sofka.domain.generic.ValueObject;

public class Nombre implements ValueObject<String> {
    private final String nombre;
    public Nombre(String nombre){
        this.nombre=nombre;
    }
    public String nombre() {
        return nombre;
    }

    @Override
    public String value() {
        return this.nombre;
    }
}
