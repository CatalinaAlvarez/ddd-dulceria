package co.com.sofka.dulceria.personal.value;

import co.com.sofka.domain.generic.Identity;

public class PersonalId extends Identity {
    public PersonalId(){

    }

    public PersonalId(String id) {
        super(id);
    }

    public static PersonalId of(String id){
        return new PersonalId(id);
    }

}
