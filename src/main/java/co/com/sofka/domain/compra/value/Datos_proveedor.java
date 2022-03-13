package co.com.sofka.domain.compra.value;
import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Datos_proveedor implements ValueObject<Datos_proveedor.Props>{
    private final Direccion direccion;
    private final Nombre nombre;
    private final Telefono telefono;

    public Datos_proveedor(Direccion direccion, Nombre nombre, Telefono telefono) {
        this.direccion = Objects.requireNonNull(direccion, "la direccion del proveedor no puede ser null");
        this.nombre = Objects.requireNonNull(nombre, "El nombre del proveedor no puede ser null");
        this.telefono =Objects.requireNonNull(telefono, "El telefono del proveedor no puede ser null");
    }

    @Override
    public Props value() {
        return new Props() {
            @Override
            public Telefono tel() {
                return telefono;
            }

            @Override
            public Direccion direc(){
                return direccion;
            }

            @Override
            public Nombre nombre() {
                return nombre;
            }
        };
    }

    public interface Props{
    Telefono tel();
    Direccion direc();
    Nombre nombre();
}
}

