package co.com.sofka.domain.compra.value;

import co.com.sofka.domain.generic.Identity;

public class ProveedorID extends Identity {
    private ProveedorID(String id) {
        super(id);
    }

    public ProveedorID() {
    }

    public static ProveedorID of(String id) {
        return new ProveedorID(id);
    }

}
