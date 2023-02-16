import edu.matheusfvp.desafiopoo.dominio.Curso;
import edu.matheusfvp.desafiopoo.dominio.Mentoria;

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

        Mentoria mentoria = new Mentoria("Java mentoria", "descrição mentoria de Java", LocalDate.now());

        System.out.println(curso);
        System.out.println(curso2);
        System.out.println(mentoria);
    }

}
