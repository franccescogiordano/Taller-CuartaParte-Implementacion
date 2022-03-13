package co.com.sofka.domain.producto.command;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.domain.generic.ProductoId;
import co.com.sofka.domain.producto.value.Stock;

public class ActualizarStock extends Command {

    private final Stock stock;
    private final ProductoId productoId;

    public ActualizarStock(Stock stock, ProductoId productoId) {
        this.stock = stock;
        this.productoId = productoId;
    }

    public Stock getStock() {
        return stock;
    }

    public ProductoId getProductoId() {
        return productoId;
    }
}
