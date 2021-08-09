package com.vimal.demo.onetooneunidirectional.repository;

import com.vimal.demo.onetooneunidirectional.model.Address;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressRepository extends CrudRepository<Address, Long> {

}
