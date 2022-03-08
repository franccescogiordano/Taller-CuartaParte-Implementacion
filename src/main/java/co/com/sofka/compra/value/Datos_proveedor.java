package co.com.sofka.compra.value;
import co.com.sofka.domain.generic.ProductoId;
import co.com.sofka.domain.generic.ValueObject;
import co.com.sofka.domain.pedido.value.CantidadPedida;
import co.com.sofka.domain.pedido.value.PrecioPedido;
import co.com.sofka.domain.pedido.value.ProductoPedido;

import java.util.Objects;

public class Datos_proveedor implements ValueObject<Datos_proveedor.Props>{
    private final Direccion direccion;
    private final Nombre nombre;
    private final Telefono telefono;

    public Datos_proveedor(Direccion direccion, Nombre nombre, Telefono telefono) {
        this.direccion = direccion;
        this.nombre = Objects.requireNonNull(nombre, "El nombre del proveedor no puede ser null");;
        this.telefono = telefono;
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

