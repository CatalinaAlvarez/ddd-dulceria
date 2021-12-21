package co.com.sofka.dulceria.inventario.command;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.dulceria.generics.Nombre;
import co.com.sofka.dulceria.inventario.value.*;

public class AgregarProducto extends Command {

    private final InventarioId inventarioId;
    private final ProductoId entityId;
    private final Categoria categoria;
    private final Nombre nombre;
    private final Cantidad cantidad;
    private final Precio precio;


    public AgregarProducto(InventarioId inventarioId, ProductoId entityId, Categoria categoria, Nombre nombre, Cantidad cantidad, Precio precio) {
        this.inventarioId = inventarioId;
        this.entityId = entityId;
        this.categoria = categoria;
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.precio = precio;
    }

    public InventarioId getInventarioId() {
        return inventarioId;
    }

    public ProductoId getEntityId() {
        return entityId;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public Nombre getNombre() {
        return nombre;
    }

    public Cantidad getCantidad() {
        return cantidad;
    }

    public Precio getPrecio() {
        return precio;
    }
}
