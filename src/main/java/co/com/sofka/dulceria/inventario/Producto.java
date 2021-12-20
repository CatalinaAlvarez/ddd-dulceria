package co.com.sofka.dulceria.inventario;

import co.com.sofka.domain.generic.Entity;
import co.com.sofka.dulceria.generics.Nombre;
import co.com.sofka.dulceria.inventario.value.*;

public class Producto extends Entity<ProductoId> {
    protected Categoria categoria;
    protected Nombre nombre;
    protected Cantidad cantidad;
    protected Precio precio;

    public Producto(ProductoId entityId) {
        super(entityId);
    }
}
