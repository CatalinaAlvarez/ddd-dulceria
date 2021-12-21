package co.com.sofka.dulceria.tienda.command;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.dulceria.tienda.value.Locacion;
import co.com.sofka.dulceria.tienda.value.TiendaId;

public class ActualizarLocacion extends Command {

    private final TiendaId tiendaId;
    private final Locacion locacion;


    public ActualizarLocacion(TiendaId tiendaId, Locacion locacion) {
        this.tiendaId = tiendaId;
        this.locacion = locacion;
    }

    public TiendaId getTiendaId() {
        return tiendaId;
    }

    public Locacion getLocacion() {
        return locacion;
    }
}
