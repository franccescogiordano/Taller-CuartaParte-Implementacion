package co.com.sofka.compra;

import co.com.sofka.compra.event.CompraCreada;
import co.com.sofka.compra.value.CompraID;
import co.com.sofka.compra.value.Datos_proveedor;
import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.ClienteId;
import co.com.sofka.domain.generic.Precio;
import co.com.sofka.domain.generic.ProductoId;
import co.com.sofka.domain.pedido.PedidoEventChange;
import co.com.sofka.domain.pedido.Venta;
import co.com.sofka.domain.pedido.event.PedidoCreado;
import co.com.sofka.domain.pedido.value.PedidoId;
import co.com.sofka.domain.pedido.value.ProductoPedido;

import java.util.Set;

public class Compra extends AggregateEvent<CompraID> {

    protected Set<ProductoPedido> productoPedidos;//TODO: que comportamiento administraria estos estados
    protected Precio precio;
    protected Set<ProductoId> productoIdset;

    public Compra(CompraID entityId, Set<ProductoPedido> productoPedidos, Precio precio, ProductoId productoId) {
        super(entityId);

        subscribe(new CompraEventChange(this));
        appendChange(new CompraCreada(productoIdset)).apply();
    }

    public Compra(CompraID entityId,  Set<ProductoId> productoId) {
        super(entityId);
        this.productoIdset = productoId;
    }

    public double calcularprecio(Set<ProductoPedido> listaproductos){
        double preciototal=0;
        double cantidadPedida;
        double precioIndividual;
        for( ProductoPedido pro : listaproductos){
           preciototal+=pro.value().precioPedido().value();
        }
        return preciototal;
    }
}
