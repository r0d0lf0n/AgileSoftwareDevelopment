package it.unical.info.banking.data.entities;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("F")
public class FixedRate extends Contract {

}
