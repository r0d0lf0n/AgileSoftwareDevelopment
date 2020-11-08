package it.unical.info.banking.Specifications;

import it.unical.info.banking.data.entities.Contract;
import it.unical.info.banking.data.entities.Contract_;
import org.springframework.data.jpa.domain.Specification;

public class ContractSpecification {

    public static Specification<Contract> hasISIN_Code(Long ISIN_code) {
        return (root, query, cb) -> {
            return cb.equal(root.get(Contract_.I_SI_N_CODE), ISIN_code);
        };
    }

    public static Specification<Contract> issuedBy(String issuer) {
        return (root, query, cb) -> {
            return cb.equal(root.get(Contract_.issuer), issuer);
        };
    }

    public static Specification<Contract> hasNominalValue(Long value) {
        return (root, query, cb) -> {
            return cb.equal(root.get(Contract_.nominalValue), value);
        };
    }
}
