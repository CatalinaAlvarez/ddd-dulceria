package co.com.sofka.dulceria.inventario.command;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.dulceria.generics.Nombre;
import co.com.sofka.dulceria.inventario.value.InventarioId;
import co.com.sofka.dulceria.inventario.value.ProductoId;

public class ActualizarNombreProducto extends Command {

    private final InventarioId inventarioId;
    private final ProductoId entityId;
    private final Nombre nombre;


    public ActualizarNombreProducto(InventarioId inventarioId, ProductoId entityId, Nombre nombre) {
        this.inventarioId = inventarioId;
        this.entityId = entityId;
        this.nombre = nombre;
    }

    public InventarioId getInventarioId() {
        return inventarioId;
    }

    public ProductoId getEntityId() {
        return entityId;
    }

    public Nombre getNombre() {
        return nombre;
    }
}
