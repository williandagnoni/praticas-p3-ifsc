package lista_3;

import java.util.ArrayList;
import java.util.List;

public class Animal {

    private String nomeCientifico;
    private String familia;
    private String reino;
    private List<String> nomesPopulares;

    public Animal(String nomeCientifico, String familia, String reino, List<String> nomesPopulares) {
        this.nomeCientifico = nomeCientifico;
        this.familia = familia;
        this.reino = reino;
        this.nomesPopulares = nomesPopulares;
    }

    // ... getters e setters para os atributos ...

    public void adicionarNomePopular(String nomePopular) {
        this.nomesPopulares.add(nomePopular);
    }

    public List<String> getNomesPopulares() {
        return this.nomesPopulares;
    }

    public static void main(String[] args) {
        // Cria uma lista de nomes populares
        List<String> nomesPopulares = new ArrayList<>();
        nomesPopulares.add("Cachorro");
        nomesPopulares.add("Cao");
        nomesPopulares.add("Dog");
        nomesPopulares.add("Au-au");
        nomesPopulares.add("Peludo");

        // Cria um novo animal
        Animal animal = new Animal("Canis lupus familiaris", "Canidae", "Animalia", nomesPopulares);

        // Imprime os nomes populares do animal
        for (String nomePopular : animal.getNomesPopulares()) {
            System.out.println(nomePopular);
        }
    }
}

