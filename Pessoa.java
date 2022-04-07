package projetoJava;

import java.util.Scanner;

public class Pessoa {

	//Atributos
	String nome;
	String end;
	int idade;
	String cpf;
	
	
	void Inserir() {

		Scanner leia = new Scanner(System.in);
		
		System.out.print("Digite o nome: ");
		nome = leia.next();
		System.out.print("Digite a idade: ");
		idade = leia.nextInt();
		System.out.print("Digite o endereço: ");
		end = leia.next();
		System.out.print("Digite o CPF: ");
		cpf = leia.next();
		System.out.println();
		
		System.out.println("Nome: "+nome);
		System.out.println("Idade: "+idade);
		System.out.println("Endereço: "+end);
		System.out.println("CPF: "+cpf);
		
		
	}
	
}
