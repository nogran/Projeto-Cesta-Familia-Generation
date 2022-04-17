package projetoJava;

import java.util.InputMismatchException;

public class PessoaController extends Pessoa {

	void checarIdade() {
		System.out.println("Seja Bem-Vinde :D");
		System.out.println();
		try {
			System.out.print("Digite a idade: ");
			idade = leia.nextInt();
			leia.nextLine();
			if (idade >= 18) {
				Inserir();
			} else if (idade < 0) { 
				// Caso digitar idade negativa.
				System.out.println(RED_BG + "\nIdade inválida." + RESET_COLOR);

				// Finaliza o programa.
				System.exit(idade);
			}
			else {
				// Caso digitar 0 < idade > 18.
				System.out.println(RED_BG + "\nVocê não pode ter acesso." + RESET_COLOR);
				System.exit(idade);
			}
		} catch (InputMismatchException e) {
			System.out.println(RED_BG + "\nIdade inválida. Por favor digite apenas números." + RESET_COLOR);
			System.exit(idade);
		}
	}

	// Inserir dados do cadastro.
	void Inserir() {
		System.out.print("Digite o nome: ");
		nome = leia.nextLine();
		System.out.print("Digite o endereço: ");
		end = leia.nextLine();
		System.out.print("Digite o número de telefone: ");
		telefone = leia.nextLine();
		System.out.print("Digite o CPF: ");
		cpf = leia.nextLine();
		try {
			System.out.print("Quantas pessoas moram com você? ");
			quantidadePessoas = leia.nextInt();
		}
		catch (InputMismatchException e) {
			System.out.println(RED_BG + "\nPor favor digite apenas números." + RESET_COLOR);
			System.exit(quantidadePessoas);
		}
		try {
			System.out.print("Qual a renda total da família (incluindo você)? ");
			rendaTotal = leia.nextDouble();
		}
		catch  (InputMismatchException e) {
			System.out.println(RED_BG + "\nPor favor digite apenas números." + RESET_COLOR);
			System.exit((int) rendaTotal);
		}
		System.out.println();
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
		System.out.printf("Renda Total da família: R$%.2f\n", rendaTotal);
		System.out.printf("Renda por pessoa: R$%.2f\n", rendaPessoa);
		System.out.println("Quantidade total de cestas: " + quantidadeCesta);
		System.out.println("Quantidade de cestas especiais: " + numeroDeTrocas);
		System.out.println("Cesta especiais do pedido " + cestasDoPedido);
		leia.close();
	}
	
	void imprimirLogo() {
		System.out.println("............................................................................................");
		System.out.println("...................*........................................................................");
		System.out.println(".......................................*************....................................... ");
		System.out.println("..................**..............***********************.................................. ");
		System.out.println("..................,**..........,***********,....,************.............................. ");
		System.out.println("...................***........*******.............*************............................ ");
		System.out.println("....................****......******...............******...*****.......................... ");
		System.out.println("......................****,...*****................******......***......................... ");
		System.out.println("........................************.............*******.........**........................ ");
		System.out.println("..........................*****************************...........**....................... ");
		System.out.println("..............................**********************..............,*....................... ");
		System.out.println("....................................***********....................*....................... ");
		System.out.println("..................................................................*.........................");
		System.out.println("  :'#######:::::'###:::::::'########::::'###::::'##::::'##:'####:'##:::::::'####::::'###::::");
		System.out.println("  '##.... ##:::'##=##:::::: ##.....::::'## ##::: ###::'###:. ##:: ##:::::::. ##::::'## ##:::");
		System.out.println("   ##::::..:::'##:. ##::::: ##::::::::'##:. ##:: ####'####:: ##:: ##:::::::: ##:::'##:. ##::");
		System.out.println("   ########::':::::. :::::: ######:::'##:::. ##: ## ### ##:: ##:: ##:::::::: ##::'##:::. ##:");
		System.out.println("   ##.... ##: ::::::::::::: ##...:::: #########: ##. #: ##:: ##:: ##:::::::: ##:: #########:");
		System.out.println("`  ##:::: ##: ::::::::::::: ##::::::: ##.... ##: ##:.:: ##:: ##:: ##:::::::: ##:: ##.... ##:");
		System.out.println("  . #######:: ::::::::::::: ##::::::: ##:::: ##: ##:::: ##:'####: ########:'####: ##:::: ##:");
		System.out.println(":.........:::..:::::..:::::..::::::::..:::::..::..:::::..::....::........::....::..:::::..::");
	}
}