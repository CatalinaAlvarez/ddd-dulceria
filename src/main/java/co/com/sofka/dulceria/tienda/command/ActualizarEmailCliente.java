package co.com.sofka.dulceria.tienda.command;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.dulceria.generics.Email;
import co.com.sofka.dulceria.tienda.value.ClienteId;
import co.com.sofka.dulceria.tienda.value.TiendaId;

public class ActualizarEmailCliente extends Command {

    private final TiendaId tiendaId;
    private final ClienteId clienteId;
    private final Email email;


    public ActualizarEmailCliente(TiendaId tiendaId, ClienteId clienteId, Email email) {
        this.tiendaId = tiendaId;
        this.clienteId = clienteId;
        this.email = email;
    }

    public TiendaId getTiendaId() {
        return tiendaId;
    }

    public ClienteId getClienteId() {
        return clienteId;
    }

    public Email getEmail() {
        return email;
    }
}
