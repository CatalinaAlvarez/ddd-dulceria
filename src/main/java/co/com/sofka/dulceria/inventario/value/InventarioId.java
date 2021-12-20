package co.com.sofka.dulceria.inventario.value;

import co.com.sofka.domain.generic.Identity;


public class InventarioId extends Identity {


    public InventarioId(){

    }

    public InventarioId(String id) {
        super(id);
    }

    public static InventarioId of(String id){
        return new InventarioId(id);
    }
}
