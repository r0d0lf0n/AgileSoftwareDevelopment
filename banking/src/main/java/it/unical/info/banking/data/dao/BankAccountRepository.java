package it.unical.info.banking.data.dao;

import it.unical.info.banking.data.entities.BankAccount;
import it.unical.info.banking.data.helpers.AccountType;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface BankAccountRepository extends CrudRepository<BankAccount, Long>, JpaSpecificationExecutor<BankAccount> {

    List<BankAccount> findAll();

    Optional<BankAccount> findById(Long id);

    Optional<BankAccount> findByAccountType(AccountType type);

    Optional<BankAccount> findByAccountNumber(Long number);
}
