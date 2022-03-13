package co.com.sofka.domain.producto.value;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class StockMinimo implements ValueObject<Integer> {
    private final int value;

    public StockMinimo(Integer value) {
         this.value = Objects.requireNonNull(value, "stockminimo no puede ser null");
    }

    public static StockMinimo of(int i) {
        return new StockMinimo(i);
    }

    @Override
    public Integer value() {
        return value;
    }
}

