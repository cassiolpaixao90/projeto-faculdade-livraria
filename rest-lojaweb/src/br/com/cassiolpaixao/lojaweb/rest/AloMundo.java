package br.com.cassiolpaixao.lojaweb.rest;

import javax.websocket.server.PathParam;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import br.com.cassiolpaixao.lojaweb.entity.Pessoa;
import br.com.cassiolpaixao.lojaweb.util.Constant;

@Path("/")
public class AloMundo {

	
	@GET
	@Path("/param/{login}")
	@Produces(MediaType.TEXT_HTML)
	@Consumes(MediaType.TEXT_PLAIN)
	public String getPessoa(@PathParam("login") String login) {
		return login;
	}

	@POST
	@Path("/json")
	@Produces(Constant.APPLICATION_JSON_UTF8)
	@Consumes(Constant.APPLICATION_JSON_UTF8)
	public Pessoa toJson(Pessoa p) {
		return new Pessoa(p.getLogin());
	}
}
