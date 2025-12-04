package CodigosTestesAvulsos.Arrays;

import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        double[] notas = new double[4];

        for (int i = 0; i < notas.length; i++) {
            System.out.println("Digite a nota " +  (i + 1) + ":");
            notas[i] = scanner.nextDouble();
            scanner.nextLine();
        }

        for (int i = 0; i < notas.length; i++) {
            System.out.println( (i + 1) + " BIMESTRE " + ":" + notas[i] );

        }


    }
}
