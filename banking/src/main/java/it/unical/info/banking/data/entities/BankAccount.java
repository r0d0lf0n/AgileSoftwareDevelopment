package it.unical.info.banking.data.entities;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "BankAccount")
public class BankAccount {

    protected BankAccount() {}

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "accountNumber")
    @OneToMany(mappedBy = "accountNumber",
            fetch = FetchType.LAZY,
            cascade = CascadeType.REMOVE)
    private Set<AccountBalance> accountNumber;

    @Column(name = "accountType", length = 128)
    private String  accountType;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Set<AccountBalance>  getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(Set<AccountBalance> accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "id=" + id +
                ", accountNumber='" + accountNumber + '\'' +
                ", accountType='" + accountType + '\'' +
                '}';
    }
}
