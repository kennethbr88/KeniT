package Desafio2;

import java.sql.SQLOutput;
import java.util.InputMismatchException;
import java.util.Scanner;

public class CadastroNinjas {
    public static void main(String[] args) {

        //Abrir operação Scanner
        Scanner in = new Scanner(System.in);
        int tamanho = 0;

        // Loop para garantir que o tamanho seja um número válido
        while (true) {
            try {
                System.out.print("Quantos nomes você quer inserir? ");
                tamanho = in.nextInt();
                in.nextLine(); // Consumir a quebra de linha após o número

                if (tamanho > 0) {
                    break; // Sai do loop se o tamanho for válido
                } else {
                    System.out.println("Por favor, insira um número positivo.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida! Insira um número inteiro.");
                in.nextLine(); // Consumir a entrada inválida
            }
        }

        // Cria um array para armazenar os nomes
        String[] ninjas = new String[tamanho];
        boolean executando = true; // Variável para controlar o loop

        while (executando) {
            System.out.println("\n===== Menu Ninja =====");
            System.out.println("1. Cadastrar Ninja");
            System.out.println("2. Listar Ninjas");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");

            try {
                int escolhaDoUsuario = in.nextInt();
                in.nextLine(); // Consumir a quebra de linha após o número

                switch (escolhaDoUsuario) {
                    case 1:
                        // Pede os nomes ao usuário
                        for (int i = 0; i < ninjas.length; i++) {
                            if (ninjas[i] == null) {
                                System.out.println("Digite o nome do ninja" + (i + 1) + ": ");
                                ninjas[i] = in.nextLine();
                                System.out.println("Nninja cadastrado com suceoss!");
                            }
                        }
                        break;

                    case 2:
                        // Exibe os nomes inseridos
                        System.out.println("=== Listar Ninjas ===");
                        for (int i = 0; i < ninjas.length; i++) {
                            if (ninjas[i] != null) { //verificar se o índice não está vazio
                                System.out.println((i + 1) + "." + ninjas[i]);
                            }
                        }
                        break;
                    case 3:
                        // Sair
                        System.out.println("Encerrando o programa... Até logo!");
                        executando = false;
                        break;
                    default:
                        //Opção inválida
                        System.out.print("Opçao invalida, tente novamente: ");
                        break;
                }
                } catch(InputMismatchException e){
                    System.out.println("Entrada inválida! Por favor, insira um número inteiro.");
                    in.nextLine(); // Consumir a entrada inválida
                }
            }

            in.close(); // Fecha o Scanner
        }
    }