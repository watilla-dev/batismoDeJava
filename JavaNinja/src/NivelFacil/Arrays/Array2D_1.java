package NivelFacil.Arrays;

public class Array2D_1 {
    public static void main(String[] args) {

        String [][]classes = new String[3][3];

        classes[0][0] = "Oitava";
        classes[0][1] = "Watilla";
        classes[0][2] = "Nina";

        classes[1][0] = "Nono";
        classes[1][1] = "Happy";
        classes[1][2] = "Mel";

        classes[2][0] = "Primeiro";
        classes[2][1] = "Mia";
        classes[2][2] = "Miau";


        for (int i = 0; i < classes.length; i++) {

            if(i != 0){
                System.out.println("---------------");
            }
            else{
                System.out.println(" ");
            }
            for (int j = 0; j < classes[i].length; j++) {
                if(j == 0){
                    System.out.println("Classe: " + classes[i][j]);
                }
                else{
                    System.out.println("Aluno: " + classes[i][j]);
                }
            }

        }
    }
}
