package it.unical.info.banking.helpers;

import it.unical.info.banking.data.entities.BankAccount;
import it.unical.info.banking.data.entities.BankAccount_;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.function.Predicate;

public class BankAccountSpecification {

    public static Specification<BankAccount> bankTypeEnterprise(String accountType) {
        return new Specification<BankAccount>() {
            @Override
            public Predicate toPredicate(Root<BankAccount> root, CriteriaQuery query, CriteriaBuilder cb) {
                return (Predicate) cb.equal(root.get(BankAccount_.accountType), accountType);
            }
        };
    }

//    public static Specification<Customer> isLongTermCustomer() {
//        return new Specification<Customer> {
//            public Predicate toPredicate (Root < T > root, CriteriaQuery query, CriteriaBuilder cb){
//                return cb.lessThan(root.get(Customer_.createdAt), new LocalDate.minusYears(2));
//            }
//        } ;
//    }
}

