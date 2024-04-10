package lista_3;

public class questao__1 {
	    public String nome;
	    public long cpf;
	    public String dataNascimento;

	    public static void main(String[] args) {
	    	questao__1 pessoa1 = new questao__1();
	        pessoa1.nome = "willian";
	        pessoa1.cpf = 12345678900L;
	        pessoa1.dataNascimento = "04/10/2006";

	        questao__1 pessoa2 = new questao__1();
	        pessoa2.nome = "lezio";
	        pessoa2.cpf = 98765432100L;
	        pessoa2.dataNascimento = "09/04/2006";

	        questao__1 pessoa3 = new questao__1();
	        pessoa3.nome = "lucas";
	        pessoa3.cpf = 56789012300L;
	        pessoa3.dataNascimento = "06/02/2006";

	        // exibindo os dados
	        System.out.println("Dados da pessoa 1:");
	        System.out.println("Nome: " + pessoa1.nome);
	        System.out.println("CPF: " + pessoa1.cpf);
	        System.out.println("Data de Nascimento: " + pessoa1.dataNascimento);

	        System.out.println("\nDados da pessoa 2:");
	        System.out.println("Nome: " + pessoa2.nome);
	        System.out.println("CPF: " + pessoa2.cpf);
	        System.out.println("Data de Nascimento: " + pessoa2.dataNascimento);

	        System.out.println("\nDados da pessoa 3:");
	        System.out.println("Nome: " + pessoa3.nome);
	        System.out.println("CPF: " + pessoa3.cpf);
	        System.out.println("Data de Nascimento: " + pessoa3.dataNascimento);
	    }
	}
