package it.unical.info.banking.data.dao;

import it.unical.info.banking.data.entities.Coupon;
import it.unical.info.banking.data.entities.Movement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface MovementRepository extends JpaRepository<Movement, Long>, JpaSpecificationExecutor<Movement> {

    List<Movement> findAll();

    Optional<Movement> findById(Long id);

    Optional<Movement> findByMovementType(String type);

    Optional<Movement> findBySequentialNumber(Long seqNumber);

}
