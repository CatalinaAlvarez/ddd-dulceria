package co.com.sofka.dulceria.inventario.event;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.dulceria.inventario.value.EstanteriaId;
import co.com.sofka.dulceria.inventario.value.ProductoId;

public class ProductoAgregadoAEstanteria extends DomainEvent {
    private final ProductoId productoId;
    private final EstanteriaId estanteriaId;

    public ProductoAgregadoAEstanteria(EstanteriaId entityId, ProductoId productoId) {
        super("sofka.inventario.productoAgregadoAEstanteria");
        this.estanteriaId = entityId;
        this.productoId = productoId;
    }

    public ProductoId getProductoId() {
        return productoId;
    }

    public EstanteriaId getEstanteriaId() {
        return estanteriaId;
    }
}
