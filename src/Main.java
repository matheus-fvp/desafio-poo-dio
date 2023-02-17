import edu.matheusfvp.desafiopoo.dominio.*;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        Curso curso = new Curso();
        curso.setTitulo("Curso Java");
        curso.setDescricao("descrição curso java");
        curso.setCargaHoraria(10);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso Python");
        curso2.setDescricao("descrição curso python");
        curso2.setCargaHoraria(8);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Java mentoria");
        mentoria.setDescricao("descrição mentoria de Java");
        mentoria.setData(LocalDate.now());

        /*System.out.println(curso);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devMatheus = new Dev();
        devMatheus.setNome("Matheus");
        devMatheus.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos Matheus: " + devMatheus.getConteudosInscritos());
        devMatheus.progredir();
        System.out.println("Conteudos Inscritos Matheus: " + devMatheus.getConteudosConcluidos());
        System.out.println("Xp: " + devMatheus.calcularTotalXp());


        Dev devPedro = new Dev();
        devPedro.setNome("Pedro");
        devPedro.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos Pedro: " + devPedro.getConteudosInscritos());
        devPedro.progredir();
        System.out.println("Conteudos Inscritos Pedro: " + devPedro.getConteudosConcluidos());
        System.out.println("Xp: " + devPedro.calcularTotalXp());

        System.out.println("Forum");
        Topico topico = new Topico();
        topico.setAssunto("Dificuldade com collections");
        topico.adicionarTecnologia("Java");
        topico.adicionarTecnologia("Python");
        topico.setAutor(devMatheus);
        topico.setDetalhe("Não entendi a diferença entre ArrayList e LinkedList");
        bootcamp.getForum().adicionarTopico(topico);
        bootcamp.getForum().listarTopicos();

    }

}
