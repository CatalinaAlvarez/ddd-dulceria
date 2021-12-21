package co.com.sofka.dulceria.personal.event;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.dulceria.generics.Email;
import co.com.sofka.dulceria.personal.value.EncargadoId;

public class EmailEncargadoActualizado extends DomainEvent {
    private final EncargadoId encargadoId;
    private final Email email;

    public EmailEncargadoActualizado(EncargadoId entityId, Email email) {
        super("sofka.personal.emailEncargadoActualizado");
        this.encargadoId = entityId;
        this.email = email;
    }

    public EncargadoId getEncargadoId() {
        return encargadoId;
    }

    public Email getEmail() {
        return email;
    }
}
