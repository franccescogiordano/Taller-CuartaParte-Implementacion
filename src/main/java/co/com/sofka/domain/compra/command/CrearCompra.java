package co.com.sofka.domain.compra.command;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.domain.generic.ProductoId;

import java.util.Set;

public class CrearCompra extends Command {
    private final Set<ProductoId> productoIdSet;

    public CrearCompra(Set<ProductoId> listaid) {
        this.productoIdSet = listaid;

    }

    public Set<ProductoId> getProductoIdSet() {
        return productoIdSet;
    }

}
