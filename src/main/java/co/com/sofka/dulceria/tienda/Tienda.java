package co.com.sofka.dulceria.tienda;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.dulceria.generics.Email;
import co.com.sofka.dulceria.generics.Nombre;
import co.com.sofka.dulceria.inventario.value.InventarioId;
import co.com.sofka.dulceria.inventario.value.ProductoId;
import co.com.sofka.dulceria.personal.value.CajeroId;
import co.com.sofka.dulceria.personal.value.PersonalId;
import co.com.sofka.dulceria.personal.value.VendedorId;
import co.com.sofka.dulceria.tienda.event.*;
import co.com.sofka.dulceria.tienda.value.*;

import java.util.*;

public class Tienda extends AggregateEvent<TiendaId> {
    protected Set<Venta> ventas;
    protected Set<Cliente> clientes;
    protected PersonalId personalId;
    protected InventarioId inventarioId;
    protected Locacion locacion;


    public Tienda(TiendaId entityId, PersonalId personalId, InventarioId inventarioId, Locacion locacion) {
        super(entityId);
        this.personalId = Objects.requireNonNull(personalId);
        this.inventarioId = Objects.requireNonNull(inventarioId);
        this.locacion = Objects.requireNonNull(locacion);
        this.ventas = new HashSet<>();
        this.clientes = new HashSet<>();
        appendChange(new TiendaCreada(entityId, personalId, inventarioId, locacion)).apply();
    }

    private Tienda(TiendaId tiendaId){
        super(tiendaId);
        subscribe(new TiendaChange(this));

    }

    public static Tienda from(TiendaId tiendaId, List<DomainEvent> events){
        var tienda = new Tienda(tiendaId);
        events.forEach(tienda::applyEvent);
        return tienda;
    }

    public void agregarVenta(VentaId entityId, TiendaId tiendaId, CajeroId cajeroId, VendedorId vendedorId, ClienteId clienteId, Total total){
        Objects.requireNonNull(entityId);
        Objects.requireNonNull(tiendaId);
        Objects.requireNonNull(cajeroId);
        Objects.requireNonNull(clienteId);
        Objects.requireNonNull(total);
        appendChange(new VentaAgregada(entityId, tiendaId, cajeroId, vendedorId, clienteId, total)).apply();
    }

    public void agregarCliente(ClienteId entityId, Nombre nombre, Email email){
        Objects.requireNonNull(entityId);
        Objects.requireNonNull(nombre);
        Objects.requireNonNull(email);
        appendChange(new ClienteAgregado(entityId, nombre, email)).apply();
    }

    public void actualizarLocacion(TiendaId entityId, Locacion locacion){
        Objects.requireNonNull(entityId);
        Objects.requireNonNull(locacion);
        appendChange(new LocacionActualizada(entityId, locacion)).apply();
    }

    public void agregarProductoVenta(VentaId entityId, ProductoId productoId){
        Objects.requireNonNull(entityId);
        Objects.requireNonNull(productoId);
        appendChange(new ProductoAgregadoAVenta(entityId, productoId)).apply();
    }

    public void actualizarTotalVenta(VentaId entityId, Total total){
        Objects.requireNonNull(entityId);
        Objects.requireNonNull(total);
        appendChange(new TotalVentaActualizado(entityId, total)).apply();
    }

    public void actualizarNombreCliente(ClienteId entityId, Nombre nombre){
        Objects.requireNonNull(entityId);
        Objects.requireNonNull(nombre);
        appendChange(new NombreClienteActualizado(entityId, nombre)).apply();
    }

    public void actualizarEmailCliente(ClienteId entityId, Email email){
        Objects.requireNonNull(entityId);
        Objects.requireNonNull(email);
        appendChange(new EmailClienteActualizado(entityId, email)).apply();
    }


    public Optional<Venta> getVentaPorId(VentaId ventaId){
        return ventas
                .stream()
                .filter(venta -> venta.identity().equals(entityId))
                .findFirst();
    }

    public Optional<Cliente> getClientePorId(ClienteId clienteId){
        return clientes
                .stream()
                .filter(cliente -> cliente.identity().equals(entityId))
                .findFirst();
    }

    public Set<Venta> ventas() {
        return ventas;
    }

    public Set<Cliente> clientes() {
        return clientes;
    }

    public PersonalId personalId() {
        return personalId;
    }

    public InventarioId inventarioId() {
        return inventarioId;
    }

    public Locacion locacion() {
        return locacion;
    }
}
