package it.unical.info.banking.Specifications;

import it.unical.info.banking.data.entities.BankAccount;
import it.unical.info.banking.data.entities.BankAccount_;
import it.unical.info.banking.data.helpers.AccountType;
import org.springframework.data.jpa.domain.Specification;

public class BankAccountSpecification {

    public static Specification<BankAccount> bankAccountType(AccountType accountType) {
        return (root, query, cb) -> {
            return cb.equal(root.get(BankAccount_.ACCOUNT_TYPE), accountType);
        };
    }

    public static Specification<BankAccount> isEnterprise() {
        return (root, query, cb) -> {
            return cb.equal(root.get(BankAccount_.ACCOUNT_TYPE), AccountType.ENTERPRISE);
        };
    }

    public static Specification<BankAccount> isNormal() {
        return (root, query, cb) -> {
            return cb.equal(root.get(BankAccount_.ACCOUNT_TYPE), AccountType.NORMAL);
        };
    }

    public static Specification<BankAccount> isShared() {
        return (root, query, cb) -> {
            return cb.equal(root.get(BankAccount_.ACCOUNT_TYPE), AccountType.SHARED);
        };
    }




//    public static Specification<BankAccount> bankTypeEnterprise(String accountType) {
//        return new Specification<BankAccount>() {
//            @Override
//            public Predicate toPredicate(Root<BankAccount> root, CriteriaQuery query, CriteriaBuilder cb) {
//                return (Predicate) cb.equal(root.get(BankAccount_.accountType), accountType);
//            }
//        };
//    }

//    public static Specification<BankAccount> bankTypeEnterprise() {
//        return new Specification<BankAccount>() {
//            @Override
//            public Predicate toPredicate(Root<BankAccount> root, CriteriaQuery query, CriteriaBuilder cb) {
//                return (Predicate) cb.equal(root.get(BankAccount_.accountType), accountType);
//            }
//        };
//    }


//    public static Specification<Customer> isLongTermCustomer() {
//        return new Specification<Customer> {
//            public Predicate toPredicate (Root < T > root, CriteriaQuery query, CriteriaBuilder cb){
//                return cb.lessThan(root.get(Customer_.createdAt), new LocalDate.minusYears(2));
//            }
//        } ;
//    }
}

//public MovieSpecifications {
//    public static Specification<Movie> isComedy() {
//        return (root, query, cb) -> {
//            return cb.equal(root.get(Movie_.genre), Genre.Comedy);
//        };
//    }
//    public static Specification<Movie> isReallyOld() {
//        return (root, query, cb) -> {
//            return cb.lessThan(root.get(Movie_.createdAt), new LocalDate.now().minusYears(25));
//        };
//    }
//}

