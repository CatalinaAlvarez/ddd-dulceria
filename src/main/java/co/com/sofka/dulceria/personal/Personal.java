package co.com.sofka.dulceria.personal;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.dulceria.personal.value.PersonalId;
import co.com.sofka.dulceria.tienda.value.TiendaId;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Personal extends AggregateEvent<PersonalId> {

    protected Set<Vendedor> vendedores;
    protected Cajero cajero;
    protected Encargado encargado;


    public Personal(PersonalId entityId, Cajero cajero, Encargado encargado) {
        super(entityId);
        this.cajero = Objects.requireNonNull(cajero);
        this.encargado = Objects.requireNonNull(encargado);
        this.vendedores = new HashSet<>();
    } //VALORAR SI SE PUEDE HACER EL PRIMER ADD DEL SET PARA PEDIR UNO
}
