package com.example.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.entity.Person;

public interface PeopleManagementDao extends JpaRepository<Person, Integer> {

	List<Person> findByLastName(String lastName);
	
	List<Person> findByLastNameAndEmail(String lastName,String email);
	
	@Query("select p from Person p where p.firstName=?1")
	//@Query("select * from person  where first_name=?1",nativeQuery=true)
	List<Person> findByFirstName(String firstName);

}
