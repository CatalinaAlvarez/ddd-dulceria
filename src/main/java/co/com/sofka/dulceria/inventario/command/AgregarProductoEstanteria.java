package co.com.sofka.dulceria.inventario.command;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.dulceria.inventario.value.EstanteriaId;
import co.com.sofka.dulceria.inventario.value.InventarioId;
import co.com.sofka.dulceria.inventario.value.ProductoId;

public class AgregarProductoEstanteria extends Command {

    private final InventarioId inventarioId;
    private final EstanteriaId entityId;
    private final ProductoId productoId;


    public AgregarProductoEstanteria(InventarioId inventarioId, EstanteriaId entityId, ProductoId productoId) {
        this.inventarioId = inventarioId;
        this.entityId = entityId;
        this.productoId = productoId;
    }

    public InventarioId getInventarioId() {
        return inventarioId;
    }

    public EstanteriaId getEntityId() {
        return entityId;
    }

    public ProductoId getProductoId() {
        return productoId;
    }
}
