package co.com.sofka.dulceria.inventario.event;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.dulceria.generics.Nombre;
import co.com.sofka.dulceria.inventario.value.ProductoId;

public class NombreProductoActualizado extends DomainEvent {
    private final ProductoId productoId;
    private final Nombre nombre;

    public NombreProductoActualizado(ProductoId entityId, Nombre nombre) {
        super("sofka.inventario.nombreProductoActualizado");
        this.productoId = entityId;
        this.nombre = nombre;

    }

    public ProductoId getProductoId() {
        return productoId;
    }

    public Nombre getNombre() {
        return nombre;
    }
}
