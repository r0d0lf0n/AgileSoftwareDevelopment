package it.unical.info.banking.data.entities;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import java.util.Objects;

@Entity
@DiscriminatorValue("V")
public class VariableRate extends Contract {

    @Column(name = "SPREAD")
    private Double spread;

    public Double getSpread() {
        return spread;
    }

    public void setSpread(Double spread) {
        this.spread = spread;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        VariableRate that = (VariableRate) o;
        return Objects.equals(spread, that.spread);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), spread);
    }

    @Override
    public String toString() {
        return "VariableRate{" +
                "spread=" + spread +
                '}';
    }
}