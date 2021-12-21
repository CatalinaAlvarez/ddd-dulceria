package co.com.sofka.dulceria.inventario.command;

import co.com.sofka.dulceria.generics.Nombre;
import co.com.sofka.dulceria.inventario.value.InventarioId;

public class CrearInventario {

    private final InventarioId inventarioId;
    private final Nombre nombre;

    public CrearInventario(InventarioId entityId, Nombre nombre) {
        this.inventarioId = entityId;
        this.nombre = nombre;
    }

    public InventarioId getInventarioId() {
        return inventarioId;
    }

    public Nombre getNombre() {
        return nombre;
    }
}
