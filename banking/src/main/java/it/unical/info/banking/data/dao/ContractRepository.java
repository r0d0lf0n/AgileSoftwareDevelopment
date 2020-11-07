package it.unical.info.banking.data.dao;

import it.unical.info.banking.data.entities.BankAccount;
import it.unical.info.banking.data.entities.Contract;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ContractRepository extends JpaRepository<Contract, Long>, JpaSpecificationExecutor<Contract> {

    List<Contract> findAllById(Long id);
}
