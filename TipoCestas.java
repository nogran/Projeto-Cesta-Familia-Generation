package projetoJava;

import java.util.ArrayList;

public class TipoCestas {
	
	void cesta() {
	String tipoCesta1 = "Cesta Kids";
	String tipoCesta2 = "Cesta Zero Açúcar";
	String tipoCesta3 = "Cesta Fit";
	String tipoCesta4 = "Cesta Zero Glúten";
	
	ArrayList<String> tipoCestas = new ArrayList<>();
	
	tipoCestas.add(tipoCesta1);
	tipoCestas.add(tipoCesta2);
	tipoCestas.add(tipoCesta3);
	tipoCestas.add(tipoCesta4);
	
	System.out.println(tipoCestas);
	}
}