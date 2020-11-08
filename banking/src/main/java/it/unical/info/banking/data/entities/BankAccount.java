package it.unical.info.banking.data.entities;

import it.unical.info.banking.data.helpers.AccountType;
import org.springframework.context.annotation.Primary;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;
import java.util.Set;

@Entity
@Table(name = "BankAccount")
public class BankAccount {

    //protected BankAccount() {}

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "accountNumber", nullable = false)
    @OneToMany(mappedBy = "accountNumber",
            fetch = FetchType.EAGER,
            cascade = CascadeType.REMOVE)
    private List<AccountBalance> balance;

    @Column(name = "movement", nullable = false)
    @OneToMany(mappedBy = "accountNumber",
            fetch = FetchType.EAGER,
            cascade = CascadeType.REMOVE)
    private List<AccountBalance> movement;

    public List<AccountBalance> getBalance() {
        return balance;
    }

    public void setBalance(List<AccountBalance> balance) {
        this.balance = balance;
    }

    public List<AccountBalance> getMovement() {
        return movement;
    }

    public void setMovement(List<AccountBalance> movement) {
        this.movement = movement;
    }

    public void setAccountNumber(Long accountNumber) {
        this.accountNumber = accountNumber;
    }

    @Basic(optional = false)
    @Column(name = "accountType")
    private AccountType accountType;

    @Basic(optional = false)
    @Column(name = "accountNumber")
    private Long accountNumber;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<AccountBalance> getAccountNumber() {
        return balance;
    }

    public void setAccountNumber(List<AccountBalance> accountNumber) {
        this.balance = accountNumber;
    }

    public AccountType getAccountType() {
        return accountType;
    }

    public void setAccountType(AccountType accountType) {
        this.accountType = accountType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BankAccount that = (BankAccount) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(balance, that.balance) &&
                Objects.equals(accountType, that.accountType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, balance, accountType);
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "id=" + id +
                ", accountNumber=" + balance +
                ", accountType='" + accountType + '\'' +
                '}';
    }
}
