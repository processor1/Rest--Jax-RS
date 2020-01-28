/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xml.rest;

import javax.ws.rs.Path;
import javax.ws.rs.GET;
import javax.ws.rs.Produces;

import javax.inject.Inject;

import entity.Person;
import java.util.List;

import dao.PersonDao;

/**
 *
 * @author Mobile Apps
 */

@Path("/person/xml")
public class PersonXML {

    @Inject
    PersonDao dao;

    @GET
    @Produces("application/xml")

    public List<Person> person() {
        return dao.getAllPerson();
    }
}
