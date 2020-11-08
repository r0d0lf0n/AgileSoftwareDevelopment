package it.unical.info.banking;

import it.unical.info.banking.data.dao.BankAccountRepository;
import it.unical.info.banking.data.entities.BankAccount;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static it.unical.info.banking.Specifications.BankAccountSpecification.*;


@RunWith(SpringRunner.class)
@SpringBootTest
public class BankAccountTest {

    @Autowired
    BankAccountRepository bankAccountRepo;

    @Test
    public void findAllEnterprise() {
        List<BankAccount> l_enterprise = bankAccountRepo.findAll(isEnterprise());
        List<BankAccount> l_bormal = bankAccountRepo.findAll(isNormal());
        List<BankAccount> l_shared = bankAccountRepo.findAll(isShared());

        l_enterprise.stream().forEach(
                System.out::println
        );

        l_bormal.stream().forEach(
                System.out::println
        );

        l_shared.stream().forEach(
                System.out::println
        );

//        Assert.assertEquals(1, l.size());
    }

}

//@RunWith(SpringRunner.class)
//@SpringBootTest
//public class dummyTest {
//
//    @Autowired
//    dummyDao dummyD;
//
//    @Test
//    public void findAll() {
//        List<dummy> dummyList = dummyD.findAll();
//        Assert.assertEquals(2, dummyList.size());
//
////        dummyList.stream().forEach(
////                System.out::println
////        );
//    }
//
//}
