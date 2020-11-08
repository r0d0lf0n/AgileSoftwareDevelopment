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
}

