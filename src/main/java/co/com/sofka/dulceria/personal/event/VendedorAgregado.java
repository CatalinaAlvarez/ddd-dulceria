package co.com.sofka.dulceria.personal.event;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.dulceria.generics.Email;
import co.com.sofka.dulceria.generics.Nombre;
import co.com.sofka.dulceria.personal.value.VendedorId;

public class VendedorAgregado extends DomainEvent {

    private final VendedorId vendedorId;
    private final Nombre nombre;
    private final Email email;

    public VendedorAgregado(VendedorId vendedorId, Nombre nombre, Email email) {
        super("sofka.personal.vendedorAgregado");
        this.vendedorId = vendedorId;
        this.nombre = nombre;
        this.email = email;
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
