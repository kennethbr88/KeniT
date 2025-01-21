import java.util.Scanner;

public class estudos_switch_case {
	public static void main(String[] args) {

		/*
		 * SwitchCases: que servem para gerar casos especificos
		 * Objetivo: pedir para o usuário escolher entre os ninjas
		*/

		// Abri a caixa
		Scanner caixa_de_texto = new Scanner(System.in);

		// Mostrar opções para o usuário
		System.out.println("Escolha um personagem:");
		System.out.println("1 - Sakura Uzumaki");
		System.out.println("2 - Sasuke Itachi");
		System.out.println("3 - Naruto Uzumaki");

		//Pedir para o usuário escolher uma opção
		int escolha_do_usuario = caixa_de_texto.nextInt();
		System.out.println("Voce digitou o número: " + escolha_do_usuario);

		//Reação ao escolher um personagem
		switch (escolha_do_usuario) {
			case 1:
				System.out.println("Sakura Uzumaki casada com Naruto Uzumaki");
				break;
			case 2:
				System.out.println("Sasuke Itachi o assassino da familia");
				break;
			case 3:
				System.out.println("Naruto Uzumaki o Hokage mais engraçado");
				break;
			default:
				System.out.println("Valor inválido! Tente: 1, 2 ou 3.");
				break;

		}

		//Fechei a caixa
		caixa_de_texto.close();
	}
}
