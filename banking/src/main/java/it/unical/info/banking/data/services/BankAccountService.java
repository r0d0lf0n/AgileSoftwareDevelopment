package it.unical.info.banking.data.services;

import it.unical.info.banking.data.dao.BankAccountRepository;
import it.unical.info.banking.data.entities.BankAccount;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


public interface BankAccountService  {

   List<BankAccount> getAll();
}
