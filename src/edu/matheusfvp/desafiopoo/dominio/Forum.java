package edu.matheusfvp.desafiopoo.dominio;

import java.util.LinkedList;
import java.util.List;

public class Forum {

    private List<Topico> topicos = new LinkedList<>();


    public void adicionarTopico(Topico topico) {
        topicos.add(topico);
    }

    public void listarTopicos() {
        this.topicos.forEach(System.out::println);
    }

}
