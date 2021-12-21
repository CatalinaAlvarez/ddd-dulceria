package co.com.sofka.dulceria.personal.command;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.dulceria.generics.Email;
import co.com.sofka.dulceria.generics.Nombre;
import co.com.sofka.dulceria.personal.value.PersonalId;
import co.com.sofka.dulceria.personal.value.VendedorId;

public class AgregarVendedor extends Command {

    private final PersonalId personalId;
    private final VendedorId vendedorId;
    private final Nombre nombre;
    private final Email email;

    public AgregarVendedor(PersonalId personalId, PersonalId personalId1, VendedorId vendedorId, Nombre nombre, Email email) {
        this.personalId = personalId1;
        this.vendedorId = vendedorId;
        this.nombre = nombre;
        this.email = email;
    }

    public PersonalId getPersonalId() {
        return personalId;
    }

    public VendedorId getVendedorId() {
        return vendedorId;
    }

    public Nombre getNombre() {
        return nombre;
    }

    public Email getEmail() {
        return email;
    }
}
