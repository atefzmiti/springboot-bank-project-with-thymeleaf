package com.example.demo.repository;

import java.sql.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.example.demo.entities.Retrait;

@RepositoryRestResource(collectionResourceRel="retrait",path="retrait")
public interface retraitRepo extends JpaRepository<Retrait,Long>{
	
	
	
	/*List<Compte> findByNumCompte(@Param("name") String name);

	/*List<CompteC> findByNameContains(@Param("name") String name);
	/*Optional<CompteC> findById(@Param("Code") Long Code);
	List<CompteC> findByName(@Param("name") String name);
	@RestResource(path="fname")
	List<CompteC> findByName(@Param("name") String name,Pageable pageable);
	@RestResource(path="name")
	List<CompteC> findByNameContains(@Param("name") String name,Pageable pageable);
	List<CompteC> deleteByName(@Param("name")String name);*/
	
	/*numCompte;
	dateCreation;
	solde*/


	


}
