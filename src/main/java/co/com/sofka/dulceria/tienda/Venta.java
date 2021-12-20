package co.com.sofka.dulceria.tienda;

import co.com.sofka.domain.generic.Entity;
import co.com.sofka.dulceria.inventario.value.ProductoId;
import co.com.sofka.dulceria.personal.value.CajeroId;
import co.com.sofka.dulceria.personal.value.VendedorId;
import co.com.sofka.dulceria.tienda.value.*;

import java.util.Set;

public class Venta extends Entity<VentaId> {

    protected Set<ProductoId> productos;
    protected TiendaId tiendaId;
    protected CajeroId cajeroId;
    protected VendedorId vendedorId;
    protected ClienteId clienteId;
    protected Factura factura;
    protected Total total;


    public Venta(VentaId entityId) {
        super(entityId);
    }
}
