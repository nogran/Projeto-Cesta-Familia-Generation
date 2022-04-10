// ! mostrar lista com elementos da cesta

package projetoJava;

import java.util.Scanner;

public class Pessoa {

	//Atributos
	String nome;
	String end;
	int idade;
	String cpf;
	int quantidadePessoas;
	double rendaTotal;
	double rendaPessoa;
	double salarioMinimo = 1200.00;
	
	Scanner leia = new Scanner(System.in);	
	
	void checarIdade () {
		System.out.print("Digite a idade: ");
		idade = leia.nextInt();
		leia.nextLine();
		if (idade >= 18) {
			Inserir();
		}
		else {
			System.out.println("Você não pode ter acesso");
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
		System.out.println("Quantas pessoas moram com você?");
		quantidadePessoas = leia.nextInt();
		System.out.println("Qual a renda total da família (incluindo você)?");
		rendaTotal = leia.nextDouble();
		
		System.out.println("Nome: "+nome);
		System.out.println("Idade: "+idade);
		System.out.println("Endereço: "+end);
		System.out.println("CPF: "+cpf);
		System.out.println("Quantidade de pessoas da residência: "+ quantidadePessoas);
		System.out.println("Renda Total da família: "+ rendaTotal);
		leia.close();
		}
	
	void calcularRenda () {
		rendaPessoa = rendaTotal / quantidadePessoas;
		System.out.printf("Renda por pessoa: %.2f\n", rendaPessoa);
		if (rendaPessoa<= salarioMinimo && rendaPessoa >= 600.00) {
			int quantidadeCesta = 1;
			System.out.println("Você tem direito a 1 cesta!");	
		}
		else if (rendaPessoa < 600.00 && rendaPessoa >= 400.00) {
			int quantidadeCesta = 2;
			System.out.println("Você tem direito a 2 cestas!");
		}
		else if (rendaPessoa < 400.00 && rendaPessoa >= 200.00) {
			int quantidadeCesta = 3;
			System.out.println("Você tem direito a 3 cestas!");
		}
		else if(rendaPessoa < 200.00 && rendaPessoa >= 0.00) {
			int quantidadeCesta = 4;
			System.out.println("Você tem direito a 4 cestas!");
		}
		else {
			System.out.println("Você não atende os requisitos para receber a cesta.");
		}
	}

	void cesta() {
		// TODO Auto-generated method stub		
	}
}