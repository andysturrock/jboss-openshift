package org.sturrock;

import java.io.IOException;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.xml.bind.JAXBException;

import org.jboss.logging.Logger;


@Path("/")
public class Controller {

	@Context
	private SecurityContext security;

	@Inject
	private Logger log;

	public Controller() throws IOException, JAXBException {
	}

	@GET
	@Path("/ping")
	@Produces(MediaType.APPLICATION_XML)
	public Response ping() {
		log.info("Ping called");
		PingResponse response = new PingResponse();
		return Response.ok(response, MediaType.APPLICATION_XML).build();
	}
}
