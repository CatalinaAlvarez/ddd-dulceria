package co.com.sofka.dulceria.inventario;

import co.com.sofka.domain.generic.Entity;
import co.com.sofka.dulceria.inventario.value.Capacidad;
import co.com.sofka.dulceria.inventario.value.EstanteriaId;


public class Estanteria extends Entity<EstanteriaId> {
    protected Capacidad capacidad;

    public Estanteria(EstanteriaId entityId) {
        super(entityId);
    }
}
