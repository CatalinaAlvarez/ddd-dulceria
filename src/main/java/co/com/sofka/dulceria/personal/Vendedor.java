package co.com.sofka.dulceria.personal;

import co.com.sofka.domain.generic.Entity;
import co.com.sofka.dulceria.generics.Nombre;
import co.com.sofka.dulceria.generics.Email;
import co.com.sofka.dulceria.personal.value.VendedorId;

import java.util.Objects;

public class Vendedor extends Entity<VendedorId>{
    protected Nombre nombre;
    protected Email email;


    public Vendedor(VendedorId entityId, Nombre nombre, Email email) {
        super(entityId);
        this.nombre = Objects.requireNonNull(nombre);
        this.email = Objects.requireNonNull(email);
    }

    public void actualizarNombre(Nombre nombre){
        this.nombre = Objects.requireNonNull(nombre);
    }
    public void actualizarEmail(Email email){
        this.email = Objects.requireNonNull(email);
    }

    public Nombre nombre() {
        return nombre;
    }

    public Email email() {
        return email;
    }
}

