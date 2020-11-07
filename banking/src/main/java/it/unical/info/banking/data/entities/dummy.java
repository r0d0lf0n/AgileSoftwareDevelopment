package it.unical.info.banking.data.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Objects;

@Entity
@Table(name = "dummy")
public class dummy {

    @Id
    @Column(name = "id")
    private Long Id;

    @Column(name = "name")
    private String name;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        dummy dummy = (dummy) o;
        return Objects.equals(Id, dummy.Id) &&
                Objects.equals(name, dummy.name);
    }

    @Override
    public String toString() {
        return "dummy{" +
                "Id=" + Id +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(Id, name);
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
