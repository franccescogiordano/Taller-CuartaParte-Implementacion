package co.com.sofka.compra.value;

import co.com.sofka.domain.generic.Identity;
import co.com.sofka.domain.pedido.value.PedidoId;

import java.nio.file.CopyOption;

public class CompraID extends Identity {
    private CompraID(String id) {
        super(id);
    }

    public CompraID() {
    }

    public static CompraID of(String id) {
        return new CompraID(id);
    }


}
