package co.com.sofka.dulceria.personal.event;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.dulceria.generics.Nombre;
import co.com.sofka.dulceria.personal.value.EncargadoId;

public class NombreEncargadoActualizado extends DomainEvent {
    private final EncargadoId encargadoId;
    private final Nombre nombre;

    public NombreEncargadoActualizado(EncargadoId entityId, Nombre nombre) {
        super("sofka.personal.nombreEncargadoActualizado");
        this.encargadoId = entityId;
        this.nombre = nombre;
    }

    public EncargadoId getEncargadoId() {
        return encargadoId;
    }

    public Nombre getNombre() {
        return nombre;
    }
}
