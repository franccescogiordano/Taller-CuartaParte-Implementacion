package co.com.sofka.domain.producto.value;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Stock implements ValueObject<Integer> {
    private final int value;

    public Stock (int value) {
        this.value = Objects.requireNonNull(value, "stock no puede ser null");
    }

    public static Stock of(int ppppp) {
        return new Stock(ppppp);
    }



    @Override
    public Integer value() {
        return value;
    }
}
