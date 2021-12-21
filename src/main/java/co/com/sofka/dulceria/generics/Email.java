package co.com.sofka.dulceria.generics;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Email implements ValueObject<String> {

    private final String value;

    public Email(String value){
        this.value = Objects.requireNonNull(value);
        if(this.value.isBlank()){
            throw new IllegalArgumentException("El email no puede estar vacío");
        }
        if(this.value.length()<3){
            throw new IllegalArgumentException("El email no puede tener menos de cuatro caractéres");
        }
        if (!value.matches("[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)@[_A-Za-z0-9-]+(\\.[_A-Za-z0-9-]+)(\\.[_A-Za-z]{2,})$")){
            throw new IllegalArgumentException("El email no es válido");
       }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Email email = (Email) o;
        return Objects.equals(value, email.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }

    @Override
    public String value() {
        return value;
    }
}
