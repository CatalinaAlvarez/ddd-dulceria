package co.com.sofka.dulceria.inventario;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.dulceria.generics.Nombre;
import co.com.sofka.dulceria.inventario.event.*;
import co.com.sofka.dulceria.inventario.value.*;

import java.util.*;

public class Inventario extends AggregateEvent<InventarioId> {

    protected Nombre nombre;
    protected Set<Estanteria> estanterias;
    protected Set<Producto> productos;

    public Inventario(InventarioId entityId, Nombre nombre) {

        super(entityId);
        this.estanterias = new HashSet<>();
        this.productos = new HashSet<>();
        appendChange(new InventarioCreado(entityId, nombre)).apply();
    }

    private Inventario(InventarioId inventarioId){
        super(inventarioId);
        subscribe(new InventarioChange(this));

    }

    public static Inventario from(InventarioId inventarioId, List<DomainEvent> events){
        var inventario = new Inventario(inventarioId);
        events.forEach(inventario::applyEvent);
        return inventario;
    }

    public void agregarEstanteria(EstanteriaId estanteriaId, Capacidad capacidad){
        Objects.requireNonNull(estanteriaId);
        Objects.requireNonNull(capacidad);
        appendChange(new EstanteriaAgregada(estanteriaId, capacidad)).apply();
    }

    public void agregarProducto(ProductoId entityId, Categoria categoria, Nombre nombre, Cantidad cantidad, Precio precio){
        Objects.requireNonNull(entityId);
        Objects.requireNonNull(categoria);
        Objects.requireNonNull(nombre);
        Objects.requireNonNull(cantidad);
        Objects.requireNonNull(precio);
        appendChange(new ProductoAgregado(entityId, categoria, nombre, cantidad, precio)).apply();
    }

    public void actualizarCantidadProducto(ProductoId entityId, Cantidad cantidad){
        Objects.requireNonNull(entityId);
        Objects.requireNonNull(cantidad);
        appendChange(new CantidadProductoActualizada(entityId, cantidad)).apply();
    }

    public void actualizarPrecioProducto(ProductoId entityId, Precio precio){
        Objects.requireNonNull(entityId);
        Objects.requireNonNull(precio);
        appendChange(new PrecioProductoActualizado(entityId, precio)).apply();
    }

    public void actualizarNombreProducto(ProductoId entityId, Nombre nombre){
        Objects.requireNonNull(entityId);
        Objects.requireNonNull(nombre);
        appendChange(new NombreProductoActualizado(entityId, nombre)).apply();
    }

    public void agregarProductoEstanteria(EstanteriaId entityId, ProductoId productoId){
        Objects.requireNonNull(entityId);
        Objects.requireNonNull(productoId);
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

    public Nombre nombre() {
        return nombre;
    }
}
