package co.com.sofka.dulceria.tienda.event;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.dulceria.tienda.value.Total;
import co.com.sofka.dulceria.tienda.value.VentaId;

public class TotalVentaActualizado extends DomainEvent {
    private final VentaId ventaId;
    private final Total total;

    public TotalVentaActualizado(VentaId entityId, Total total) {
        super("sofka.tienda.totalVentaActualizado");
        this.ventaId = entityId;
        this.total = total;
    }

    public VentaId getVentaId() {
        return ventaId;
    }

    public Total getTotal() {
        return total;
    }
}
