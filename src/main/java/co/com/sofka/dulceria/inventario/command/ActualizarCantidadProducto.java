package co.com.sofka.dulceria.inventario.command;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.dulceria.inventario.value.Cantidad;
import co.com.sofka.dulceria.inventario.value.InventarioId;
import co.com.sofka.dulceria.inventario.value.ProductoId;

public class ActualizarCantidadProducto extends Command {

    private final InventarioId inventarioId;
    private final ProductoId entityId;
    private final Cantidad cantidad;

    public ActualizarCantidadProducto(InventarioId inventarioId, ProductoId entityId, Cantidad cantidad) {
        this.inventarioId = inventarioId;
        this.entityId = entityId;
        this.cantidad = cantidad;
    }

    public InventarioId getInventarioId() {
        return inventarioId;
    }

    public ProductoId getEntityId() {
        return entityId;
    }

    public Cantidad getCantidad() {
        return cantidad;
    }
}
