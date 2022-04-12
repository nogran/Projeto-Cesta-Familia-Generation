package projetoJava;

import java.util.ArrayList;

public class TipoCestas extends PessoaController {

	void cesta() { 
		String tipoCesta1 = "Cesta Comum (Padrão)";
		String tipoCesta2 = "Cesta Kids";
		String tipoCesta3 = "Cesta Zero Açúcar";
		String tipoCesta4 = "Cesta Fit";
		String tipoCesta5 = "Cesta Zero Glúten";

		//array para salvar os tipos de cestas
		ArrayList<String> tipoCestas = new ArrayList<>(); 

		tipoCestas.add(tipoCesta1);
		tipoCestas.add(tipoCesta2);
		tipoCestas.add(tipoCesta3);
		tipoCestas.add(tipoCesta4);
		tipoCestas.add(tipoCesta5);
		
		//loop para imprimir itens do array de cestas
		for (int i=0; i<tipoCestas.size(); i++) {   //.size retorna quantidade de itens do array tiposCestas
			System.out.println((i+1)+". "+tipoCestas.get(i));
			}
			
		System.out.println();
		System.out.println("Você gostaria de mudar alguma Cesta ? Caso selecione NÃO, "
				+ "a cesta escolhida será a padrão");
		
		System.out.println("Digite [1] para SIM ou [2] para NÃO. ");
		
		//variavel n recebe valor se o usuario quer trocar cesta ou nao
		int n = leia.nextInt(); 
		System.out.println();
		
		//n igual a 1 -> usuario quer trocar a cesta
		if (n == 1) { 
			
				// se o numero de cestas for igual ao numero que deseja trocar 
				if(quantidadeCesta == 1) {  
					System.out.println("Digite o número da Cesta que deseja trocar: ");
					System.out.println("Opções de cestas: ");
					
					//loop para imprimir itens do array de cestas
					for (int i=1; i<tipoCestas.size(); i++) {  //.size retorna quantidade de itens do array tiposCestas
						System.out.println((i)+". "+tipoCestas.get(i));
						}
					
					//ler numero da cesta para troca
					int c = leia.nextInt(); 
					System.out.println("Sua Cesta e do tipo "+tipoCestas.get(c)+".");
					
					//adiciona no array cestas do pedido a cesta escolhida pelo usuario
					cestasDoPedido.add(tipoCestas.get(c));
				}
				
				//se quantidade de cesta da pessoa for maior que a quantide que deseja trocar  
				else if(quantidadeCesta>=numeroDeTrocas) {  
					
					System.out.println("Quantas cestas gostaria de trocar ? ");
					numeroDeTrocas = leia.nextInt();
					System.out.println();
					
					System.out.println("Digite o número da Cesta que deseja trocar: ");
					System.out.println("Opções de cestas: ");
					
					//loop para imprimir itens do array de cestas
					for (int i=1; i<tipoCestas.size(); i++) {  //.size retorna quantidade de itens do array tiposCestas
						System.out.println((i)+". "+tipoCestas.get(i));
					}
					
					//insere numero que deseja trocar 
					int c = leia.nextInt(); 				//0 = posicao cesta comum	 //c = cesta escolhida pelo usuario
					System.out.println("Sua Cesta trocada foi " + tipoCestas.get(0) +" pela "+tipoCestas.get(c)+".");
					
					//adiciona no array cestas do pedido a cesta escolhida pelo usuario
					cestasDoPedido.add(tipoCestas.get(c));
					
					//loop para continuar a troca das cestas -> -1 pois uma cesta ja foi adicionada acima
					for(int f=quantidadeCesta - 1; f>(quantidadeCesta - numeroDeTrocas); f--) {
						System.out.println();
						System.out.println("Digite a PROXIMA cesta que deseja trocar: ");
						
						//insere numero da cesta que deseja trocar 
						int g = leia.nextInt(); 			       //0 = posicao cesta comum	   //g = cesta escolhida pelo usuario
						System.out.println("Sua Cesta trocada foi " + tipoCestas.get(0) +" pela "+tipoCestas.get(g)+".");
						cestasDoPedido.add(tipoCestas.get(g));
						System.out.println();
					}
					System.out.println();
					System.out.println("Pre cadastro realizado com sucesso! Por favor envie a documentacao necessaria.");
				}
				else {
					System.out.println("Digite um valor válido!");
					System.exit(numeroDeTrocas);
				}
		}
		
		//n igual a 2 -> nao quer trocar de cesta e possui mais de 1 cesta
		else if (n == 2 && quantidadeCesta > 1) {
			System.out.println("Suas Cestas são do tipo "+tipoCestas.get(0)+".");
		}
		
		//n igual a 2 -> nao quer trocar de cesta e usuario tem apenas 1 cesta
		else if (n == 2 && quantidadeCesta == 1) {
			System.out.println("Sua Cesta e do tipo "+tipoCestas.get(0)+".");
		}
		
		//caso digite numero diferente de [1]sim ou [2]nao
		else {
			System.out.println(RED_BG + "Valor digitado inválido! Registre seus dados novamente." + RESET);
			System.exit(n);
		}
	}
}