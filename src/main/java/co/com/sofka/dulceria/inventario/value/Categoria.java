package co.com.sofka.dulceria.inventario.value;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Categoria implements ValueObject<String> {

    private final String value;

    public Categoria(String value){
        this.value = Objects.requireNonNull(value);
        if(this.value.isBlank()){
            throw new IllegalArgumentException("La categoría no puede estar vacía");
        }
        if(this.value.length()<3){
            throw new IllegalArgumentException("La categoría no puede tener menos de cuatro caractéres");
        }
        if(this.value.length()>50){
            throw new IllegalArgumentException("La categoría no puede tener más de cincuenta caractéres");
        }
    }

    public String value() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Categoria categoria = (Categoria) o;
        return Objects.equals(value, categoria.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
