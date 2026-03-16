package Kpolimorfismo.service;

import Kpolimorfismo.repositorio.Repositorio;

public class RepositorioMemoria implements Repositorio {
    @Override
    public void salvar() {
        System.out.println("Salvando em uma memoria");
    }
}
