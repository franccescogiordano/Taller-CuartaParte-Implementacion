package co.com.sofka.domain.producto.event;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.domain.producto.value.Stock;

public class StockActualizado extends DomainEvent {
    private final Stock stock;

    public StockActualizado(Stock stock) {
        super("producto.stockactualizado");
        this.stock = stock;
    }
    public Stock getStock() {
        return stock;
    }
}
