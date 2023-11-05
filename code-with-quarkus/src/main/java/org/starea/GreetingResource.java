package org.starea;

import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

import java.util.List;

@Path("/hello")
public class GreetingResource {

    @Inject
    MyEntityService service;

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public List<MyEntity> hello() {
        List<MyEntity> entities = service.doSomething();
        return entities;
    }
}
