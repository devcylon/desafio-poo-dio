import java.time.LocalDate;

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Conteudo;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

public class App {
    public static void main(String[] args) throws Exception {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descrição curso js");
        curso2.setCargaHoraria(4);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("mentoria java");
        mentoria1.setDescricao("descrição mentoria java");
        mentoria1.setData(LocalDate.now());


       /*  System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria1);
         
        Conteudo conteudo = new Curso();
       */
        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);

        Dev devCamila= new Dev();
        devCamila.setNome("Camila");
        devCamila.inscreverBootcamp(bootcamp);
        System.out.println("conteúdos inscritos Camila:"+devCamila.getConteudosInscritos());
        devCamila.progredir();
        System.out.println("-");
        System.out.println("conteúdos inscritos Camila:"+devCamila.getConteudosInscritos());
        System.out.println("Conteúdos concluidos Camila: "+ devCamila.getConteudosConcluidos());
        System.out.println("XP: "+devCamila.calcularTotalXp());
        System.out.println("------------------------------------------------------");
        Dev devJoao = new Dev();
        devJoao.setNome("João");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos João: "+ devJoao.getConteudosInscritos());
        devJoao.progredir();
        devJoao.progredir();
        devJoao.progredir();
        System.out.println("-");

        System.out.println("Conteúdos inscritos João: "+ devJoao.getConteudosInscritos());
        System.out.println("Conteúdos concluidos João: "+devJoao.getConteudosConcluidos());
        System.out.println("XP: "+devJoao.calcularTotalXp());
    }
}
