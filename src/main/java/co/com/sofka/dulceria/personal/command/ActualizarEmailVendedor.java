package co.com.sofka.dulceria.personal.command;

import co.com.sofka.dulceria.generics.Email;
import co.com.sofka.dulceria.personal.value.PersonalId;
import co.com.sofka.dulceria.personal.value.VendedorId;

public class ActualizarEmailVendedor {

    private final PersonalId personalId;
    private final VendedorId vendedorId;
    private final Email email;

    public ActualizarEmailVendedor(PersonalId personalId, VendedorId vendedorId, Email email) {
        this.personalId = personalId;
        this.vendedorId = vendedorId;
        this.email = email;
    }

    public PersonalId getPersonalId() {
        return personalId;
    }

    public VendedorId getVendedorId() {
        return vendedorId;
    }

    public Email getEmail() {
        return email;
    }
}
