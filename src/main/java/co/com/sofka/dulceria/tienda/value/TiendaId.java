package co.com.sofka.dulceria.tienda.value;

import co.com.sofka.domain.generic.Identity;

public class TiendaId extends Identity {
    public TiendaId(){

    }

    public TiendaId(String id) {
        super(id);
    }

    public static TiendaId of(String id){
        return new TiendaId(id);
    }
}
