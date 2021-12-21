package co.com.sofka.dulceria.personal.event;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.dulceria.generics.Nombre;
import co.com.sofka.dulceria.personal.value.CajeroId;

public class NombreCajeroActualizado extends DomainEvent {
    private final CajeroId cajeroId;
    private final Nombre nombre;

    public NombreCajeroActualizado(CajeroId entityId, Nombre nombre) {
        super("sofka.personal.nombreCajeroActualizado");
        this.cajeroId = entityId;
        this.nombre = nombre;
    }

    public CajeroId getCajeroId() {
        return cajeroId;
    }

    public Nombre getNombre() {
        return nombre;
    }
}
