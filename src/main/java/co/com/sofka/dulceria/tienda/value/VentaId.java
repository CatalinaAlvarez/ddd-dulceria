package co.com.sofka.dulceria.tienda.value;

import co.com.sofka.domain.generic.Identity;

public class VentaId extends Identity {

    public VentaId(){

    }

    public VentaId(String id) {
        super(id);
    }

    public static VentaId of(String id){
        return new VentaId(id);
    }
}
