package com.in28minutes.learnspringframework;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

record Person(String name, int age, Address address) {};

record Address (String firstLine, String city) {};

@Configuration
public class HelloWorldConfiguration {

	@Bean
	public String name() {
		return "Ranga";
	}
	
	@Bean
	public int age() {
		return 22;
	}
	
	@Bean
	public Person person() {
		var person = new Person("kim",42, new Address("mapo", "Seoul"));
		return person;
	}
	
	@Bean("address2")
	@Primary
	public Address address() {
		return new Address("dontan2", "gyung2");
	}
	
	@Bean("address3")
	@Qualifier("AddressQualifier")
	public Address address3() {
		return new Address("dontan3", "gyung3");
	}
	
	@Bean
	public Person person2MethodCall() {
		var person = new Person(name(), age(), address());
		return person;
	}
	
	@Bean
	public Person person3Parameters(String name, int age, Address address3) {
		var person = new Person(name, age, address3);
		return person;
	}
	
	@Bean
	@Primary
	public Person person4Parameters(String name, int age, Address address) {
		var person = new Person(name, age, address);
		return person;
	}
	
	@Bean
	
	public Person person5Qualifier(String name, int age, @Qualifier("AddressQualifier")Address address) {
		var person = new Person(name, age, address);
		return person;
	}
	
}
