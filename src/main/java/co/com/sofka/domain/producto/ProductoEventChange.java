package co.com.sofka.domain.producto;

import co.com.sofka.domain.generic.EventChange;
import co.com.sofka.domain.producto.event.*;


public class ProductoEventChange extends EventChange {

    public ProductoEventChange(Producto producto) {
        apply((ProductoCreado event) -> {

            producto.datosProducto = event.getDatosProducto();
            producto.productoPedido = event.getProductoPedido();
            producto.precio = event.getPrecio();
            producto.stock = event.getStock();
            producto.stockMinimo = event.getStockMinimo();

        });

        apply((StockActualizado event) -> {
            producto.stock = event.getStock();
        });

        apply((StockMinimoActualizado event) -> {
            producto.stockMinimo = event.getStockMinimo();
        });

        apply((PrecioActualizado event) -> {
            producto.precio = event.getPrecio();
        });

        apply((DatoProductoActualizado event) -> {
            producto.datosProducto = event.getDatosProducto();
        });

    }

}
