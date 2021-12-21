package co.com.sofka.dulceria.personal.value;

import co.com.sofka.domain.generic.Identity;


public class CajeroId extends Identity {

    public CajeroId(){

    }

    public CajeroId(String id) {
        super(id);
    }

    public static CajeroId of(String id){
        return new CajeroId(id);
    }

}
