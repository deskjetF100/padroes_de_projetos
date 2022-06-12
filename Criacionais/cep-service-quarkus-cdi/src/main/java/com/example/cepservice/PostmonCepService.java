package com.example.cepservice;

import com.example.model.Endereco;

import javax.enterprise.context.Dependent;
import javax.enterprise.inject.Alternative;

@Dependent @Alternative
public class PostmonCepService extends AcstractCepService {
    private static final String DOMINIO = "https://api.postmon.com.br";

    public PostmonCepService() {
        super(DOMINIO);
    }

    @Override
    public Object buscarEndereco(String cep) {
        return target.path("v1/cep/"+cep).request("application/json;charset=utf-8").get(Endereco.class);
    }
}
