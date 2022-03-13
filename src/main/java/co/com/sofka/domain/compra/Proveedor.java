package co.com.sofka.domain.compra;

import co.com.sofka.domain.compra.value.Datos_proveedor;
import co.com.sofka.domain.compra.value.ProveedorID;
import co.com.sofka.domain.generic.Entity;


public class Proveedor extends Entity<ProveedorID> {
    private final Datos_proveedor datos_proveedor;
    private final Compra compra;


    public Proveedor(ProveedorID entityId, Datos_proveedor datos_proveedor, Compra compra) {
        super(entityId);
        this.datos_proveedor = datos_proveedor;
        this.compra = compra;
    }


    public void confirmarCompra(Compra compra) {
        compra.generarMovimiento(compra);
    }

    public Datos_proveedor datos_proveedor() {
        return datos_proveedor;
    }

    public Compra compra() {
        return compra;
    }


}
