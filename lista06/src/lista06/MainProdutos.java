package lista06;

import java.util.ArrayList;

public class MainProdutos {
	public static void main(String[] args) {
		
		ArrayList<Desktop> desktops = new ArrayList<>();
		
		Desktop C1 = new Desktop();
		C1.setFabricante("Samsung");
		C1.setCodBarras(132321l);
		C1.setGamer(false);
		
		ArrayList<String> pecas = new ArrayList<>();
		pecas.add("Mouse");
		pecas.add("Teclado");
		pecas.add("VR");
		C1.setPecas(pecas);
		
		desktops.add(C1);
		
		Desktop PCdoWilly = new Desktop();
		PCdoWilly.setFabricante("Amd");
		PCdoWilly.setCodBarras(12564l);
		PCdoWilly.setGamer(true);
		PCdoWilly.setPecas(pecas);
		
		desktops.add(PCdoWilly);
		
		Desktop PCE = new Desktop();
		PCE.setFabricante("intel");
		PCE.setCodBarras(1654654l);
		PCE.setGamer(false);
		PCE.setPecas(pecas);
		desktops.add(PCE);
		
		
		ArrayList<Smartphone> Cell = new ArrayList<>();
		
		Smartphone m1 = new Smartphone();
		m1.setCodBarras(123154l);
		m1.setFabricante("Samsung");
		m1.setLinha("Entrada");
		m1.setDTela("2,1");
		Cell.add(m1);
		
		Smartphone ip = new Smartphone();
		ip.setCodBarras(16578l);
		ip.setFabricante("Apple");
		ip.setLinha("Elite");
		ip.setDTela("2,1");
		Cell.add(ip);
		
		Smartphone Xm = new Smartphone();
		Xm.setCodBarras(16578l);
		Xm.setFabricante("Xiaome");
		Xm.setLinha("Dntrada");
		Xm.setDTela("2,5");
		Cell.add(Xm);
		
		System.out.println("Smartphones: ");
		for (Smartphone smartphone : Cell) {
		System.out.println(smartphone.getDTela());
		System.out.println(smartphone.getFabricante());
		System.out.println(smartphone.getLinha());
		System.out.println(smartphone.getCodBarras());
			
		}
		System.out.println("");
		System.out.println("=============================================================");
		System.out.println("Desktops: ");
		for (Desktop desktop : desktops) {
			
		 System.out.println(desktop.getFabricante());
		 System.out.println(desktop.getCodBarras());
		 System.out.println(desktop.getGamer());
		 for (String peca : desktop.getPecas()) {
			System.out.println(peca);
			
		}
		}
		
		
		
		
		

	}

}
