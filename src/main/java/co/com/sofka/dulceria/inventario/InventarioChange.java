package co.com.sofka.dulceria.inventario;

import co.com.sofka.domain.generic.EventChange;
import co.com.sofka.dulceria.inventario.event.*;

import java.util.HashSet;

public class InventarioChange extends EventChange {
    public InventarioChange(Inventario inventario) {

        apply((InventarioCreado event)->{
            inventario.nombre = event.getNombre();
            inventario.productos = new HashSet<>();
            inventario.estanterias = new HashSet<>();
        });

        apply((EstanteriaAgregada event)->{
            inventario.estanterias.add(new Estanteria(
                event.getEstanteriaId(),
                    event.getCapacidad()
            ));
        });

        apply((ProductoAgregado event)->{
            inventario.productos.add(new Producto(
                    event.getProductoId(),
                    event.getCategoria(),
                    event.getNombre(),
                    event.getCantidad(),
                    event.getPrecio()
            ));
        });

        apply((CantidadProductoActualizada event )->{
            var funcion = inventario.getProductoPorId(event.getProductoId())
                    .orElseThrow(()-> new IllegalArgumentException("No se encuentra el producto"));
            funcion.actualizarCantidad(event.getCantidad());
        });

        apply((PrecioProductoActualizado event )->{
            var funcion = inventario.getProductoPorId(event.getProductoId())
                    .orElseThrow(()-> new IllegalArgumentException("No se encuentra el producto"));
            funcion.actualizarPrecio(event.getPrecio());
        });

        apply((NombreProductoActualizado event )->{
            var funcion = inventario.getProductoPorId(event.getProductoId())
                    .orElseThrow(()-> new IllegalArgumentException("No se encuentra el producto"));
            funcion.actualizarNombre(event.getNombre());
        });

        apply((ProductoAgregadoAEstanteria event )->{
            var funcion = inventario.getEstanteriaPorId(event.getEstanteriaId())
                    .orElseThrow(()-> new IllegalArgumentException("No se encuentra la estanteria"));
            funcion.agregarProducto(event.getProductoId());
        });
    }
}
