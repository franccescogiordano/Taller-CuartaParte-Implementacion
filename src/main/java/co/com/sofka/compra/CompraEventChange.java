package co.com.sofka.compra;

import co.com.sofka.compra.event.CompraCreada;
import co.com.sofka.domain.generic.EventChange;

import java.util.HashSet;

public class CompraEventChange  extends EventChange {
    public CompraEventChange(Compra compra) {

        apply((CompraCreada event) -> {
            //Agregar reglas de dominio
            compra.productoIdset= event.getProductoIdSet();
            compra.productoPedidos = new HashSet<>();
        });
    }
}
