package Condicoes;

import java.util.Scanner;

public class Ternarios {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.println("Escolha um nome e descubra se ele ganhou ou perdeu: ");
        System.out.println("1 - NINA");
        System.out.println("2 - HAPPY");
        System.out.println("3 - MEL");
        short escolhaUsuario = scanner.nextShort();
        String campeao = (escolhaUsuario == 2) ? "Esse e o grande campeao!" : "Esse nao e o campeao!";

        System.out.println(campeao);

        scanner.close();
    }
}
