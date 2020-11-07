package it.unical.info.banking.helpers;

import it.unical.info.banking.data.entities.BankAccount;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.function.Predicate;

public class BankAccountSpecification {

    public static Specification<BankAccount> bankTypeEnterprise(String type) {
        return new Specification<BankAccount>() {
            @Override
            public Predicate toPredicate(Root<BankAccount> root, CriteriaQuery query, CriteriaBuilder cb) {
//                return cb.equal(root.get(BankAccount_.accountType), type);
                return null;
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