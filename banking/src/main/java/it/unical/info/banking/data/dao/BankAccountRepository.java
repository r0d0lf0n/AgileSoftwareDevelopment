package it.unical.info.banking.data.dao;

import it.unical.info.banking.data.entities.BankAccount;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BankAccountRepository extends CrudRepository<BankAccount, Long>, JpaSpecificationExecutor<BankAccount> {


}
