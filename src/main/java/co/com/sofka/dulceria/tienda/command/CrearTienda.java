package co.com.sofka.dulceria.tienda.command;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.dulceria.inventario.value.InventarioId;
import co.com.sofka.dulceria.personal.value.PersonalId;
import co.com.sofka.dulceria.tienda.value.Locacion;
import co.com.sofka.dulceria.tienda.value.TiendaId;

public class CrearTienda extends Command {

    private final TiendaId tiendaId;
    private final PersonalId personalId;
    private final InventarioId inventarioId;
    private final Locacion locacion;

    public CrearTienda(TiendaId entityId, PersonalId personalId, InventarioId inventarioId, Locacion locacion) {
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
