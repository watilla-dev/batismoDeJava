package NivelFacil.Condicoes;

import java.util.Scanner;

public class SwitchCasesEstudo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escolha um ninja: ");
        System.out.println("1 - Naruto Uzumaki");
        System.out.println("2 - Sasuke Uchiha");
        System.out.println("3 - Sakura Haruno");
        System.out.println("Digite o número do ninja escolhido: ");
        int escolhaUsuario = scanner.nextInt();
        switch (escolhaUsuario) {
            case 1:
                System.out.println("Naruto Uzumaki");
                break;
            case 2:
                System.out.println("Sasuke Uchiha");
                break;
            case 3:
                System.out.println("Sakura Haruno");
                break;
            default:
                System.out.println("Escolha inválida. Tente novamente.");
        }
        scanner.close();
    }
}
