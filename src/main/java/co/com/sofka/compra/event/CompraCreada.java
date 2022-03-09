package co.com.sofka.compra.event;

import co.com.sofka.compra.value.CompraID;
import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.domain.generic.ProductoId;
import java.util.List;
import java.util.Set;
public class CompraCreada extends DomainEvent {
    private final Set<ProductoId> productoIdSet;

    public CompraCreada(Set<ProductoId> listaid) {
        super("compra.compracreada");
        this.productoIdSet = listaid;

    }

    public Set<ProductoId> getProductoIdSet() {
        return productoIdSet;
    }


}
