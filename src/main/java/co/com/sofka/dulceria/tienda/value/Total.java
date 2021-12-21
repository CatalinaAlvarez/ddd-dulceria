package co.com.sofka.dulceria.tienda.value;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Total implements ValueObject<Double> {

    private final Double value;

    public Total(Double value){
        this.value = Objects.requireNonNull(value);
        if(this.value < 0){
            throw new IllegalArgumentException("El total no puede ser menor a cero");
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Total total = (Total) o;
        return Objects.equals(value, total.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }

    @Override
    public Double value() {
        return value;
    }
}
