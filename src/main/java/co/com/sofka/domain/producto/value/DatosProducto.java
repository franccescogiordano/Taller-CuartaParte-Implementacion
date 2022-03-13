package co.com.sofka.domain.producto.value;

import co.com.sofka.domain.generic.Informacion;
import co.com.sofka.domain.generic.Nombre;
import co.com.sofka.domain.generic.ProductoId;
import co.com.sofka.domain.generic.ValueObject;
import co.com.sofka.domain.pedido.value.CantidadPedida;
import co.com.sofka.domain.pedido.value.PrecioPedido;
import co.com.sofka.domain.pedido.value.ProductoPedido;

import java.util.Objects;


public class DatosProducto implements ValueObject<DatosProducto.Props> {

    private final Nombre nombre;
    private final Informacion informacion;

    public DatosProducto(Nombre nombre, Informacion informacion) {
        this.nombre = Objects.requireNonNull(nombre);
        this.informacion = Objects.requireNonNull(informacion);
    }

    public static DatosProducto of(Nombre nombre, Informacion informacion) {
        return new DatosProducto(nombre, informacion);
    }

    @Override
    public DatosProducto.Props value() {
        return new DatosProducto.Props() {
            @Override
            public Nombre nombre() {
                return nombre;
            }

            @Override
            public Informacion informacion() {
                return informacion;
            }
        };
    }

    public interface Props{
        Nombre nombre();
        Informacion informacion();
       }
}
