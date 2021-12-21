package co.com.sofka.dulceria.tienda.event;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.dulceria.generics.Email;
import co.com.sofka.dulceria.generics.Nombre;
import co.com.sofka.dulceria.tienda.value.ClienteId;

public class ClienteAgregado extends DomainEvent {
    private final ClienteId clienteId;
    private final Nombre nombre;
    private final Email email;

    public ClienteAgregado(ClienteId entityId, Nombre nombre, Email email) {
        super("sofka.tienda.clienteAgregado");
        this.clienteId = entityId;
        this.nombre = nombre;
        this.email = email;
    }

    public ClienteId getClienteId() {
        return clienteId;
    }

    public Nombre getNombre() {
        return nombre;
    }

    public Email getEmail() {
        return email;
    }
}
