package projetoJava;

import java.util.ArrayList;
import java.util.Scanner;

public class Pessoa {
	
	String nome, end, cpf, telefone ;
	int idade, quantidadePessoas, quantidadeCesta, numeroDeTrocas;
	double rendaTotal, rendaPessoa, salarioMinimo = 1212.00;
	String restricaoAlimentar;
	String GREEN_BG = "\u001B[42m", RED_BG = "\u001B[41m", BLACK = "\u001B[30m", RESET = "\u001B[0m";

	Scanner leia = new Scanner(System.in);

	//array cestas do pedido
	ArrayList<String> cestasDoPedido = new ArrayList<>(); 
	
	void checarIdade() {
		System.out.print("Digite a idade: ");
		idade = leia.nextInt();
		leia.nextLine();

		if (idade >= 18) {
			Inserir();
		} else if (idade < 18 && idade >= 0) {
			System.out.println(RED_BG + "Você não pode ter acesso." + RESET);
			
			// finaliza o programa
			System.exit(idade); 
		}
		
		//caso digitar idade negativa
		else {
			System.out.println(RED_BG + "Idade invalida." + RESET); 
			System.exit(idade);
		}
	}

	//inserir dados do cadastro
	void Inserir() { 
		System.out.print("Digite o nome: ");
		nome = leia.nextLine();
		System.out.print("Digite o endereço: ");
		end = leia.nextLine();
		System.out.print("Digite o número de telefone: ");
		telefone = leia.nextLine();
		System.out.print("Digite o CPF: ");
		cpf = leia.nextLine();
		System.out.println();
		System.out.print("Quantas pessoas moram com você? ");
		quantidadePessoas = leia.nextInt();
		System.out.print("Qual a renda total da família (incluindo você)? ");
		rendaTotal = leia.nextDouble();
		System.out.println();
	}
	
	//funcao para verficiar beneficio e calcular numero de cestas
	void calcularRenda() { 
		rendaPessoa = rendaTotal / quantidadePessoas;
		if (rendaPessoa <= salarioMinimo && rendaPessoa >= 600.00) {
			quantidadeCesta = 1;
			System.out.println(GREEN_BG + BLACK + "Você tem direito à 1 cesta!" + RESET);
		}
		else if (rendaPessoa < 600.00 && rendaPessoa >= 400.00) {
			quantidadeCesta = 2;
			System.out.println(GREEN_BG + BLACK + "Você tem direito à 2 cestas!" + RESET);
		}
		else if (rendaPessoa < 400.00 && rendaPessoa >= 200.00) {
			quantidadeCesta = 3;
			System.out.println(GREEN_BG + BLACK + "Você tem direito à 3 cestas!" + RESET);
		}
		else if (rendaPessoa < 200.00 && rendaPessoa >= 0.00) {
			quantidadeCesta = 4;
			System.out.println(GREEN_BG + BLACK + "Você tem direito à 4 cestas!" + RESET);
		}
		else {
			System.out.println(RED_BG + "Você não atende os requisitos para receber a cesta." + RESET);
		}
		System.out.println();
	}
	
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
		for (int i=0; i<tipoCestas.size(); i++) { 
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
				System.out.println("Quantas cestas gostaria de trocar ? ");
				numeroDeTrocas = leia.nextInt();
				System.out.println();
				
				// se o numero de cestas for igual ao numero que deseja trocar 
				if(quantidadeCesta == 1) {  
					System.out.println("Digite o número da Cesta que deseja trocar: ");
					System.out.println("Opções de cestas: ");
					
					//loop para imprimir itens do array de cestas
					for (int i=1; i<tipoCestas.size(); i++) {  
						System.out.println((i)+". "+tipoCestas.get(i));
						}
					
					//ler numero da cesta para troca
					int c = leia.nextInt(); 
					System.out.println("Suas Cestas são do tipo "+tipoCestas.get(c)+".");
					
					//adiciona no array cestas do pedido a cesta escolhida pelo usuario
					cestasDoPedido.add(tipoCestas.get(c));
				}
				
				//se quantidade de cesta da pessoa for maior que a quantide que deseja trocar  
				else if(quantidadeCesta>=numeroDeTrocas) {  
					System.out.println("Digite o número da Cesta que deseja trocar: ");
					System.out.println("Opções de cestas: ");
					
					//loop para imprimir itens do array de cestas
					for (int i=1; i<tipoCestas.size(); i++) { 
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
		
		//n igual a 2 -> nao quer trocar de cesta
		else if (n == 2) {
			System.out.println("Suas Cestas são do tipo "+tipoCestas.get(0)+".");
		}
		
		//caso digite numero diferente de [1]sim ou [2]nao
		else {
			System.out.println(RED_BG + "Valor digitado inválido! Registre seus dados novamente." + RESET);
			System.exit(n);
		}
	}
	
	void imprimirInfo() {
		System.out.println();
		System.out.println("--------------Dados Cadastrados--------------");
		System.out.println("Nome: " + nome);
		System.out.println("Idade: " + idade);
		System.out.println("Endereço: " + end);
		System.out.println("Telefone: "+telefone);
		System.out.println("CPF: " + cpf);
		System.out.println("Quantidade de pessoas da residência: " + quantidadePessoas);
		System.out.println("Renda Total da família: R$" + rendaTotal);
		System.out.printf("Renda por pessoa: R$%.2f\n", rendaPessoa);
		System.out.println("Quantidade total de cestas: " + quantidadeCesta);
		System.out.println("Quantidade de cestas especiais: " + numeroDeTrocas);
		System.out.println("Cesta especiais do pedido " + cestasDoPedido);
		leia.close();
	}
}