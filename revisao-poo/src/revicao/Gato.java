package revicao;

public class Gato extends Animal {

    private String apelido;
    private String pedigree;

    public Gato(String nomeCientifico, String apelido, String pedigree) {
        super(nomeCientifico);
        this.apelido = apelido;
        this.pedigree = pedigree;
    }

    public String getApelido() {
        return apelido;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
    }

    public String getPedigree() {
        return pedigree;
    }

    public void setPedigree(String pedigree) {
        this.pedigree = pedigree;
    }
}
