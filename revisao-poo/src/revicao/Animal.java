package revicao;

public abstract class Animal {

    private String nomeCientifico;
    private String classe;
    
    public Animal(String nomeCientifico) {
        this.nomeCientifico = nomeCientifico;
    }

    public String getNomeCientifico() {
        return nomeCientifico;
    }

    public void setNomeCientifico(String nomeCientifico) {
        this.nomeCientifico = nomeCientifico;
    }

	public String getClasse() {
		return classe;
	}

	public void setClasse(String classe) {
		this.classe = classe;
	}
}
