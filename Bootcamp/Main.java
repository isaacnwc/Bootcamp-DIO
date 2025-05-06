import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso PHP");
        curso1.setDescricao("descrição do curso de PHP");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso js");
        curso2.setDescricao("descrição do curso de GIT");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());



        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devIsaac = new Dev();
        devIsaac.setNome("Isaac");
        devIsaac.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Isaac:" + devIsaac.getConteudosInscritos());
        devIsaac.progredir();
        devIsaac.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Isaac:" + devIsaac.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Isaac:" + devIsaac.getConteudosConcluidos());
        System.out.println("XP:" + devIsaac.calcularTotalXp());

        System.out.println("-------");

        Dev devNewton = new Dev();
        devNewton.setNome("Newton");
        devNewton.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Newton:" + devNewton.getConteudosInscritos());
        devNewton.progredir();
        devNewton.progredir();
        devNewton.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Newton:" + devNewton.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos Newton:" + devNewton.getConteudosConcluidos());
        System.out.println("XP:" + devNewton.calcularTotalXp());

    }

}