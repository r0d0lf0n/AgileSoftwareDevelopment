package it.unical.info.banking.data.dao;

import it.unical.info.banking.data.entities.BankAccount;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BankAccountDao extends CrudRepository<BankAccount, Long> {

    List<BankAccount> findAll();

}
