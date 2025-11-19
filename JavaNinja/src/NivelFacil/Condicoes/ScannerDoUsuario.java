package NivelFacil.Condicoes;

import java.util.Scanner;

public class ScannerDoUsuario {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o nome do Ninja: ");
        String nomeDoNinja = teclado.nextLine().toUpperCase();
        System.out.print("Digite a idade do Ninja: ");
        int idadeDoNinja = teclado.nextInt();

        if(idadeDoNinja >=18){
            System.out.println("O ninja "+ nomeDoNinja+ " pode sair da aldeia para fazer missoes!");
        }else{
            System.out.println("O ninja "+ nomeDoNinja+ " é muito novo para sair da aldeia!");
        }

        teclado.close();




    }
}
