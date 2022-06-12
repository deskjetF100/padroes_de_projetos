package com.example.cepservice;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import java.io.File;

public abstract class AcstractCepService implements CepService {

    final WebTarget target;
    private final String domain;

    protected final String insertTraillingSlash(String path){
        return path.endsWith(File.separator) ? path : path + File.separator;
    }

    public AcstractCepService(String dominio) {
        this.domain = insertTraillingSlash(dominio);
        Client client = ClientBuilder.newClient();
        this.target = client.target(dominio);
        System.out.println("============="+target.getUri().toString());
    }
}
