package co.com.sofka.dulceria.tienda;

import co.com.sofka.domain.generic.EventChange;
import co.com.sofka.dulceria.tienda.event.*;

import java.util.HashSet;

public class TiendaChange extends EventChange {
    public TiendaChange(Tienda tienda) {

        apply((TiendaCreada event)->{
            tienda.clientes = new HashSet<>();
            tienda.ventas = new HashSet<>();
            tienda.inventarioId = event.getInventarioId();
            tienda.locacion = event.getLocacion();
            tienda.personalId = event.getPersonalId();
        });

        apply((VentaAgregada event)->{
            tienda.ventas.add(new Venta(
                    event.getVentaId(),
                    event.getTiendaId(),
                    event.getCajeroId(),
                    event.getVendedorId(),
                    event.getClienteId(),
                    event.getTotal()

            ));
        });

        apply((ClienteAgregado event)->{
            tienda.clientes.add(new Cliente(
                    event.getClienteId(),
                    event.getNombre(),
                    event.getEmail()
            ));
        });

        apply((LocacionActualizada event )->{ //VERIFICAR
            tienda.locacion = event.getLocacion();
        });

        apply((ProductoAgregadoAVenta event )->{
            var funcion = tienda.getVentaPorId(event.getVentaId())
                    .orElseThrow(()-> new IllegalArgumentException("No se encuentra la venta"));
            funcion.agregarProducto(event.getProductoId());
        });

        apply((TotalVentaActualizado event )->{
            var funcion = tienda.getVentaPorId(event.getVentaId())
                    .orElseThrow(()-> new IllegalArgumentException("No se encuentra la venta"));
            funcion.actualizarTotal(event.getTotal());
        });

        apply((NombreClienteActualizado event )->{
            var funcion = tienda.getClientePorId(event.getClienteId())
                    .orElseThrow(()-> new IllegalArgumentException("No se encuentra el cliente"));
            funcion.actualizarNombre(event.getNombre());
        });

        apply((EmailClienteActualizado event )->{
            var funcion = tienda.getClientePorId(event.getClienteId())
                    .orElseThrow(()-> new IllegalArgumentException("No se encuentra el cliente"));
            funcion.actualizarEmail(event.getEmail());
        });


    }
}
