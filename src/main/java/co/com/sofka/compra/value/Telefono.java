package co.com.sofka.compra.value;

import co.com.sofka.domain.generic.ValueObject;

public class Telefono implements ValueObject<String> {
    private final String numero;
    public Telefono(String numero){
        this.numero=numero;
    }
    public String numero() {
        return numero;
    }

    @Override
    public String value() {
        return this.numero;
    }
}
