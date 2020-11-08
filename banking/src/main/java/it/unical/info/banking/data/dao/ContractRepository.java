package it.unical.info.banking.data.dao;

import it.unical.info.banking.data.entities.BankAccount;
import it.unical.info.banking.data.entities.Contract;
import it.unical.info.banking.data.helpers.AccountType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ContractRepository extends JpaRepository<Contract, Long>, JpaSpecificationExecutor<Contract> {

    List<Contract> findAll();

    Optional<Contract> findById(Long id);

    Optional<Contract> findByNominalValue(Long value);

    Optional<Contract> findByIssuer(String issuer);
}
