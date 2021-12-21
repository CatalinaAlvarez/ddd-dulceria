package co.com.sofka.dulceria.personal.event;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.dulceria.generics.Email;
import co.com.sofka.dulceria.personal.value.VendedorId;

public class EmailVendedorActualizado extends DomainEvent {
    private final VendedorId vendedorId;
    private final Email email;

    public EmailVendedorActualizado(VendedorId entityId, Email email) {
        super("sofka.personal.emailVendedorActualizado");
        this.vendedorId = entityId;
        this.email = email;
    }

    public VendedorId getVendedorId() {
        return vendedorId;
    }

    public Email getEmail() {
        return email;
    }
}
