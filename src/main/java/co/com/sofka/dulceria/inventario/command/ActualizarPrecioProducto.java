package co.com.sofka.dulceria.inventario.command;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.dulceria.inventario.value.InventarioId;
import co.com.sofka.dulceria.inventario.value.Precio;
import co.com.sofka.dulceria.inventario.value.ProductoId;

public class ActualizarPrecioProducto extends Command {

    private final InventarioId inventarioId;
    private final ProductoId entityId;
    private final Precio precio;


    public ActualizarPrecioProducto(InventarioId inventarioId, ProductoId entityId, Precio precio) {
        this.inventarioId = inventarioId;
        this.entityId = entityId;
        this.precio = precio;
    }

    public InventarioId getInventarioId() {
        return inventarioId;
    }

    public ProductoId getEntityId() {
        return entityId;
    }

    public Precio getPrecio() {
        return precio;
    }
}
