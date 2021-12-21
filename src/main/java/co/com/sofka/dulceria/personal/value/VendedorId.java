package co.com.sofka.dulceria.personal.value;

import co.com.sofka.domain.generic.Identity;

public class VendedorId extends Identity {

    public VendedorId(){

    }

    public VendedorId(String id) {
        super(id);
    }

    public static VendedorId of(String id){
        return new VendedorId(id);
    }
}
