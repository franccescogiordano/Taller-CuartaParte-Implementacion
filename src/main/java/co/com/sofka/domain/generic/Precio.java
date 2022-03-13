package co.com.sofka.domain.generic;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Precio implements ValueObject<Double> {
    private final Double value;

    public Precio(Double value) {
        this.value = Objects.requireNonNull(value, "el precio no puede ser null");//TODO: validar
    }

    @Override
    public Double value() {
        return value;
    }
}
