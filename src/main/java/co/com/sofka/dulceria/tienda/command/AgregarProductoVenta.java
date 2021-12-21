package co.com.sofka.dulceria.tienda.command;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.dulceria.inventario.value.ProductoId;
import co.com.sofka.dulceria.tienda.value.TiendaId;
import co.com.sofka.dulceria.tienda.value.VentaId;

public class AgregarProductoVenta extends Command {

    private final TiendaId tiendaId;
    private final VentaId ventaId;
    private final ProductoId productoId;


    public AgregarProductoVenta(TiendaId tiendaId, VentaId ventaId, ProductoId productoId) {
        this.tiendaId = tiendaId;
        this.ventaId = ventaId;
        this.productoId = productoId;
    }

    public TiendaId getTiendaId() {
        return tiendaId;
    }

    public VentaId getVentaId() {
        return ventaId;
    }

    public ProductoId getProductoId() {
        return productoId;
    }
}
