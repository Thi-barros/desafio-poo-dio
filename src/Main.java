import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso java");
        curso1.setDescricao("Descrição do curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso js");
        curso2.setDescricao("Descrição do curso js");
        curso2.setCargaHoraria(9);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Descrição mentoria Java");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devThiago = new Dev();
        devThiago.setNome("Thiago");
        devThiago.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos de Thiago: " + devThiago.getConteudosInscritos());
        devThiago.progredir();
        System.out.println("-");
        devThiago.progredir();
        System.out.println("Conteúdos inscritos de Thiago: " + devThiago.getConteudosInscritos());
        System.out.println("Conteúdos concluídos de Thiago: " + devThiago.getConteudosConcluidos());
        System.out.println("XP: " + devThiago.calcularTotalXP());

        System.out.println("----------");

        Dev devCamila = new Dev();
        devCamila.setNome("Camila");
        devCamila.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos de Camila: " + devCamila.getConteudosInscritos());
        devCamila.progredir();
        devCamila.progredir();
        devCamila.progredir();
        System.out.println("-");
        System.out.println("Conteúdos inscritos de Camila: " + devCamila.getConteudosInscritos());
        System.out.println("Conteúdos concluídos de Camila: " + devCamila.getConteudosConcluidos());
        System.out.println("XP: " + devCamila.calcularTotalXP());

        /*System.out.println(curso1);
        System.out.println(curso2);*/


    }
}
