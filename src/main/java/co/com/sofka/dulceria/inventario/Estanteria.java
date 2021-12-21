package co.com.sofka.dulceria.inventario;

import co.com.sofka.domain.generic.Entity;
import co.com.sofka.dulceria.inventario.value.Cantidad;
import co.com.sofka.dulceria.inventario.value.Capacidad;
import co.com.sofka.dulceria.inventario.value.EstanteriaId;
import co.com.sofka.dulceria.inventario.value.ProductoId;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;


public class Estanteria extends Entity<EstanteriaId> {
    protected Capacidad capacidad;
    protected Set<ProductoId> productosId;
    protected ProductoId productoId;

    public Estanteria(EstanteriaId entityId, Capacidad capacidad) {

        super(entityId);
        this.capacidad = Objects.requireNonNull(capacidad);
        productosId = new HashSet<>();
    }

    public void agregarProducto(ProductoId productoId){
        this.productosId.add(productoId);
    }

    public Capacidad capacidad() {
        return capacidad;
    }

    public Set<ProductoId> productosId() {
        return productosId;
    }

    //Getter del producto por el ID


}
