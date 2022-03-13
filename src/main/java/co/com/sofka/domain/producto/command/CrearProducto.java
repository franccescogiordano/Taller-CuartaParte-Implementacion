package co.com.sofka.domain.producto.command;


import co.com.sofka.domain.generic.Command;
import co.com.sofka.domain.generic.Precio;
import co.com.sofka.domain.generic.ProductoId;
import co.com.sofka.domain.producto.value.DatosProducto;
import co.com.sofka.domain.producto.value.Stock;
import co.com.sofka.domain.producto.value.StockMinimo;

public class CrearProducto extends Command {

    private final ProductoId productoId;
    private final DatosProducto datosProducto;
    private final Stock stock;
    private final StockMinimo stockMinimo;
    private final Precio precio;

    public CrearProducto(ProductoId productoId, Precio precio,DatosProducto datosProducto, Stock stock, StockMinimo stockMinimo) {
        this.productoId = productoId;
        this.precio = precio;
        this.datosProducto = datosProducto;
        this.stock = stock;
        this.stockMinimo = stockMinimo;
    }

    public ProductoId getProductoId() {
        return productoId;
    }

    public DatosProducto getDatosProducto() {
        return datosProducto;
    }

    public Stock getStock() {return stock;}

    public Precio getPrecio() {return precio;}

    public StockMinimo getStockMinimo() {
        return stockMinimo;
    }
}
