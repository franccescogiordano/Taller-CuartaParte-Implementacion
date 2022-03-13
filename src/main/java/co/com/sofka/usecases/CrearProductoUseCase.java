package co.com.sofka.usecases;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import co.com.sofka.domain.producto.Producto;
import co.com.sofka.domain.producto.command.CrearProducto;

public class CrearProductoUseCase extends UseCase<RequestCommand<CrearProducto>, ResponseEvents> {

    @Override
    public void executeUseCase(RequestCommand<CrearProducto> input) {
        CrearProducto crearProducto = input.getCommand();

        Producto producto = new Producto(crearProducto.getProductoId(), crearProducto.getPrecio(), crearProducto.getDatosProducto(),crearProducto.getStock(),crearProducto.getStockMinimo());
        emit().onResponse(new ResponseEvents(producto.getUncommittedChanges()));
    }

}
