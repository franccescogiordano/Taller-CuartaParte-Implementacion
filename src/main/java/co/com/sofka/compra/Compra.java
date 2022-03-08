package co.com.sofka.compra;

import co.com.sofka.compra.value.Datos_proveedor;
import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.ClienteId;
import co.com.sofka.domain.pedido.Venta;
import co.com.sofka.domain.pedido.value.PedidoId;
import co.com.sofka.domain.pedido.value.ProductoPedido;

import java.util.Set;

public class Compra extends AggregateEvent<PedidoId> {
    protected Datos_proveedor datos_proveedor;
    protected Set<ProductoPedido> productoPedidos;//TODO: que comportamiento administraria estos estados
    protected ClienteId clienteId;
}
