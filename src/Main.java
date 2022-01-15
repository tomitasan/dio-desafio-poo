import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição do Curso Java");
        curso1.setCargaHoraria(16);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JavaScript");
        curso2.setDescricao("Descrição do Curso JavaScript");
        curso2.setCargaHoraria(8);

//        Conteudo conteudo = new Curso();
//        Conteudo conteudo1 = new Mentoria();
//        List<String> palavras = new ArrayList<>();

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria de Java");
        mentoria1.setDescricao("Descrição da Mentoria de Java");
        mentoria1.setData(LocalDate.now());

//        System.out.println(curso1);
//        System.out.println(curso2);
//        System.out.println(mentoria1);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);

        Dev dev1 = new Dev();
        dev1.setNome("Antonio");
        dev1.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos - Dev1: " + dev1.getConteudosInscritos());
        dev1.progredir();
        dev1.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos após Progresso - Dev1: " + dev1.getConteudosInscritos());
        System.out.println("-");
        System.out.println("Conteúdos Concluídos - Dev1: " + dev1.getConteudosConcluidos());
        System.out.println("XP - Dev1: " + dev1.calcularTotalXp());


        System.out.println("------");


        Dev dev2 = new Dev();
        dev2.setNome("Maria");
        dev2.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos - Dev2: " + dev2.getConteudosInscritos());
        dev2.progredir();
        dev2.progredir();
        dev2.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos após Progresso - Dev2: " + dev2.getConteudosInscritos());
        System.out.println("-");
        System.out.println("Conteúdos Concluídos - Dev2: " + dev2.getConteudosConcluidos());
        System.out.println("XP - Dev2: " + dev2.calcularTotalXp());
    }
}
