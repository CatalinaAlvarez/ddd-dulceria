package co.com.sofka.dulceria.tienda.event;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.dulceria.tienda.value.Locacion;
import co.com.sofka.dulceria.tienda.value.TiendaId;

public class LocacionActualizada extends DomainEvent {
    private final TiendaId tiendaId;
    private final Locacion locacion;

    public LocacionActualizada(TiendaId entityId, Locacion locacion) {
        super("sofka.tienda.locacionActualizada");
        this.tiendaId = entityId;
        this.locacion = locacion;
    }

    public TiendaId getTiendaId() {
        return tiendaId;
    }

    public Locacion getLocacion() {
        return locacion;
    }
}
