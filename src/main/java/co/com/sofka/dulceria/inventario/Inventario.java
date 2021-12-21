package co.com.sofka.dulceria.inventario;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.dulceria.generics.Nombre;
import co.com.sofka.dulceria.inventario.event.*;
import co.com.sofka.dulceria.inventario.value.*;

import java.util.HashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Inventario extends AggregateEvent<InventarioId> {

    protected Set<Estanteria> estanterias;
    protected Set<Producto> productos;

    public Inventario(InventarioId entityId) {

        super(entityId);
        this.estanterias = new HashSet<>();
        this.productos = new HashSet<>();
        appendChange(new InventarioCreado(entityId)).apply();
        //Revisar agregados
    }

    public void agregarEstanteria(EstanteriaId estanteriaId, Capacidad capacidad){
        Objects.requireNonNull(estanteriaId);
        Objects.requireNonNull(capacidad);
        //Estanteria estanteria = new Estanteria(estanteriaId, capacidad);
        //this.estanterias.add(estanteria); REVISAR
        appendChange(new EstanteriaAgregada(estanteriaId, capacidad)).apply();
    }

    public void agregarProducto(ProductoId entityId, Categoria categoria, Nombre nombre, Cantidad cantidad, Precio precio){
        Objects.requireNonNull(entityId);
        Objects.requireNonNull(categoria);
        Objects.requireNonNull(nombre);
        Objects.requireNonNull(cantidad);
        Objects.requireNonNull(precio);
        //Producto producto = new Producto(entityId, categoria, nombre, cantidad, precio);
        //this.productos.add(producto); //REVISAR
        appendChange(new ProductoAgregado(entityId, categoria, nombre, cantidad, precio)).apply();
    }

    public void actualizarCantidadProducto(ProductoId entityId, Cantidad cantidad){
        appendChange(new CantidadProductoActualizada(entityId, cantidad)).apply();
    }

    public void actualizarPrecioProducto(ProductoId entityId, Precio precio){
        appendChange(new PrecioProductoActualizado(entityId, precio)).apply();
    }

    public void actualizarNombreProducto(ProductoId entityId, Nombre nombre){
        appendChange(new NombreProductoActualizado(entityId, nombre)).apply();
    }

    public void agregarProductoEstanteria(EstanteriaId entityId, ProductoId productoId){
        appendChange(new ProductoAgregadoAEstanteria(entityId, productoId)).apply();
    }

    public Optional<Estanteria> getEstanteriaPorId(EstanteriaId entityId){
        return estanterias
                .stream()
                .filter(estanteria -> estanteria.identity().equals(entityId))
                .findFirst();
    }

    public Optional<Producto> getProductoPorId(ProductoId entityId){
        return productos
                .stream()
                .filter(producto -> producto.identity().equals(entityId))
                .findFirst();
    }

    public Set<Estanteria> estanterias() {
        return estanterias;
    }

    public Set<Producto> productos() {
        return productos;
    }
}
