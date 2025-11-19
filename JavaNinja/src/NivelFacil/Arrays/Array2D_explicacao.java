package NivelFacil.Arrays;

public class Array2D_explicacao {
    public static void main(String[] args) {

        // Sao basicamente arrays dentro de outros arrays

        // Inicializacao
        // O primeiro Array precisa ser inicializado com o tamanho o segundo nao precisa

        // Imagine como linhas e colunas sendo:
        // O primeiro array é a linha horizontal e o segundo a coluna vertical

        String [][] ninjasEAldeias = new String[3][3];

        ninjasEAldeias[0][0] = "Konaha";
        ninjasEAldeias[0][1] = "Naruto Uzumaki";
        ninjasEAldeias[0][2] = "Sasuke Uchiha";

        ninjasEAldeias[1][0] = "Nevoa";
        ninjasEAldeias[1][1] = "Zabuza";
        ninjasEAldeias[1][2] = "Haku";

        ninjasEAldeias[2][0] = "Deserto";
        ninjasEAldeias[2][1] = "Gaara";
        ninjasEAldeias[2][2] = "Temari";

        for (int i = 0; i < ninjasEAldeias.length; i++) {
            if(i > 0){
                System.out.println("------------------");
            }
            for (int j = 0; j < ninjasEAldeias[i].length; j++) {
                if(j == 0){
                    System.out.println("Aldeia: " +  ninjasEAldeias[i][j]);
                    j++;
                }
                System.out.println("NINJA - " + ninjasEAldeias[i][j] + " ");

            }
        }

    }
}
