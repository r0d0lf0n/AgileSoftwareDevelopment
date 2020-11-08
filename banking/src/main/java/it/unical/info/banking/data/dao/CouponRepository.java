package it.unical.info.banking.data.dao;

import it.unical.info.banking.data.entities.BankAccount;
import it.unical.info.banking.data.entities.Contract;
import it.unical.info.banking.data.entities.Coupon;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CouponRepository extends CrudRepository<Coupon, Long>, JpaSpecificationExecutor<Coupon> {

    List<Contract> findAllById(Long id);
}
