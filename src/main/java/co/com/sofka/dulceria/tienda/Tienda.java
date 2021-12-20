package co.com.sofka.dulceria.tienda;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.dulceria.inventario.value.InventarioId;
import co.com.sofka.dulceria.personal.value.PersonalId;
import co.com.sofka.dulceria.tienda.value.Locacion;
import co.com.sofka.dulceria.tienda.value.TiendaId;

import java.util.Set;

public class Tienda extends AggregateEvent<TiendaId> {
    protected Set<InventarioId> inventario;
    protected Set<Venta> ventas;
    protected Set<Cliente> clientes;
    protected PersonalId personalId;
    protected Locacion locacion;

    public Tienda(TiendaId entityId) {
        super(entityId);
    }
}
