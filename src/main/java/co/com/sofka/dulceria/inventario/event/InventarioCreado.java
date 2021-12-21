package co.com.sofka.dulceria.inventario.event;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.dulceria.inventario.value.InventarioId;


public class InventarioCreado extends DomainEvent {
    private final InventarioId inventarioId;

    public InventarioCreado(InventarioId inventarioId) {
        super("sofka.inventario.inventarioCreado");
        this.inventarioId = inventarioId;
    }

    public InventarioId getInventarioId() {
        return inventarioId;
    }
}
