package co.com.sofka.domain.producto.event;


import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.domain.generic.Precio;
import co.com.sofka.domain.generic.ProductoId;
import co.com.sofka.domain.pedido.value.ProductoPedido;
import co.com.sofka.domain.producto.value.DatosProducto;
import co.com.sofka.domain.producto.value.Stock;
import co.com.sofka.domain.producto.value.StockMinimo;

public class ProductoCreado extends DomainEvent {
    private final ProductoId productoId;
    private final DatosProducto datosProducto;
    private final Stock stock;
    private final StockMinimo stockMinimo;
    private final Precio precio;
    private final ProductoPedido productoPedido;

    public ProductoCreado(ProductoId productoId, Precio precio, DatosProducto datosProducto, Stock stock, StockMinimo stockMinimo,ProductoPedido productoPedido) {
        super("producto.event.productocreado");
        this.productoId = productoId;
        this.precio = precio;
        this.datosProducto = datosProducto;
        this.stock = stock;
        this.stockMinimo = stockMinimo;
        this.productoPedido = productoPedido;
    }
    public ProductoId getProductoId() {
        return productoId;
    }

    public Stock getStock() {
        return stock;
    }

    public StockMinimo getStockMinimo() {
        return stockMinimo;
    }
    public DatosProducto getDatosProducto() {
        return datosProducto;
    }

    public Precio getPrecio(){
        return precio;
    }
    public ProductoPedido getProductoPedido(){
        return productoPedido;
    }

}
