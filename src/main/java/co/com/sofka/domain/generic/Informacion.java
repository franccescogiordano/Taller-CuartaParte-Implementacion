package co.com.sofka.domain.generic;

public class Informacion implements ValueObject<String> {
    private final String value;

    public Informacion(String value) {
        this.value = value;//TODO: agregar validaciones o reglas de dominio
    }

    @Override
    public String value() {
        return value;
    }
}