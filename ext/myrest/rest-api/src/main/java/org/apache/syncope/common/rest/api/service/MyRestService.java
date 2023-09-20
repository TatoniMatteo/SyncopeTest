package org.apache.syncope.common.rest.api.service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * Interfaccia per il servizio REST personalizzato MyRestService.
 * Questa interfaccia definisce un endpoint REST che restituisce un payload JSON
 * costante.
 */
@Path("myrest")
public interface MyRestService {

    /**
     * Metodo per ottenere un payload JSON costante.
     *
     * @return Una stringa rappresentante il payload JSON costante.
     */
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    String getMessage();
}
