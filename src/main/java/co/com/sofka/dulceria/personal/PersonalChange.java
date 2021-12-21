package co.com.sofka.dulceria.personal;

import co.com.sofka.domain.generic.EventChange;
import co.com.sofka.dulceria.inventario.event.CantidadProductoActualizada;
import co.com.sofka.dulceria.personal.event.*;

import java.util.HashSet;

public class PersonalChange extends EventChange {
    public PersonalChange(Personal personal) {

        apply((PersonalCreado event)->{
            personal.vendedores = new HashSet<>();
            personal.cajero = event.getCajero();
            personal.encargado = event.getEncargado();
        });

        apply((VendedorAgregado event)->{
            personal.vendedores.add(new Vendedor(
                    event.getVendedorId(),
                    event.getNombre(),
                    event.getEmail()
            ));
        });

        apply((NombreCajeroActualizado event )->{ //VERIFICAR
            personal.cajero.nombre = event.getNombre();
        });

        apply((EmailCajeroActualizado event )->{
            personal.cajero.email = event.getEmail();
        });

        apply((NombreCajeroActualizado event )->{ //VERIFICAR
            personal.cajero.nombre = event.getNombre();
        });

        apply((EmailCajeroActualizado event )->{
            personal.cajero.email = event.getEmail();
        });

        apply((NombreVendedorActualizado event )->{
            var funcion = personal.getVendedorPorId(event.getVendedorId())
                    .orElseThrow(()-> new IllegalArgumentException("No se encuentra el vendedor"));
            funcion.actualizarNombre(event.getNombre());
        });

        apply((EmailVendedorActualizado event )->{
            var funcion = personal.getVendedorPorId(event.getVendedorId())
                    .orElseThrow(()-> new IllegalArgumentException("No se encuentra el vendedor"));
            funcion.actualizarEmail(event.getEmail());
        });

    }
}
