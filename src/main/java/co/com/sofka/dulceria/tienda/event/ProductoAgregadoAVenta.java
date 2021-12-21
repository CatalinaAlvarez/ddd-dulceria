package co.com.sofka.dulceria.tienda.event;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.dulceria.inventario.value.ProductoId;
import co.com.sofka.dulceria.tienda.value.VentaId;

public class ProductoAgregadoAVenta extends DomainEvent {
    private final VentaId ventaId;
    private final ProductoId productoId;

    public ProductoAgregadoAVenta(VentaId entityId, ProductoId productoId) {
        super("sofka.tienda.productoAgregadoAVenta");
        this.ventaId = entityId;
        this.productoId = productoId;
    }

    public VentaId getVentaId() {
        return ventaId;
    }

    public ProductoId getProductoId() {
        return productoId;
    }
}
