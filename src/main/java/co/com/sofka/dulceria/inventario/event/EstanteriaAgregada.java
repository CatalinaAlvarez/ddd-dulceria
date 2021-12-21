package co.com.sofka.dulceria.inventario.event;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.dulceria.inventario.Estanteria;
import co.com.sofka.dulceria.inventario.value.Capacidad;
import co.com.sofka.dulceria.inventario.value.EstanteriaId;

public class EstanteriaAgregada extends DomainEvent {

    private final EstanteriaId estanteriaId;
    private final Capacidad capacidad;

    public EstanteriaAgregada(EstanteriaId estanteriaId, Capacidad capacidad) {
        super("sofka.inventario.estanteriaAgregada");
        this.estanteriaId = estanteriaId;
        this.capacidad = capacidad;
    }

    public EstanteriaId getEstanteriaId() {
        return estanteriaId;
    }

    public Capacidad getCapacidad() {
        return capacidad;
    }
}
