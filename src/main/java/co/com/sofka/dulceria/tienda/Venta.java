package co.com.sofka.dulceria.tienda;

import co.com.sofka.domain.generic.Entity;
import co.com.sofka.dulceria.inventario.value.Cantidad;
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
    protected Total total;


    public Venta(VentaId entityId) {
        super(entityId);
    }

    public Venta(VentaId entityId, TiendaId tiendaId, CajeroId cajeroId, VendedorId vendedorId, ClienteId clienteId, Total total) {
        super(entityId);
        this.tiendaId = Objects.requireNonNull(tiendaId);
        this.cajeroId = Objects.requireNonNull(cajeroId);
        this.vendedorId = Objects.requireNonNull(vendedorId);
        this.clienteId = Objects.requireNonNull(clienteId);
        this.total = Objects.requireNonNull(total);
        //AQUI USAR EL DE HASHSET CON UNA COSA YA LISTA
    }

    public void agregarProducto(ProductoId productoId){
        this.productos.add(productoId); //REVISAR SI ESTÁ BIEN
    }

    public void actualizarTotal(Total total){
        this.total = Objects.requireNonNull(total);
    }

    public Set<ProductoId> productos() {
        return productos;
    }

    public TiendaId tiendaId() {
        return tiendaId;
    }

    public CajeroId cajeroId() {
        return cajeroId;
    }

    public VendedorId vendedorId() {
        return vendedorId;
    }

    public ClienteId clienteId() {
        return clienteId;
    }

    public Total total() {
        return total;
    }
}
