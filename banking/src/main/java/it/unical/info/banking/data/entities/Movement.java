package it.unical.info.banking.data.entities;

import javax.persistence.*;
import java.util.Date;
import java.util.Objects;

@Entity
@Table(name = "Movement")
public class Movement {

    protected Movement() {}

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY, optional = true)
    @JoinColumn(name = "accountNumber", referencedColumnName = "id")
    private BankAccount accountNumber;

    @Temporal(TemporalType.DATE)
    @Column(name = "date")
    private Date date;

    @Basic(optional = false)
    @Column(name = "sequentialNumber")
    private Date sequentialNumber;

    @ManyToOne(fetch = FetchType.LAZY, optional = true)
    @JoinColumn(name = "contract", referencedColumnName = "id")
    private Contract contract;

    @Basic(optional = false)
    @Column(name = "movementType")
    private String movementType;

    @Basic(optional = false)
    @Column(name = "quantity")
    private Long quantity;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public BankAccount getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(BankAccount accountNumber) {
        this.accountNumber = accountNumber;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Date getSequentialNumber() {
        return sequentialNumber;
    }

    public void setSequentialNumber(Date sequentialNumber) {
        this.sequentialNumber = sequentialNumber;
    }

    public Contract getContract() {
        return contract;
    }

    public void setContract(Contract contract) {
        this.contract = contract;
    }

    public String getMovementType() {
        return movementType;
    }

    public void setMovementType(String movementType) {
        this.movementType = movementType;
    }

    public Long getQuantity() {
        return quantity;
    }

    public void setQuantity(Long quantity) {
        this.quantity = quantity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Movement movement = (Movement) o;
        return Objects.equals(id, movement.id) &&
                Objects.equals(accountNumber, movement.accountNumber) &&
                Objects.equals(date, movement.date) &&
                Objects.equals(sequentialNumber, movement.sequentialNumber) &&
                Objects.equals(contract, movement.contract) &&
                Objects.equals(movementType, movement.movementType) &&
                Objects.equals(quantity, movement.quantity);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, accountNumber, date, sequentialNumber, contract, movementType, quantity);
    }

    @Override
    public String toString() {
        return "Movement{" +
                "id=" + id +
                ", accountNumber=" + accountNumber +
                ", date=" + date +
                ", sequentialNumber=" + sequentialNumber +
                ", contract=" + contract +
                ", movementType='" + movementType + '\'' +
                ", quantity=" + quantity +
                '}';
    }
}
