package co.com.sofka.dulceria.personal;

import co.com.sofka.domain.generic.Entity;
import co.com.sofka.dulceria.generics.Nombre;
import co.com.sofka.dulceria.personal.value.CajeroId;
import co.com.sofka.dulceria.generics.Email;

import java.util.Objects;

public class Cajero extends Entity<CajeroId> {
    protected Nombre nombre;
    protected Email email;

    public Cajero(CajeroId entityId, Nombre nombre, Email email) {
        super(entityId);
        this.nombre = Objects.requireNonNull(nombre);
        this.email = Objects.requireNonNull(email);
    }
}
