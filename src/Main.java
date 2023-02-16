import edu.matheusfvp.desafiopoo.dominio.Conteudo;
import edu.matheusfvp.desafiopoo.dominio.Curso;
import edu.matheusfvp.desafiopoo.dominio.Mentoria;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        Conteudo curso = new Curso();
        curso.setTitulo("Curso Java");
        curso.setDescricao("descrição curso java");

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso Python");
        curso2.setDescricao("descrição curso python");
        curso2.setCargaHoraria(8);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Java mentoria");
        mentoria.setDescricao("descrição mentoria de Java");
        mentoria.setData(LocalDate.now());

        System.out.println(curso);
        System.out.println(curso2);
        System.out.println(mentoria);
    }

}
