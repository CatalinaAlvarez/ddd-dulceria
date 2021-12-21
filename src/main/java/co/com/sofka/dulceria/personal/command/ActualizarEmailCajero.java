package co.com.sofka.dulceria.personal.command;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.dulceria.generics.Email;
import co.com.sofka.dulceria.personal.value.CajeroId;
import co.com.sofka.dulceria.personal.value.PersonalId;

public class ActualizarEmailCajero extends Command {
    private final PersonalId personalId;
    private final CajeroId cajeroId;
    private final Email email;


    public ActualizarEmailCajero(PersonalId personalId, CajeroId cajeroId, Email email) {
        this.personalId = personalId;
        this.cajeroId = cajeroId;
        this.email = email;
    }

    public PersonalId getPersonalId() {
        return personalId;
    }

    public CajeroId getCajeroId() {
        return cajeroId;
    }

    public Email getEmail() {
        return email;
    }
}
