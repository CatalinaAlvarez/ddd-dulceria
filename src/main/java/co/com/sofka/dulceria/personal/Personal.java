package co.com.sofka.dulceria.personal;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.dulceria.generics.Email;
import co.com.sofka.dulceria.generics.Nombre;
import co.com.sofka.dulceria.inventario.Inventario;
import co.com.sofka.dulceria.inventario.InventarioChange;
import co.com.sofka.dulceria.inventario.Producto;
import co.com.sofka.dulceria.inventario.event.CantidadProductoActualizada;
import co.com.sofka.dulceria.inventario.event.EstanteriaAgregada;
import co.com.sofka.dulceria.inventario.value.*;
import co.com.sofka.dulceria.personal.event.*;
import co.com.sofka.dulceria.personal.value.CajeroId;
import co.com.sofka.dulceria.personal.value.EncargadoId;
import co.com.sofka.dulceria.personal.value.PersonalId;
import co.com.sofka.dulceria.personal.value.VendedorId;
import co.com.sofka.dulceria.tienda.value.TiendaId;

import java.util.*;

public class Personal extends AggregateEvent<PersonalId> {

    protected Set<Vendedor> vendedores;
    protected Cajero cajero;
    protected Encargado encargado;


    public Personal(PersonalId entityId, Cajero cajero, Encargado encargado) {
        super(entityId);
        this.cajero = Objects.requireNonNull(cajero);
        this.encargado = Objects.requireNonNull(encargado);
        this.vendedores = new HashSet<>();
        appendChange(new PersonalCreado(entityId, cajero, encargado)).apply();
    } //VALORAR SI SE PUEDE HACER EL PRIMER ADD DEL SET PARA PEDIR UNO

    private Personal(PersonalId personalId){
        super(personalId);
        subscribe(new PersonalChange(this));

    }

    public static Personal from(PersonalId personalId, List<DomainEvent> events){
        var personal = new Personal(personalId);
        events.forEach(personal::applyEvent);
        return personal;
    }

    public void agregarVendedor(VendedorId vendedorId, Nombre nombre, Email email){
        Objects.requireNonNull(vendedorId);
        Objects.requireNonNull(nombre);
        Objects.requireNonNull(email);
        //Vendedor vendedor = new Vendedor(vendedorId, nombre, email);
        //this.vendedores.add(vendedor); REVISAR
        appendChange(new VendedorAgregado(vendedorId, nombre, email)).apply();
    }

    public void actualizarNombreVendedor(VendedorId entityId, Nombre nombre){
        appendChange(new NombreVendedorActualizado(entityId, nombre)).apply();
    }

    public void actualizarEmailVendedor(VendedorId entityId, Email email){
        appendChange(new EmailVendedorActualizado(entityId, email)).apply();
    }

    public void actualizarNombreCajero(CajeroId entityId, Nombre nombre){
        appendChange(new NombreCajeroActualizado(entityId, nombre)).apply();
    }

    public void actualizarEmailCajero(CajeroId entityId, Email email){
        appendChange(new EmailCajeroActualizado(entityId, email)).apply();
    }

    public void actualizarNombreEncargado(EncargadoId entityId, Nombre nombre){
        appendChange(new NombreEncargadoActualizado(entityId, nombre)).apply();
    }

    public void actualizarEmailEncargado(EncargadoId entityId, Email email){
        appendChange(new EmailEncargadoActualizado(entityId, email)).apply();
    }

    public Optional<Vendedor> getVendedorPorId(VendedorId entityId){
        return vendedores
                .stream()
                .filter(producto -> producto.identity().equals(entityId))
                .findFirst();
    }

    public Set<Vendedor> vendedores() {
        return vendedores;
    }

    public Cajero cajero() {
        return cajero;
    }

    public Encargado encargado() {
        return encargado;
    }
}
