package it.unical.info.banking.data.dao;

import it.unical.info.banking.data.entities.BankAccount;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BankAccountRepository extends CrudRepository<BankAccount, Long>, JpaSpecificationExecutor<BankAccount> {

    List<BankAccount> findAllById(Long id);

    List<BankAccount> findAll();

}
