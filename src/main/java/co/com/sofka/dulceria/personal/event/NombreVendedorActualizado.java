package co.com.sofka.dulceria.personal.event;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.dulceria.generics.Nombre;
import co.com.sofka.dulceria.personal.value.VendedorId;

public class NombreVendedorActualizado extends DomainEvent {
    private final VendedorId vendedorId;
    private final Nombre nombre;

    public NombreVendedorActualizado(VendedorId entityId, Nombre nombre) {
        super("sofka.personal.nombreVendedorActualizado");
        this.vendedorId = entityId;
        this.nombre = nombre;
    }

    public VendedorId getVendedorId() {
        return vendedorId;
    }

    public Nombre getNombre() {
        return nombre;
    }
}
