package co.com.sofka.dulceria.tienda.command;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.dulceria.tienda.value.TiendaId;
import co.com.sofka.dulceria.tienda.value.Total;
import co.com.sofka.dulceria.tienda.value.VentaId;

public class ActualizarTotalVenta extends Command {

    private final TiendaId tiendaId;
    private final VentaId ventaId;
    private final Total total;


    public ActualizarTotalVenta(TiendaId tiendaId, VentaId ventaId, Total total) {
        this.tiendaId = tiendaId;
        this.ventaId = ventaId;
        this.total = total;
    }

    public TiendaId getTiendaId() {
        return tiendaId;
    }

    public VentaId getVentaId() {
        return ventaId;
    }

    public Total getTotal() {
        return total;
    }
}
