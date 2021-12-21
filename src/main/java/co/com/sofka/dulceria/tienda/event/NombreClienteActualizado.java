package co.com.sofka.dulceria.tienda.event;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.dulceria.generics.Nombre;
import co.com.sofka.dulceria.tienda.value.ClienteId;

public class NombreClienteActualizado extends DomainEvent {
    private final ClienteId clienteId;
    private final Nombre nombre;

    public NombreClienteActualizado(ClienteId entityId, Nombre nombre) {
        super("sofka.tienda.nombreClienteActualizado");
        this.clienteId = entityId;
        this.nombre = nombre;
    }

    public ClienteId getClienteId() {
        return clienteId;
    }

    public Nombre getNombre() {
        return nombre;
    }
}
