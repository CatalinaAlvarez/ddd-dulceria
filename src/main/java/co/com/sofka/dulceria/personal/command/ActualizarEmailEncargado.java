package co.com.sofka.dulceria.personal.command;

import co.com.sofka.dulceria.generics.Email;
import co.com.sofka.dulceria.personal.Encargado;
import co.com.sofka.dulceria.personal.value.PersonalId;

public class ActualizarEmailEncargado {
    private final PersonalId personalId;
    private final Encargado encargadoId;
    private final Email email;


    public ActualizarEmailEncargado(PersonalId personalId, Encargado encargadoId, Email email) {
        this.personalId = personalId;
        this.encargadoId = encargadoId;
        this.email = email;
    }

    public PersonalId getPersonalId() {
        return personalId;
    }

    public Encargado getEncargadoId() {
        return encargadoId;
    }

    public Email getEmail() {
        return email;
    }
}
