package org.ait.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@Path("/restapi/{name}")
public class Restapi {

    @GET
    @Produces("application/json")
    public Person testApi(@PathParam("name") String name) {
        Person me = new Person();
        me.name = name;
        me.age = 18;
        return me;
    }
}

@XmlRootElement(name = "Person")
class Person {
    String name;
    @XmlElement
    public String getName() {
        return name;
    }
    @XmlElement
    public int getAge() {
        return age;
    }
    int age;
}