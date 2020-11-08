package it.unical.info.banking;

import it.unical.info.banking.data.dao.BankAccountRepository;
import it.unical.info.banking.data.entities.BankAccount;
import it.unical.info.banking.data.helpers.AccountType;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.io.Resource;
import org.springframework.test.context.junit4.SpringRunner;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;


import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

import static it.unical.info.banking.Specifications.BankAccountSpecification.*;


@RunWith(SpringRunner.class)
@SpringBootTest
public class BankAccountTest {

    @Autowired
    BankAccountRepository bankAccountRepo;

    @Value("classpath:db_scripts/BANK_ACCOUNT.csv")
    private Resource bankAccountRes;

    private static boolean isInitialized = false;

    @Before
    public void createDbTest() throws IOException {

        bankAccountRepo.deleteAll();

        if (true) {
            CSVParser bankAccountCsv = CSVFormat.DEFAULT.withDelimiter(',')
                    .parse(new InputStreamReader(bankAccountRes.getInputStream()));
            for (CSVRecord record : bankAccountCsv) {
                if (!record.get(1).equals("ACCOUNT_NUMBER")) {
                    int type = Integer.parseInt(record.get(2));
                    AccountType accountType = AccountType.NORMAL;

                    switch (type) {
                        case 0:
                            accountType = AccountType.NORMAL;
                            break;
                        case 1:
                            accountType = AccountType.ENTERPRISE;
                            break;
                        case 2:
                            accountType = AccountType.SHARED;
                            break;
                    }

                    insertBankAccount(Long.parseLong(record.get(1)), accountType);
                }
            }
            
            isInitialized = true;
        }
    }

    @Test
    public void findAllEnterprise() {

        List<BankAccount> l_bormal = bankAccountRepo.findAll(isNormal());
        Assert.assertEquals(4, l_bormal.size());

        List<BankAccount> l_enterprise = bankAccountRepo.findAll(isEnterprise());
        Assert.assertEquals(9, l_enterprise.size());

        List<BankAccount> l_shared = bankAccountRepo.findAll(isShared());
        Assert.assertEquals(4, l_shared.size());

        

//        l_enterprise.stream().forEach(
//                System.out::println
//        );
//
//        l_bormal.stream().forEach(
//                System.out::println
//        );
//
//        l_shared.stream().forEach(
//                System.out::println
//        );

    }

    private void insertBankAccount(Long accountNumber, AccountType type) {
        BankAccount account = new BankAccount();
        account.setAccountNumber(accountNumber);
        account.setAccountType(type);
        bankAccountRepo.save(account);
    }

}


