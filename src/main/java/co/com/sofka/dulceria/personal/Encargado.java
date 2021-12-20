package co.com.sofka.dulceria.personal;

import co.com.sofka.domain.generic.Entity;
import co.com.sofka.dulceria.generics.Nombre;
import co.com.sofka.dulceria.generics.Email;
import co.com.sofka.dulceria.personal.value.EncargadoId;

import java.util.Objects;

public class Encargado extends Entity<EncargadoId> {
    protected Nombre nombre;
    protected Email email;

    public Encargado(EncargadoId entityId, Nombre nombre, Email email) {
        super(entityId);
        this.nombre = Objects.requireNonNull(nombre);
        this.email = Objects.requireNonNull(email);
    }
}
