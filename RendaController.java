package projetoJava;

public class RendaController extends TipoCestas {
	
	// Funcao para verficiar beneficio e calcular numero de cestas.
	void calcularRenda() {
		rendaPessoa = rendaTotal / quantidadePessoas;
		if (rendaPessoa <= salarioMinimo && rendaPessoa >= 600.00) {
			quantidadeCesta = 1;
			System.out.println(GREEN_BG + BLACK + "Você tem direito à 1 cesta!" + RESET);
		} else if (rendaPessoa < 600.00 && rendaPessoa >= 400.00) {
			quantidadeCesta = 2;
			System.out.println(GREEN_BG + BLACK + "Você tem direito à 2 cestas!" + RESET);
		} else if (rendaPessoa < 400.00 && rendaPessoa >= 200.00) {
			quantidadeCesta = 3;
			System.out.println(GREEN_BG + BLACK + "Você tem direito à 3 cestas!" + RESET);
		} else if (rendaPessoa < 200.00 && rendaPessoa >= 0.00) {
			quantidadeCesta = 4;
			System.out.println(GREEN_BG + BLACK + "Você tem direito à 4 cestas!" + RESET);
		} else {
			System.out.println(RED_BG + "Você não atende os requisitos para receber a cesta." + RESET);
		}
		System.out.println();
	}	
}