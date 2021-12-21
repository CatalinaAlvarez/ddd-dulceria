package co.com.sofka.dulceria.tienda.command;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.dulceria.generics.Nombre;
import co.com.sofka.dulceria.tienda.value.ClienteId;
import co.com.sofka.dulceria.tienda.value.TiendaId;

public class ActualizarNombreCliente extends Command {

    private final TiendaId tiendaId;
    private final ClienteId clienteId;
    private final Nombre nombre;


    public ActualizarNombreCliente(TiendaId tiendaId, ClienteId clienteId, Nombre nombre) {
        this.tiendaId = tiendaId;
        this.clienteId = clienteId;
        this.nombre = nombre;
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
}
