package com.example.cepservice;

import com.example.model.Endereco;

import javax.enterprise.context.Dependent;
import javax.enterprise.inject.Alternative;

@Dependent @Alternative
public final class ViaCepService extends AcstractCepService {
    private static final String DOMINIO = "https://viacep.com.br/";

    public ViaCepService() {
        super(DOMINIO);
    }

    @Override
    public Object buscarEndereco(String cep) {
        return target.path("ws/"+cep+"/json").request("application/json;charset=utf-8").get(Endereco.class);
    }
}