package co.com.sofka.dulceria.inventario.event;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.dulceria.generics.Nombre;
import co.com.sofka.dulceria.inventario.value.InventarioId;


public class InventarioCreado extends DomainEvent {
    private final InventarioId inventarioId;
    private final Nombre nombre;

    public InventarioCreado(InventarioId inventarioId, Nombre nombre) {
        super("sofka.inventario.inventarioCreado");
        this.inventarioId = inventarioId;
        this.nombre = nombre;
    }

    public InventarioId getInventarioId() {
        return inventarioId;
    }

    public Nombre getNombre() {
        return nombre;
    }
}
