package com.manoelcampos.retornoboleto;

import java.net.URI;
import java.util.List;

public class LeituraRetornoBradesco implements  LeituraRetorno{
    @Override
    public List<Boleto> lerArquivo(URI caminhoArquivo) {
        return List.of();
    }
}
