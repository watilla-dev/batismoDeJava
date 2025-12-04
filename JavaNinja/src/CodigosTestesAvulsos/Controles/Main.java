package CodigosTestesAvulsos.Controles;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("É divisível? digite e descubra!");
        Scanner scanner = new Scanner(System.in);
        double numero =0;
        double divisivel =0;
        System.out.println("Digite um número: ");
        numero = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Agora digite o número que quer verificar se é divisível:");
        divisivel = scanner.nextInt();

        // Checagem se o primeiro numero é divisivel pelo primeiro que foi passado
        // Se for ele sai do loop e finaliza
        // Se nao for ele continua e mostra todos os que sao divisiveis dentro do range passado pelo usuario
        for (double i = 1; i <= divisivel; i++) {
            if(numero % divisivel == 0){
                System.out.printf("O numero: %.0f é divisível por %.0f\n", numero, divisivel);
                break;
            } else if (numero % i ==0) {
                System.out.printf("O numero %.0f é divisivel por %.0f\n", numero, i);
            }else{
                System.out.printf("O numero %.0f não é divisível por %.0f\n", numero, i);
            }

        }

    }
}
