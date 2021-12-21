package co.com.sofka.dulceria.personal.event;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.dulceria.generics.Email;
import co.com.sofka.dulceria.personal.value.CajeroId;

public class EmailCajeroActualizado extends DomainEvent {
    private final CajeroId cajeroId;
    private final Email email;

    public EmailCajeroActualizado(CajeroId entityId, Email email) {
        super("sofka.personal.emailCajeroActualizado");
        this.cajeroId = entityId;
        this.email = email;
    }

    public CajeroId getCajeroId() {
        return cajeroId;
    }

    public Email getEmail() {
        return email;
    }
}
