package lista_4;

import java.util.ArrayList;

public class MainVeiculo {

	public static void main(String[] args) {

		Veiculo veiculo1 = new Veiculo();
		veiculo1.setNome("carro");
		veiculo1.setAno(2024);
		veiculo1.setNumeroRodas(4);
		veiculo1.setFabricante("Fiat");
		veiculo1.setCor("Vermelho");
		
		Veiculo veiculo2 = new Veiculo();
		veiculo2.setNome("Moto");
		veiculo2.setAno(2024);
		veiculo2.setNumeroRodas(2);
		veiculo2.setFabricante("Honda");
		veiculo2.setCor("Preta");
		
		Veiculo veiculo3 = new Veiculo();
		veiculo3.setNome("Caminhao");
		veiculo3.setAno(2024);
		veiculo3.setNumeroRodas(6);
		veiculo3.setFabricante("Volvo");
		veiculo3.setCor("Azul");
		
		
		ArrayList<Veiculo> veiculos = new ArrayList<>();
		veiculos.add(veiculo1);
		veiculos.add(veiculo2);
		veiculos.add(veiculo3);
		
		for	(Veiculo veiculo : veiculos) {
			System.out.println(veiculo.getNome());
			System.out.println(veiculo.getFabricante());
			System.out.println(veiculo.getCor());
			System.out.println(veiculo.getNumeroRodas());
			System.out.println(veiculo.getAno());


			
		}
	}

}
