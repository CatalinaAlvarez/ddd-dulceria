package co.com.sofka.dulceria.tienda.event;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.dulceria.inventario.value.InventarioId;
import co.com.sofka.dulceria.personal.value.PersonalId;
import co.com.sofka.dulceria.tienda.value.Locacion;
import co.com.sofka.dulceria.tienda.value.TiendaId;

public class TiendaCreada extends DomainEvent {
    private final TiendaId tiendaId;
    private final PersonalId personalId;
    private final InventarioId inventarioId;
    private final Locacion locacion;

    public TiendaCreada(TiendaId entityId, PersonalId personalId, InventarioId inventarioId, Locacion locacion) {
        super("sofka.tienda.tiendaCreada");
        this.tiendaId = entityId;
        this.personalId = personalId;
        this.inventarioId = inventarioId;
        this.locacion = locacion;

    }

    public TiendaId getTiendaId() {
        return tiendaId;
    }

    public PersonalId getPersonalId() {
        return personalId;
    }

    public InventarioId getInventarioId() {
        return inventarioId;
    }

    public Locacion getLocacion() {
        return locacion;
    }
}
