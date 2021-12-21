package co.com.sofka.dulceria.personal.command;

import co.com.sofka.dulceria.generics.Nombre;
import co.com.sofka.dulceria.personal.Encargado;
import co.com.sofka.dulceria.personal.value.PersonalId;

public class ActualizarNombreEncargado {
    private final PersonalId personalId;
    private final Encargado encargadoId;
    private final Nombre nombre;

    public ActualizarNombreEncargado(PersonalId personalId, Encargado encargadoId, Nombre nombre) {
        this.personalId = personalId;
        this.encargadoId = encargadoId;
        this.nombre = nombre;
    }

    public PersonalId getPersonalId() {
        return personalId;
    }

    public Encargado getEncargadoId() {
        return encargadoId;
    }

    public Nombre getNombre() {
        return nombre;
    }
}
