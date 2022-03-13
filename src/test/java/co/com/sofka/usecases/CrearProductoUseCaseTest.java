package co.com.sofka.usecases;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.domain.generic.Informacion;
import co.com.sofka.domain.generic.Nombre;
import co.com.sofka.domain.generic.Precio;
import co.com.sofka.domain.generic.ProductoId;
import co.com.sofka.domain.producto.command.CrearProducto;
import co.com.sofka.domain.producto.event.ProductoCreado;
import co.com.sofka.domain.producto.value.DatosProducto;
import co.com.sofka.domain.producto.value.Stock;
import co.com.sofka.domain.producto.value.StockMinimo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CrearProductoUseCaseTest {
    @Test
    void crearProducto() {
        //arrange
        Precio precio = new Precio(20.0);
        ProductoId productoId = ProductoId.of("xxxxx");
        DatosProducto datosProducto = new DatosProducto(new Nombre("yyyyy"), new Informacion("qqqqq"));
        Stock stock = new Stock(0);
        StockMinimo stockMinimo = new StockMinimo(0);
        CrearProducto crearProducto = new CrearProducto(productoId, precio, datosProducto, stock, stockMinimo);
        //act
        CrearProductoUseCase usecase = new CrearProductoUseCase();
        var events = UseCaseHandler.getInstance()
                .syncExecutor(usecase, new RequestCommand<>(crearProducto))
                .orElseThrow()
                .getDomainEvents();
        //assert
        var event = (ProductoCreado) events.get(0);
        Assertions.assertEquals("producto.event.productocreado", event.type);
        Assertions.assertEquals("xxxxx", event.aggregateRootId());
        Assertions.assertEquals(datosProducto, event.getDatosProducto());
        Assertions.assertEquals(precio, event.getPrecio());
        Assertions.assertEquals(0, event.getStock().value());
        Assertions.assertEquals(0, event.getStockMinimo().value());

    }
}
