import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("POO");
        curso1.setDescricao("Curso java");
        curso1.setCargaHoraria(8);


        Curso curso2 = new Curso();
        curso1.setTitulo("POO");
        curso1.setDescricao("Curso js");
        curso1.setCargaHoraria(4);


        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de java");
        mentoria.setDescricao("Descrição Mentoria de java");
        mentoria.setData(LocalDate.now());



        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setDescricao("Bootcamp JavaDeveloper");
        bootcamp.setNome("Descrição Bootcamp JavaDeveloper");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devIgor = new Dev();
        devIgor.setNome("Igor");
        devIgor.increverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos: " + devIgor.getConteudosIncritos());
        devIgor.progredir();
        devIgor.progredir();
        devIgor.progredir();
        System.out.println("*__*");
        System.out.println("Conteudos inscritos: " + devIgor.getConteudosIncritos());
        System.out.println("Conteudos concluidos de Igor: " + devIgor.getConteudosConcluidos());
        System.out.println("XP: " + devIgor.calcularTotalXp());


        System.out.println("*________________________*");

        Dev devPi = new Dev();
        devPi.setNome("Pi");
        devPi.increverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos: " + devPi.getConteudosIncritos());
        devPi.progredir();
        System.out.println("*__*");
        System.out.println("Conteudos inscritos: " + devIgor.getConteudosIncritos());
        System.out.println("Conteudos concluidos de Pi: " + devPi.getConteudosConcluidos());
        System.out.println("XP: " + devPi.calcularTotalXp());

    }
}
