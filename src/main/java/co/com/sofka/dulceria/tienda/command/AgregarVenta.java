package co.com.sofka.dulceria.tienda.command;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.dulceria.personal.value.CajeroId;
import co.com.sofka.dulceria.personal.value.VendedorId;
import co.com.sofka.dulceria.tienda.value.ClienteId;
import co.com.sofka.dulceria.tienda.value.TiendaId;
import co.com.sofka.dulceria.tienda.value.Total;
import co.com.sofka.dulceria.tienda.value.VentaId;

public class AgregarVenta extends Command {
    private final VentaId ventaId;
    private final TiendaId tiendaId;
    private final CajeroId cajeroId;
    private final VendedorId vendedorId;
    private final ClienteId clienteId;
    private final Total total;


    public AgregarVenta(VentaId ventaId, TiendaId tiendaId, CajeroId cajeroId, VendedorId vendedorId, ClienteId clienteId, Total total) {
        this.ventaId = ventaId;
        this.tiendaId = tiendaId;
        this.cajeroId = cajeroId;
        this.vendedorId = vendedorId;
        this.clienteId = clienteId;
        this.total = total;
    }

    public VentaId getVentaId() {
        return ventaId;
    }

    public TiendaId getTiendaId() {
        return tiendaId;
    }

    public CajeroId getCajeroId() {
        return cajeroId;
    }

    public VendedorId getVendedorId() {
        return vendedorId;
    }

    public ClienteId getClienteId() {
        return clienteId;
    }

    public Total getTotal() {
        return total;
    }
}
