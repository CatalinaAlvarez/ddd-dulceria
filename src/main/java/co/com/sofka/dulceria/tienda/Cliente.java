package co.com.sofka.dulceria.tienda;

import co.com.sofka.domain.generic.Entity;
import co.com.sofka.dulceria.generics.Email;
import co.com.sofka.dulceria.generics.Nombre;
import co.com.sofka.dulceria.tienda.value.ClienteId;

public class Cliente extends Entity<ClienteId> {
    protected Nombre nombre;
    protected Email email;
    public Cliente(ClienteId entityId) {
        super(entityId);
    }
}
