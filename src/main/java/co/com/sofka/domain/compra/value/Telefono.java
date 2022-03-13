package co.com.sofka.domain.compra.value;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Telefono implements ValueObject<String> {
    private final String numero;
    public Telefono(String numero){
        this.numero= Objects.requireNonNull(numero, "El numero no puede ser null");;
    }
    public String numero() {
        return numero;
    }

    @Override
    public String value() {
        return this.numero;
    }
}
