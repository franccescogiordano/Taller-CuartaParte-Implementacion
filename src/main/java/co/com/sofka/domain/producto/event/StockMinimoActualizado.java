package co.com.sofka.domain.producto.event;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.domain.producto.value.StockMinimo;

public class StockMinimoActualizado extends DomainEvent {
    private StockMinimo stockMinimo;


    public StockMinimoActualizado(StockMinimo stockMinimo) {
        super("producto.stockminimoactualizado");
        this.stockMinimo = stockMinimo;

    }
    public StockMinimo getStockMinimo() {
        return stockMinimo;
    }
}
