package co.com.sofka.domain.compra.value;

import co.com.sofka.domain.generic.Identity;

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
