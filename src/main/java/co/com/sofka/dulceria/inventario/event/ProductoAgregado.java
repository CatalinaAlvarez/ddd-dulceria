package co.com.sofka.dulceria.inventario.event;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.dulceria.generics.Nombre;
import co.com.sofka.dulceria.inventario.Producto;
import co.com.sofka.dulceria.inventario.value.Cantidad;
import co.com.sofka.dulceria.inventario.value.Categoria;
import co.com.sofka.dulceria.inventario.value.Precio;
import co.com.sofka.dulceria.inventario.value.ProductoId;

public class ProductoAgregado extends DomainEvent {
    private final ProductoId productoId;
    private final Categoria categoria;
    private final Nombre nombre;
    private final Cantidad cantidad;
    private final Precio precio;

    public ProductoAgregado(ProductoId entityId, Categoria categoria, Nombre nombre, Cantidad cantidad, Precio precio) {
        super("sofka.inventario.productoAgregado");
        this.productoId = entityId;
        this.categoria = categoria;
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.precio = precio;
    }

    public ProductoId getProductoId() {
        return productoId;
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
