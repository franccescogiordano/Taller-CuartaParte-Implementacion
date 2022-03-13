package co.com.sofka.domain.compra.event;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.domain.generic.ProductoId;
import co.com.sofka.domain.pedido.value.CantidadPedida;

public class MovimientoGenerado extends DomainEvent {
    private final ProductoId productoId;
    private final CantidadPedida cantidadPedida;

    public MovimientoGenerado(ProductoId productoId, CantidadPedida cantidadPedida) {
        super("compra.event.movimientogenerado");
        this.productoId = productoId;
        this.cantidadPedida = cantidadPedida;
    }

    public CantidadPedida getCantidadPedida() {
        return cantidadPedida;
    }

    public ProductoId getProductoId() {
        return productoId;
    }
}
