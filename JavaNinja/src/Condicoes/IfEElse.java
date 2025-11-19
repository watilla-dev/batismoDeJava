package Condicoes;

public class IfEElse {
    public static void main(String[] args) {

        /*
        IF e ELSE - Condiçoes
         */
        String nome = "Naruto";
        String rank;
        short idade = 16;
        boolean hokage = false;
        short numeroDeMissoes = 22;

        if(numeroDeMissoes <=10 && idade >=16){
            rank = "CHUNIN";
            System.out.println("rank = " + rank);
        }
        else if(numeroDeMissoes >=20 && idade >=16){
            rank = "JOUNIN";
            System.out.println("rank = " + rank);
        }
        else {
            rank = "GENNIN";
            System.out.println("rank = " + rank);
        }



    }

}
