package it.unical.info.banking.data.entities;


import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "AccountBalance")
public class AccountBalance {

    protected AccountBalance() {}

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Basic(optional = false)
    @Column(name = "amount")
    private Long amount;

    @ManyToOne(fetch = FetchType.LAZY, optional = true)
    @JoinColumn(name = "accountNumber", referencedColumnName = "id")
    private BankAccount accountNumber;

    @ManyToOne(fetch = FetchType.LAZY, optional = true)
    @JoinColumn(name = "contract", referencedColumnName = "id")
    private Contract contract;
}
