package co.com.sofka.dulceria.inventario.value;

import co.com.sofka.domain.generic.Identity;

public class EstanteriaId extends Identity {

    public EstanteriaId(){

    }

    public EstanteriaId(String id) {
        super(id);
    }

    public static EstanteriaId of(String id){
        return new EstanteriaId(id);
    }
}
