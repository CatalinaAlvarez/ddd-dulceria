package co.com.sofka.dulceria.tienda;

import co.com.sofka.domain.generic.Entity;
import co.com.sofka.dulceria.inventario.value.ProductoId;
import co.com.sofka.dulceria.personal.value.CajeroId;
import co.com.sofka.dulceria.personal.value.VendedorId;
import co.com.sofka.dulceria.tienda.value.*;

import java.util.Objects;
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

    public Venta(VentaId entityId, TiendaId tiendaId, CajeroId cajeroId, VendedorId vendedorId, ClienteId clienteId, Factura factura, Total total) {
        super(entityId);
        this.tiendaId = Objects.requireNonNull(tiendaId);
        this.cajeroId = Objects.requireNonNull(cajeroId);
        this.vendedorId = Objects.requireNonNull(vendedorId);
        this.clienteId = Objects.requireNonNull(clienteId);
        this.factura = Objects.requireNonNull(factura);
        this.total = Objects.requireNonNull(total);
        //AQUI USAR EL DE HASHSET CON UNA COSA YA LISTA
    }
}
