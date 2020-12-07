package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.PeopleManagementDao;
import com.example.demo.entity.Person;

@Service
public class PeopleManagementService {
	
	@Autowired
	private PeopleManagementDao peopleManagementDao;

	public Person createPersion(Person person) {
		return peopleManagementDao.save(person);
	}

	public List<Person> createAllPersion(List<Person> personsList) {
		return peopleManagementDao.saveAll(personsList);
	}

	public List<Person> getAllPersonDetails() {
		return peopleManagementDao.findAll();
	}

	public Person findUserById(int personId) {
		return peopleManagementDao.findById(personId).get();
	}

	public void deleteUserById(int id) {
		peopleManagementDao.deleteById(id);;
	}

	public void deleteAllusers(List<Person> personsList) {
		peopleManagementDao.deleteAll(personsList);
	}
	
	public List<Person> getPersonByName(String lastName) {
		return peopleManagementDao.findByLastName(lastName);
	}
	
	public List<Person> getPersonByFirstName(String lastName) {
		return peopleManagementDao.findByFirstName(lastName);
	}
	
	public List<Person> getPersonByNameAndEmail(String lastName,String email) {
		return peopleManagementDao.findByLastNameAndEmail(lastName, email);
	}


}
