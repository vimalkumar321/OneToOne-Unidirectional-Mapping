package com.vimal.demo.onetooneunidirectional.repository;

import com.vimal.demo.onetooneunidirectional.model.Organization;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrganizationRepository extends CrudRepository<Organization, Long> {

}
