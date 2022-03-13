package co.com.sofka.domain.generic;

public class Nombre implements ValueObject<String> {
    private final String value;

    public Nombre(String value) {
        this.value = value;//TODO: agregar validaciones o reglas de dominio
    }

    @Override
    public String value() {
        return value;
    }
}