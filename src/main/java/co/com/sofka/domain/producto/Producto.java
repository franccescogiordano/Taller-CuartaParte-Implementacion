package co.com.sofka.domain.producto;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.domain.generic.Precio;
import co.com.sofka.domain.generic.ProductoId;
import co.com.sofka.domain.pedido.Pedido;
import co.com.sofka.domain.pedido.value.PedidoId;
import co.com.sofka.domain.pedido.value.ProductoPedido;
import co.com.sofka.domain.producto.event.*;
import co.com.sofka.domain.producto.value.DatosProducto;
import co.com.sofka.domain.producto.value.Stock;
import co.com.sofka.domain.producto.value.StockMinimo;

import java.util.List;

public class Producto extends AggregateEvent<ProductoId> {

    protected DatosProducto datosProducto;
    protected Precio precio;
    protected Stock stock;
    protected StockMinimo stockMinimo;
    protected ProductoPedido productoPedido;

    public Producto(ProductoId productoId, Precio precio, DatosProducto datosProducto, Stock stock, StockMinimo stockMinimo) {
        super(productoId);
        appendChange(new ProductoCreado(productoId, precio, datosProducto, stock, stockMinimo, productoPedido)).apply();
    }


    private Producto(ProductoId productoId) {
        super(productoId);
        subscribe(new ProductoEventChange(this));
    }


    public static Producto from(ProductoId productoId, List<DomainEvent> eventList) {
        Producto producto = new Producto(productoId);
        eventList.forEach(producto::applyEvent);

        return producto;
    }


    public void actualizarDatoProducto(DatosProducto datosProducto) {
        appendChange(new DatoProductoActualizado(datosProducto)).apply();
    }

    public void actualizarStock(Stock stock) {
        appendChange(new StockActualizado(stock)).apply();
    }

    public void actualizarPrecio(Precio precio) {
        appendChange(new PrecioActualizado(precio)).apply();
    }

    public void actualizarStockMinimo(StockMinimo stockMinimo) {
        appendChange(new StockMinimoActualizado(stockMinimo)).apply();
    }

}
