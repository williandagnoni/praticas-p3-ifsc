package revicao;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        // Criando três objetos de Tutor
        Tutor Joao = new Tutor(null);
        Joao.setNomeCompleto("joao");
        
        Gato gato1 = new Gato(null, null, null);
        gato1.setApelido("dolgas");
        gato1.setPedigree("10%");
        gato1.setNomeCientifico("tigrao");
        gato1.setClasse("lindo");
        
        Tutor mariaOliveira = new Tutor(null);
        mariaOliveira.setNomeCompleto("maria Oliveira");
        
        Gato gato2 = new Gato(null, null, null);
        gato2.setApelido("will");
        gato2.setPedigree("100%");
        gato2.setNomeCientifico("felino");
        gato2.setClasse("meia_boca");
        
        Tutor Pedro_Souza = new Tutor(null);
        Pedro_Souza.setNomeCompleto("Pedro Souza");
        
        Gato gato3 = new Gato(null, null, null);
        gato3.setApelido("lezio");
        gato3.setPedigree("90%");
        gato3.setNomeCientifico("nao_sei");
        gato3.setClasse("maluco");
        

    
        List<Tutor> tutores = new ArrayList<>();
        tutores.add(Joao);
        tutores.add(mariaOliveira);
        tutores.add(Pedro_Souza);
        
        for (Tutor tutor : tutores) {
            System.out.println(tutor.getNomeCompleto());
            System.out.println(tutor.getGato().getApelido());
            System.out.println(tutor.getGato().getNomeCientifico());
            System.out.println(tutor.getGato().getClass());
            System.out.println(tutor.getGato().getPedigree());


            
        }
    }
}
