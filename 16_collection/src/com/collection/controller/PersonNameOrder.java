package com.collection.controller;

import java.util.Comparator;

import com.collection.model.vo.Person;

public class PersonNameOrder implements Comparator<Person> {

	@Override
	public int compare(Person o1, Person o2) {
		return o1.getName().compareTo(o2.getName());
	}

}
