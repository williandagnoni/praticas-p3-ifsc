package lista_3;



import java.util.Scanner;

public class questao_2 {
	    public String nome;
	    public long cpf;
	    public String dataNascimento;

	    public static void main(String[] args) {
	        Scanner scan = new Scanner(System.in);

	        Pessoa[] pessoas = new Pessoa[3]; 

	       
	        for (int i = 0; i < pessoas.length; i++) {
	        	Pessoa pessoa = new Pessoa();

	            System.out.println("Digite o nome da pessoa " + (i+1) + ":");
	            pessoa.nome = scan.nextLine();

	            System.out.println("Digite o CPF da pessoa " + (i+1) + ":");
	            pessoa.cpf = scan.nextLong();
	            scan.nextLine(); 
	            System.out.println("Digite a data de nascimento da pessoa " + (i+1) + " (no formato dd/mm/aaaa):");
	            pessoa.dataNascimento = scan.nextLine();

	            pessoas[i] = pessoa; 
	        }

	        scan.close();

	        // Exibindo os dados
	        for (int i = 0; i < pessoas.length; i++) {
	            System.out.println("\nDados da pessoa " + (i+1) + ":");
	            System.out.println("Nome: " + pessoas[i].nome);
	            System.out.println("CPF: " + pessoas[i].cpf);
	            System.out.println("Data de Nascimento: " + pessoas[i].dataNascimento);
	        }
	    }
	}