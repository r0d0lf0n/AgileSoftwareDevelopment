package it.unical.info.banking.data.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import it.unical.info.banking.data.entities.dummy;

import java.util.List;

@Repository
public interface dummyDao extends CrudRepository<dummy, Long> {

    List<dummy> findAll();

}
