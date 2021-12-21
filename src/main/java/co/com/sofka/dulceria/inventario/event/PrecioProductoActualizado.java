package co.com.sofka.dulceria.inventario.event;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.dulceria.inventario.value.Precio;
import co.com.sofka.dulceria.inventario.value.ProductoId;

public class PrecioProductoActualizado extends DomainEvent {
    private final ProductoId productoId;
    private final Precio precio;

    public PrecioProductoActualizado(ProductoId entityId, Precio precio) {
        super("sofka.inventario.precioProductoActualizado");
        this.productoId=entityId;
        this.precio= precio;
    }

    public ProductoId getProductoId() {
        return productoId;
    }

    public Precio getPrecio() {
        return precio;
    }
}
