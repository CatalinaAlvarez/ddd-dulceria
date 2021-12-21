package co.com.sofka.dulceria.personal.event;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.dulceria.personal.Cajero;
import co.com.sofka.dulceria.personal.Encargado;
import co.com.sofka.dulceria.personal.value.PersonalId;

public class PersonalCreado extends DomainEvent {
    private final PersonalId personalId;
    private final Cajero cajero;
    private final Encargado encargado;

    public PersonalCreado(PersonalId entityId, Cajero cajero, Encargado encargado) {
        super("sofka.personal.personalCreado");
        this.personalId = entityId;
        this.cajero = cajero;
        this.encargado = encargado;
    }

    public PersonalId getPersonalId() {
        return personalId;
    }

    public Cajero getCajero() {
        return cajero;
    }

    public Encargado getEncargado() {
        return encargado;
    }
}
