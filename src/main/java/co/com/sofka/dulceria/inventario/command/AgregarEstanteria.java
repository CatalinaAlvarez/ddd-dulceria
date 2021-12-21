package co.com.sofka.dulceria.inventario.command;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.dulceria.inventario.value.Capacidad;
import co.com.sofka.dulceria.inventario.value.EstanteriaId;
import co.com.sofka.dulceria.inventario.value.InventarioId;

public class AgregarEstanteria extends Command {

    private final InventarioId inventarioId;
    private final EstanteriaId entityId;
    private final Capacidad capacidad;

    public AgregarEstanteria(InventarioId inventarioId, EstanteriaId entityId, Capacidad capacidad) {
        this.inventarioId = inventarioId;
        this.entityId = entityId;
        this.capacidad = capacidad;
    }

    public InventarioId getInventarioId() {
        return inventarioId;
    }

    public EstanteriaId getEntityId() {
        return entityId;
    }

    public Capacidad getCapacidad() {
        return capacidad;
    }
}
