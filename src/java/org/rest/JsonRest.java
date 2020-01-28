/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.rest;

import javax.ws.rs.Path;
import javax.ws.rs.GET;
import javax.ws.rs.Produces;

import javax.json.Json;
import javax.json.JsonArray;
import javax.json.JsonObject;

/**
 *
 * @author Mobile Apps
 */
@Path("/person")
public class JsonRest {

    @GET
    @Produces("application/json")
    public JsonArray persons() {
        return Json.createArrayBuilder().add(person("Admin", 20)).add(person("Mark", 24)).add(person("Rest", 2)).build();
    }

    public JsonObject person(String name, int age) {
        return Json.createObjectBuilder().add("name", name).add("age", age).build();
    }
}
