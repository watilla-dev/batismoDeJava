package Desafios;

import java.util.Scanner;

public class Desafio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao = 0;
        int qtdeLista = 2;
        int contadorDeIndice = 0;
        String[] ninjas = new String[qtdeLista];

        while (opcao != 4) {
            System.out.println("================== CADASTRO NINJA ==================");
            System.out.println("[1] - Cadastrar novo ninja ");
            System.out.println("[2] - Consultar ninjas cadastrados ");
            System.out.println("[3] - Remover ninja ");
            System.out.println("[4] - Sair ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o nome do ninja : ");
                    if (contadorDeIndice < qtdeLista) {
                        ninjas[contadorDeIndice] = scanner.nextLine();
                        contadorDeIndice++;
                    } else {
                        contadorDeIndice = 0;
                        System.out.println("INICIANDO NOVA LISTA (LISTA ANTERIOR CHEIA)");
                        System.out.println("Digite o nome do ninja : ");
                        ninjas[contadorDeIndice] = scanner.nextLine();
                    }
                    break;
                case 2:
                    for (int i = 0; i < ninjas.length; i++) {
                        System.out.println(i + 1 + " - " + ninjas[i]);
                    }
                    break;
                case 3:
                    System.out.println("qual ninja deseja remover?");
                    for (int i = 0; i < ninjas.length; i++) {
                        System.out.println(i + " - " + ninjas[i]);
                    }
                    int ninjaRemover = scanner.nextInt();
                    scanner.nextLine();

                    if (ninjaRemover < ninjas.length) {
                        System.out.println("Ninja " + ninjas[ninjaRemover] + " removido com sucesso");
                        ninjas[ninjaRemover] = null;
                    }
                    break;
                default:
                    System.out.println("Opção inválida");

            }

        }
        scanner.close();
    }
}