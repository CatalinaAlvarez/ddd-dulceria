package co.com.sofka.dulceria.personal.command;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.dulceria.generics.Nombre;
import co.com.sofka.dulceria.personal.value.PersonalId;
import co.com.sofka.dulceria.personal.value.VendedorId;

public class ActualizarNombreVendedor extends Command {

    private final PersonalId personalId;
    private final VendedorId vendedorId;
    private final Nombre nombre;


    public ActualizarNombreVendedor(PersonalId personalId, VendedorId vendedorId, Nombre nombre) {
        this.personalId = personalId;
        this.vendedorId = vendedorId;
        this.nombre = nombre;
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
}
