package co.com.sofka.domain.generic;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Date;
import java.util.Objects;

public class Fecha implements ValueObject<Date> {
    private final Date value;

    public Fecha() {
        this(new Date());
    }

    public Fecha(Date date) {
        //TODO: validaciones
        this.value = Objects.requireNonNull(date, "la fecha no puede ser null");
    }

    @Override
    public Date value() {
        return value;
    }
}
