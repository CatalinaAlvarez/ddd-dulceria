package co.com.sofka.dulceria.personal;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.dulceria.personal.value.PersonalId;
import co.com.sofka.dulceria.tienda.value.TiendaId;

import java.util.Set;

public class Personal extends AggregateEvent<PersonalId> {

    protected Set<Vendedor> vendedores;
    protected Cajero cajero;
    protected Encargado encargado;

    public Personal(PersonalId entityId) {
        super(entityId);
    }
}
