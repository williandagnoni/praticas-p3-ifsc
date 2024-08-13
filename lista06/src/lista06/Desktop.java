package lista06;

import java.util.ArrayList;

public class Desktop extends Produtos {
	
	private Boolean Gamer;
	ArrayList <String> pecas = new ArrayList<>();
	public Boolean getGamer() {
		return Gamer;
	}
	public void setGamer(Boolean gamer) {
		Gamer = gamer;
	}
	public ArrayList<String> getPecas() {
		return pecas;
	}
	public void setPecas(ArrayList<String> pecas) {
		this.pecas = pecas;
	}
	
}
