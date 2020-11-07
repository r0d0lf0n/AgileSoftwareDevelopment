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

    @Column(name = "amount")
    private Long amount;

    @ManyToOne(fetch = FetchType.EAGER,
            optional = false)
    @JoinColumn(name = "accountNumber")
    private BankAccount accountNumber;


    private Long contract;
}
