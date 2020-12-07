package com.example.demo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.entity.Person;
import com.example.demo.service.PeopleManagementService;

@SpringBootApplication
public class SpringJpaApplication {

	@Autowired
	private PeopleManagementService peopleManagementService;

	public static void main(String[] args) {
		SpringApplication.run(SpringJpaApplication.class, args);
	}

	@PostConstruct
	public void saveDummyPersons() {
		List<Person> personsList = new ArrayList<>();

		Person person = new Person();
		person.setFirstName("Sunny");
		person.setLastName("A");
		person.setEmail("sunny@gmail.com");
		person.setCreationDate(new Date());

		Person person1 = new Person();
		person1.setFirstName("Bunny");
		person1.setLastName("B");
		person1.setEmail("bunny@gmail.com");
		person1.setCreationDate(new Date());

		Person person2 = new Person();
		person2.setFirstName("Ram");
		person2.setLastName("C");
		person2.setEmail("ram@gmail.com");
		person2.setCreationDate(new Date());

		personsList.add(person);
		personsList.add(person1);
		personsList.add(person2);

		//peopleManagementService.createAllPersion(personsList);
	}

}
