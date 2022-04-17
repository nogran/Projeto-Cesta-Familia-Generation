package projetoJava;

public class CestaFamilia {
												// Time.
	public static void main(String[] args) throws InterruptedException {		
		
		RendaController p1 = new RendaController();
		p1.imprimirLogo();
		p1.checarIdade();
		p1.calcularRenda();
		p1.cesta();
		p1.imprimirInfo();
	}
}