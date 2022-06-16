package com.example;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("/config")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class ConfigResource {
    @Inject
    Config config;

    @GET
    public Config getConfig() {
        return config;
    }

    @PUT
    public void updateConfig(Config newConfig){
        config.setFormatoRelatorio(newConfig.getFormatoRelatorio());
        config.setTipoGrafico(newConfig.getTipoGrafico());
    }
}