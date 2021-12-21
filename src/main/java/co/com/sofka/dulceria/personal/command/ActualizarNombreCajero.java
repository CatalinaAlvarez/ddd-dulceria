package co.com.sofka.dulceria.personal.command;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.dulceria.generics.Nombre;
import co.com.sofka.dulceria.personal.value.CajeroId;
import co.com.sofka.dulceria.personal.value.PersonalId;

public class ActualizarNombreCajero extends Command {
    private final PersonalId personalId;
    private final CajeroId cajeroId;
    private final Nombre nombre;


    public ActualizarNombreCajero(PersonalId personalId, CajeroId cajeroId, Nombre nombre) {
        this.personalId = personalId;
        this.cajeroId = cajeroId;
        this.nombre = nombre;
    }

    public PersonalId getPersonalId() {
        return personalId;
    }

    public CajeroId getCajeroId() {
        return cajeroId;
    }

    public Nombre getNombre() {
        return nombre;
    }
}
