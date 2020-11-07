package it.unical.info.banking;

import it.unical.info.banking.data.dao.BankAccountDao;
import it.unical.info.banking.data.entities.BankAccount;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BankAccountTest {

    @Autowired
    BankAccountDao bankAccountDao;

    @Test
    public void findAll() {
        List<BankAccount> l = bankAccountDao.findAll();

        Assert.assertEquals(0, l.size());
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
