package com.example.demo.repository;

import java.sql.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

import com.example.demo.entities.Compte;
import com.example.demo.entities.CompteC;

@RepositoryRestResource(collectionResourceRel="compte",path="compte")
public interface Accountrepo extends JpaRepository<Compte,Long>{
	
	
	
	List<Compte> findByNumCompte(@Param("num") Long num);

	
	/*http://localhost:8082/compte/search/findByDateCreation?d=2020/01/12*/
	List<Compte> findByDateCreation(@Param("d") java.util.Date d);
	
	/*http://localhost:8082/compte/search/findBySolde?s=300*/
	//List<CompteC> findBySolde(@Param("s") double s,Pageable pageable);
	
	/*numCompte;
	dateCreation;
	solde*/


	


}
