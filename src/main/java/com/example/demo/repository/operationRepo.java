package com.example.demo.repository;

import java.sql.Date;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.example.demo.entities.Compte;
import com.example.demo.entities.Employee;
import com.example.demo.entities.Operation;

@RepositoryRestResource(collectionResourceRel="operation",path="operation")
public interface operationRepo extends JpaRepository<Operation,Long>{
	
	
	
	/*http://localhost:8082/operation/search/findByNumOperation?n=13*/
	List<Operation> findByNumOperation(@Param("n") Long n);
	
	/*http://localhost:8082/operation/search/findByDateOperation?d=2020/01/12*/
	List<Operation> findByDateOperation(@Param("d") java.util.Date d);


	/*List<Operation> findByNomOperationContains(@Param("name") String name);
	
	/*http://localhost:8082/operation/search/deleteByNomEmployee?name=paul*/
	/*@Transactional
	/*List<Operation> deleteByNomOperation(@Param("name")String name);*/


	


}
