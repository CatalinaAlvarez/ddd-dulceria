package co.com.sofka.dulceria.tienda;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.dulceria.inventario.value.InventarioId;
import co.com.sofka.dulceria.personal.value.PersonalId;
import co.com.sofka.dulceria.tienda.value.Locacion;
import co.com.sofka.dulceria.tienda.value.TiendaId;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Tienda extends AggregateEvent<TiendaId> {
    protected Set<Venta> ventas;
    protected Set<Cliente> clientes;
    protected PersonalId personalId;
    protected InventarioId inventarioId;
    protected Locacion locacion;

    public Tienda(TiendaId entityId) {
        super(entityId);
    }

    public Tienda(TiendaId entityId, PersonalId personalId, InventarioId inventarioId, Locacion locacion) {
        super(entityId);
        this.personalId = Objects.requireNonNull(personalId);
        this.inventarioId = Objects.requireNonNull(inventarioId);
        this.locacion = Objects.requireNonNull(locacion);
        this.ventas = new HashSet<>();
        this.clientes = new HashSet<>();
    }
}
