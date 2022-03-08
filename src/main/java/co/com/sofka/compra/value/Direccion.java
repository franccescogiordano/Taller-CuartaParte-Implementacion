package co.com.sofka.compra.value;

import co.com.sofka.domain.generic.ValueObject;

public class Direccion implements ValueObject<String> {
    private final String direccion;
    public Direccion(String direccion){
        this.direccion=direccion;
    }
    public String direccion() {
        return direccion;
    }

    @Override
    public String value() {
        return this.direccion;
    }
}
