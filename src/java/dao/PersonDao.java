/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entity.Person;

import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author Mobile Apps
 */
public class PersonDao {

    static private List<Person> persons;

    static {
        persons = new ArrayList<>();
        persons.add(new Person("Kwame", 30));
        persons.add(new Person("James", 10));
        persons.add(new Person("Hannah", 12));
        persons.add(new Person("Yellow ", 2));
        persons.add(new Person("Mark", 29));
    }

    public List<Person> getAllPerson() {
        return PersonDao.persons;
    }
}
