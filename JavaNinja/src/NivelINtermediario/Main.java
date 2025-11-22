package NivelINtermediario;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int opcao=0;
        int tamanhoArray = 5;
        int contadorIndiceNinja = 0;
        int contadorIndiceUchiha = 0;
        Scanner input = new Scanner(System.in);
        //Arrays para salvar os objetos
        Ninja []ninjas = new Ninja[tamanhoArray];
        Uchiha []uchihas = new Uchiha[tamanhoArray];

        while (opcao != 5){
            System.out.println("Digite [1] para criar novo ninja ");
            System.out.println("Digite [2] para ver lista de ninjas ");
            System.out.println("Digite [3] para criar novo uchiha ");
            System.out.println("Digite [4] para ver lista de uchihas ");
            System.out.println("Digite [5] para sair");
            opcao = input.nextInt();
            input.nextLine();

            switch (opcao){
                case 1:
                    if(contadorIndiceNinja <tamanhoArray){
                        Ninja ninja = new Ninja();
                        System.out.println("Digite o nome do ninja: ");
                        ninja.nome = input.nextLine();
                        System.out.println("Digite a idade do ninja: ");
                        ninja.idade = input.nextInt();
                        input.nextLine();
                        System.out.println("Digite o status da missao: ");
                        ninja.statusMissao = input.nextLine();
                        ninjas[contadorIndiceNinja]=ninja;
                        contadorIndiceNinja++;

                    }else {
                        contadorIndiceNinja = 0;
                        System.out.println("INICIANDO NOVA LISTA DE NINJAS");
                    }
                    break;

                case 2:
                    for (int i = 0; i < tamanhoArray; i++) {
                        System.out.println(ninjas[i]);
                    }
                    break;
                case 3:
                    if (contadorIndiceNinja < tamanhoArray){
                        Uchiha uchiha = new Uchiha();
                        System.out.println("Digite o nome do Uchiha ");
                        uchiha.nome = input.nextLine();
                        System.out.println("Digite a idade do Uchiha ");
                        uchiha.idade = input.nextInt();
                        input.nextLine();
                        System.out.println("Digite o status da missao: ");
                        uchiha.statusMissao = input.nextLine();
                        System.out.println("Digite a habilidade do Uchiha ");
                        uchiha.habilidadeEspecial = input.nextLine();
                        uchihas[contadorIndiceUchiha]=uchiha;
                        contadorIndiceUchiha++;
                    }else{
                        contadorIndiceUchiha = 0;
                        System.out.println("INICIANDO NOVA LISTA DE UCHIHAS");
                    }break;

                case 4:
                    for (int i = 0; i < tamanhoArray; i++) {
                        System.out.println(uchihas[i]);
                    }
                    break;

                case 5:
                    System.out.println("SAINDO...");
                    input.close();
                    break;

                default:
                    System.out.println("OPCAO INVALIDA!");

            }

        }


    }
}
