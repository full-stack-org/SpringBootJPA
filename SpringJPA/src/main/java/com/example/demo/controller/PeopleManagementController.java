package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Person;
import com.example.demo.service.PeopleManagementService;

@RestController
@RequestMapping("/jpa/v1")
public class PeopleManagementController {

	@Autowired
	private PeopleManagementService peopleManagementService;

	@GetMapping("/getPersonById/{id}")
	public Person getPersonById(@PathVariable int id) {
		return peopleManagementService.findUserById(id);
	}

	@PostMapping("/savePerson")
	public Person savePerson(@RequestBody Person person) {
		return peopleManagementService.createPersion(person);
	}

	@PostMapping("/saveAllPerson")
	public List<Person> saveAllPerson(@RequestBody List<Person> personsList) {
		return peopleManagementService.createAllPersion(personsList);
	}

	@GetMapping("/getAllPersons")
	public List<Person> getAllPersons() {
		return peopleManagementService.getAllPersonDetails();
	}

	@GetMapping("/findPersonByLastName/{lastName}")
	public List<Person> findPersonByLastName(@PathVariable String lastName) {
		return peopleManagementService.getPersonByName(lastName);
	}
	
	@GetMapping("/findPersonByFirstName/{firstName}")
	public List<Person> findPersonByFirstName(@PathVariable String firstName) {
		return peopleManagementService.getPersonByFirstName(firstName);
	}

	@GetMapping("/findPersonByLastNameAndEmail/{lastName}/{email}")
	public List<Person> findPersonByLastNameAndEmail(@PathVariable String lastName, @PathVariable String email) {
		return peopleManagementService.getPersonByNameAndEmail(lastName, email);
	}

	@DeleteMapping("/deletePersonById/{id}")
	public void deletePersonById(@PathVariable int id) {
		peopleManagementService.deleteUserById(id);
	}

	@DeleteMapping("/deleteAllPersons")
	public void deleteAllPersons() {
		peopleManagementService.deleteAllusers(peopleManagementService.getAllPersonDetails());
	}

}
