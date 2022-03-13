package co.com.sofka.domain.compra;

import co.com.sofka.domain.compra.event.CompraCreada;
import co.com.sofka.domain.compra.event.MovimientoGenerado;
import co.com.sofka.domain.compra.event.PrecioCalculado;
import co.com.sofka.domain.generic.EventChange;

import java.util.HashSet;

public class CompraEventChange  extends EventChange {
    public CompraEventChange(Compra compra) {

        apply((CompraCreada event) -> {
            //Agregar reglas de dominio
            compra.productoIdset= event.getProductoIdSet();
            compra.productoPedidos = new HashSet<>();
        });

        apply((MovimientoGenerado event) -> {
            //Agregar reglas de dominio
          //todo
        });

        apply((PrecioCalculado event) -> {
            //Agregar reglas de dominio
            compra.precio= event.getPrecio();
        });
    }
}
