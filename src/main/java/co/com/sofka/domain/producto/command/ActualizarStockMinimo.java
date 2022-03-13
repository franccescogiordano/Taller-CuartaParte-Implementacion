package co.com.sofka.domain.producto.command;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.domain.generic.ProductoId;
import co.com.sofka.domain.producto.value.StockMinimo;

public class ActualizarStockMinimo extends Command {

    private final ProductoId productoId;
    private final StockMinimo stockMinimo;

    public ActualizarStockMinimo(ProductoId productoId, StockMinimo stockMinimo) {
        this.productoId = productoId;
        this.stockMinimo = stockMinimo;
    }

    public ProductoId getProductoId() {
        return productoId;
    }

    public StockMinimo getStockMinimo() {
        return stockMinimo;
    }
}
