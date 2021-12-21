package co.com.sofka.dulceria.tienda.command;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.dulceria.generics.Email;
import co.com.sofka.dulceria.generics.Nombre;
import co.com.sofka.dulceria.tienda.value.ClienteId;
import co.com.sofka.dulceria.tienda.value.TiendaId;

public class AgregarCliente extends Command {

    private final TiendaId tiendaId;
    private final ClienteId clienteId;
    private final Nombre nombre;
    private final Email email;


    public AgregarCliente(TiendaId tiendaId, ClienteId clienteId, Nombre nombre, Email email) {
        this.tiendaId = tiendaId;
        this.clienteId = clienteId;
        this.nombre = nombre;
        this.email = email;
    }

    public TiendaId getTiendaId() {
        return tiendaId;
    }

    public ClienteId getClienteId() {
        return clienteId;
    }

    public Nombre getNombre() {
        return nombre;
    }

    public Email getEmail() {
        return email;
    }
}
