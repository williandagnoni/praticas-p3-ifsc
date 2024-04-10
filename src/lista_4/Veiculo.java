package lista_4;

public class Veiculo {

	private String nome;
	private Integer ano;
	
	 public Veiculo() {
	    }

	    public Veiculo(String nome, Integer ano) {
	        this.nome = nome;
	        this.ano = ano;
	    }

	    public String getNome() {
	        return nome;
	    }

	    public void setNome(String nome) {
	        this.nome = nome;
	    }

	    public Integer getAno() {
	        return ano;
	    }

	    public void setAno(Integer ano) {
	        this.ano = ano;
	    }

	    private Integer numeroRodas;
	    private String fabricante;
	    private String cor;

	    public Integer getNumeroRodas() {
	        return numeroRodas;
	    }

	    public void setNumeroRodas(Integer numeroRodas) {
	        this.numeroRodas = numeroRodas;
	    }

	    public String getFabricante() {
	        return fabricante;
	    }

	    public void setFabricante(String fabricante) {
	        this.fabricante = fabricante;
	    }

	    public String getCor() {
	        return cor;
	    }

	    public void setCor(String cor) {
	        this.cor = cor;
	    }

	}