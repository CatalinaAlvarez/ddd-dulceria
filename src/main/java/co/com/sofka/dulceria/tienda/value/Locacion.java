package co.com.sofka.dulceria.tienda.value;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Locacion implements ValueObject<String> {

    private final String value;

    public Locacion(String value){
        this.value = Objects.requireNonNull(value);
        if(this.value.isBlank()){
            throw new IllegalArgumentException("La locación no puede estar vacía");
        }
        if(this.value.length()<3){
            throw new IllegalArgumentException("La locación no puede tener menos de cuatro caractéres");
        }
        if(this.value.length()>100){
            throw new IllegalArgumentException("La locación no puede tener más de cien caractéres");
        }
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Locacion locacion = (Locacion) o;
        return Objects.equals(value, locacion.value);
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
