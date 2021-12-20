package co.com.sofka.dulceria.inventario;

import co.com.sofka.domain.generic.Entity;
import co.com.sofka.dulceria.generics.Nombre;
import co.com.sofka.dulceria.inventario.value.*;

import java.util.Objects;

public class Producto extends Entity<ProductoId> {
    protected Categoria categoria;
    protected Nombre nombre;
    protected Cantidad cantidad;
    protected Precio precio;

    public Producto(ProductoId entityId, Categoria categoria, Nombre nombre, Cantidad cantidad, Precio precio) {
        super(entityId);
        this.categoria = Objects.requireNonNull(categoria);
        this.nombre = Objects.requireNonNull(nombre);
        this.cantidad = Objects.requireNonNull(cantidad);
        this.precio = Objects.requireNonNull(precio);
    }
}
