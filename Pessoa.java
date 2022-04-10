// ! mostrar lista com elementos da cesta

package projetoJava;

import java.util.Scanner;

public class Pessoa {

	//Pessoa p1 = new Pessoa();
	//Atributos
	String nome;
	String end;
	int idade;
	String cpf;
	int quantidadePessoas;
	double rendaTotal;
	double rendaPessoa;
	double salarioMinimo = 1212.00;
	String GREEN_BG = "\u001B[42m";
	String RED_BG = "\u001B[41m";
	String BLACK = "\u001B[30m";
	String RESET = "\u001B[0m";
	
	Scanner leia = new Scanner(System.in);	
	
	void checarIdade() {
		System.out.print("Digite a idade: ");
		idade = leia.nextInt();
		leia.nextLine();
		
		if (idade >= 18) {
			Inserir();
		}
		else if (idade<18 && idade>=0){
			System.out.println(RED_BG+"Você não pode ter acesso."+RESET);
			System.exit(idade); //finalizar o programa
		}
		else {
			System.out.println(RED_BG+"Idade invalida."+RESET);
			System.exit(idade);
		}
	}
	
	void Inserir() {
		System.out.print("Digite o nome: ");
		nome = leia.nextLine();
		System.out.print("Digite o endereço: ");
		end = leia.nextLine();
		//leia.nextLine();
		System.out.print("Digite o CPF: ");
		cpf = leia.nextLine();
		System.out.println();
		System.out.print("Quantas pessoas moram com você? ");
		quantidadePessoas = leia.nextInt();
		System.out.print("Qual a renda total da família (incluindo você)? ");
		rendaTotal = leia.nextDouble();
		System.out.println();
	}
	
	void calcularRenda () {
		rendaPessoa = rendaTotal / quantidadePessoas;
		if (rendaPessoa<= salarioMinimo && rendaPessoa >= 600.00) {
			int quantidadeCesta = 1;
			System.out.println(GREEN_BG+BLACK+"Você tem direito à 1 cesta!"+RESET);
		}
		else if (rendaPessoa < 600.00 && rendaPessoa >= 400.00) {
			int quantidadeCesta = 2;
			System.out.println(GREEN_BG+BLACK+"Você tem direito à 2 cestas!"+RESET);
		}
		else if (rendaPessoa < 400.00 && rendaPessoa >= 200.00) {
			int quantidadeCesta = 3;
			System.out.println(GREEN_BG+BLACK+"Você tem direito à 3 cestas!"+RESET);
		}
		else if(rendaPessoa < 200.00 && rendaPessoa >= 0.00) {
			int quantidadeCesta = 4;
			System.out.println(GREEN_BG+BLACK+"Você tem direito à 4 cestas!"+RESET);
		}
		else {
			System.out.println(RED_BG+"Você não atende os requisitos para receber a cesta."+RESET);
		}
		System.out.println();
	}
	
	void imprimirInfo() {
		System.out.println("--------------Dados Cadastrados--------------");
		System.out.println("Nome: "+nome);
		System.out.println("Idade: "+idade);
		System.out.println("Endereço: "+end);
		System.out.println("CPF: "+cpf);
		System.out.println("Quantidade de pessoas da residência: "+ quantidadePessoas);
		System.out.println("Renda Total da família: R$"+ rendaTotal);
		System.out.printf("Renda por pessoa: R$%.2f\n", rendaPessoa);
		leia.close();
	}

	void cesta() {
		// TODO Auto-generated method stub		
	}
}
