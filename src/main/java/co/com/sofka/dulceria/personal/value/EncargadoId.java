package co.com.sofka.dulceria.personal.value;

import co.com.sofka.domain.generic.Identity;

public class EncargadoId extends Identity {

    public EncargadoId(){

    }

    public EncargadoId(String id) {
        super(id);
    }

    public static EncargadoId of(String id){
        return new EncargadoId(id);
    }
}
