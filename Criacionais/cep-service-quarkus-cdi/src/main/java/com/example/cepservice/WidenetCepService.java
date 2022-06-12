package com.example.cepservice;

import com.example.model.Address;
import com.example.model.Endereco;

import javax.enterprise.context.Dependent;
import javax.enterprise.inject.Alternative;

@Dependent
public class WidenetCepService extends AcstractCepService {
    private static final String DOMINiO = "https://apps.widenet.com.br";

    public WidenetCepService() {
        super(DOMINiO);
    }

    @Override
    public Object buscarEndereco(String cep) {
        return target.path("busca-cep/api/cep.json").queryParam("code", cep).request("application/json;charset=utf-8").get(Address.class);
    }
}
