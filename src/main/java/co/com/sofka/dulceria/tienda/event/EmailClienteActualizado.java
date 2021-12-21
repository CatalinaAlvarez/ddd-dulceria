package co.com.sofka.dulceria.tienda.event;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.dulceria.generics.Email;
import co.com.sofka.dulceria.tienda.value.ClienteId;

public class EmailClienteActualizado extends DomainEvent {
    private final ClienteId clienteId;
    private final Email email;

    public EmailClienteActualizado(ClienteId entityId, Email email) {
        super("sofka.tienda.emailClienteActualizado");
        this.clienteId = entityId;
        this.email = email;
    }

    public ClienteId getClienteId() {
        return clienteId;
    }

    public Email getEmail() {
        return email;
    }
}
