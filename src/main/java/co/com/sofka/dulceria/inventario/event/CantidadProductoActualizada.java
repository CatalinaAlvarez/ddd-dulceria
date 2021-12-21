package co.com.sofka.dulceria.inventario.event;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.dulceria.inventario.value.Cantidad;
import co.com.sofka.dulceria.inventario.value.ProductoId;

public class CantidadProductoActualizada extends DomainEvent {
    private final ProductoId productoId;
    private final Cantidad cantidad;

    public CantidadProductoActualizada(ProductoId entityId, Cantidad cantidad) {
        super("sofka.inventario.cantidadProductoActualizada");
        this.productoId = entityId;
        this.cantidad = cantidad;
    }

    public ProductoId getProductoId() {
        return productoId;
    }

    public Cantidad getCantidad() {
        return cantidad;
    }
}
