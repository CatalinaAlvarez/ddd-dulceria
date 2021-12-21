package co.com.sofka.dulceria.personal.command;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.dulceria.personal.Cajero;
import co.com.sofka.dulceria.personal.Encargado;
import co.com.sofka.dulceria.personal.value.PersonalId;

public class CrearPersonal extends Command {
    private final PersonalId personalId;
    private final Cajero cajero;
    private final Encargado encargado;

    public CrearPersonal(PersonalId entityId, Cajero cajero, Encargado encargado) {
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
