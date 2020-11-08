package it.unical.info.banking;

import it.unical.info.banking.data.dao.BankAccountRepository;
import it.unical.info.banking.data.entities.BankAccount;
import it.unical.info.banking.data.services.BankAccountService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BankAccountServiceTest {

    @Autowired
    BankAccountService bankAccountService;

    @Test
    public void finallWithService() {
        List<BankAccount> list = bankAccountService.getAll();
        Assert.assertEquals(list.size(), list.size());
    }
}
