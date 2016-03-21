package com.vogella.jersey.first;

import io.swagger.annotations.Api;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/hello")
//@Api(value = "/helloA", tags = "helloOPP")
public class Hi {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public HiClass sayPlainTextHello() {

        HiClass clas = new HiClass();

        clas.Message = "Hi";
        return clas;

    }

} 