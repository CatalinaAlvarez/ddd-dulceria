package co.com.sofka.dulceria.inventario;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.dulceria.inventario.value.InventarioId;

import java.util.Set;

public class Inventario extends AggregateEvent<InventarioId> {
    protected Set<Estanteria> estanterias;
    protected Set<Producto> productos;



    public Inventario(InventarioId entityId) {
        super(entityId);
    }
}
