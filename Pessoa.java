package projetoJava;

import java.util.ArrayList;
import java.util.Scanner;

public class Pessoa {
	
	String nome, end, cpf, telefone;
	int idade, quantidadePessoas, quantidadeCesta, numeroDeTrocas;
	double rendaTotal, rendaPessoa, salarioMinimo = 1212.00;
	String restricaoAlimentar;
	String GREEN_BG = "\u001B[42m", RED_BG = "\u001B[41m",
			BLACK = "\u001B[30m", RESET_COLOR = "\u001B[0m";

	Scanner leia = new Scanner(System.in);

	// Array cestas especiais do pedido.
	ArrayList<String> cestasDoPedido = new ArrayList<>();
}