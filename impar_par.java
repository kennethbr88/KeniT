import java.util.Scanner;

public class impar_par {
	public static void main(String[] args) {
	
		// declara as variáveis,
		// sem valor algum
		int numero;
		Scanner teclado;

		// abre a "caixa"
		teclado = new Scanner(System.in);

		// solicita um número POSITIVO ao usuário;
		// caso um valor inválido seja passado, um
		// aviso ocorrerá na tela e um novo valor
		// será pedido, até que um valor válido
		// seja informado
		while(true){
			System.out.println("Digite um número não-positivo:");
			numero = teclado.nextInt();

			if(numero < 1){
				// "\n" representa uma "nova linha", vulgo
				// "quebra de linha" (line feed), vinda do
				// Padrão C (C Standard)
				System.out.println("\n'numero' NÃO pode ser menor que '1'!\n");

			}else{
				// interrompe o loop, pois um valor
				// válido foi passado (com uma quebra
				// de linha, para deixar organizado)
				System.out.println(" ");
				break;
			}
		}

		for (int i = 1; i <= numero; i++) {

			if (i % 2 == 0) {
				System.out.println(i + " - Par");

			}else if (i % 2 == 1) {
				System.out.println(i + " - Ímpar");
			}

		}

		// fecha a "caixa"
		teclado.close();
	}
}
