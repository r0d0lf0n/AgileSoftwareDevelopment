package it.unical.info.banking.Specifications;

import it.unical.info.banking.data.entities.Contract;
import it.unical.info.banking.data.entities.Contract_;
import it.unical.info.banking.data.entities.Coupon;
import it.unical.info.banking.data.entities.Coupon_;
import org.springframework.data.jpa.domain.Specification;

import java.time.LocalDate;
import java.time.Month;
import java.util.Date;


public class CouponSpecification {

    public static Specification<Coupon> hasAmount(Long amount) {
        return (root, query, cb) -> {
            return cb.equal(root.get(Coupon_.AMOUNT), amount);
        };
    }

    public static Specification<Coupon> belongToContract(Long amount) {
        return (root, query, cb) -> {
            return cb.equal(root.get(Coupon_.CONTRACT), amount);
        };
    }

    public static Specification<Coupon> hasTodayAsExpDate() {
        LocalDate today = LocalDate.now();
        return (root, query, cb) -> {
            return cb.equal(root.get(Coupon_.EXPIRATION_DATE), today);
        };
    }

    public static Specification<Coupon> hasExpDate(LocalDate expDate) {
//        LocalDate expDate = LocalDate.of(2022, Month.JANUARY, 8);
        return (root, query, cb) -> {
            return cb.equal(root.get(Coupon_.EXPIRATION_DATE), expDate);
        };
    }
}