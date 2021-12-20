package co.com.sofka.dulceria.personal;

import co.com.sofka.domain.generic.Entity;
import co.com.sofka.dulceria.generics.Nombre;
import co.com.sofka.dulceria.generics.Email;
import co.com.sofka.dulceria.personal.value.VendedorId;

public class Vendedor extends Entity<VendedorId>{
    protected Nombre nombre;
    protected Email email;

    public Vendedor(VendedorId entityId) {
        super(entityId);
    }
}
