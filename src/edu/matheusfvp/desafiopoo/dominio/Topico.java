package edu.matheusfvp.desafiopoo.dominio;

import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

public class Topico {

    private String assunto;
    private List<String> tecnologiasRelacionadas = new LinkedList<>();
    private String detalhe;
    private Dev autor;
    private LocalDate dataDePublicacao = LocalDate.now();

    public String getAssunto() {
        return assunto;
    }

    public void setAssunto(String assunto) {
        this.assunto = assunto;
    }

    public List<String> getTecnologiasRelacionadas() {
        return tecnologiasRelacionadas;
    }

    public void adicionarTecnologia(String tecnologia) {
        this.tecnologiasRelacionadas.add(tecnologia);
    }

    public String getDetalhe() {
        return detalhe;
    }

    public void setDetalhe(String detalhe) {
        this.detalhe = detalhe;
    }

    public Dev getAutor() {
        return autor;
    }

    public void setAutor(Dev autor) {
        this.autor = autor;
    }

    public LocalDate getDataDePublicacao() {
        return dataDePublicacao;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Topico topico = (Topico) o;
        return Objects.equals(assunto, topico.assunto) && Objects.equals(tecnologiasRelacionadas, topico.tecnologiasRelacionadas) && Objects.equals(detalhe, topico.detalhe) && Objects.equals(autor, topico.autor) && Objects.equals(dataDePublicacao, topico.dataDePublicacao);
    }

    @Override
    public int hashCode() {
        return Objects.hash(assunto, tecnologiasRelacionadas, detalhe, autor, dataDePublicacao);
    }

    @Override
    public String toString() {
        return "Topico{" +
                "assunto='" + assunto + '\'' +
                ", tecnologiasRelacionadas=" + tecnologiasRelacionadas +
                ", detalhe='" + detalhe + '\'' +
                ", autor=" + autor +
                ", dataDePublicacao=" + dataDePublicacao +
                '}';
    }
}
