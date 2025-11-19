package Desafios;

public class Desafio1 {
    public static void main(String[] args) {
        String nomeNinja1 = "Asuma";
        short idadeNinja1 = 228;
        char missaoAtribuidaNinja1 = 'E';
        String statusConclusaoNinja1 = "";


        String nomeNinja2 = "Kurenai";
        short idadeNinja2 = 66;
        char missaoAtribuidaNinja2 = 'B';
        String dificuldadeMissaoNinja2;
        String statusConclusaoNinja2 = "";


        String nomeNinja3 = "Kakashi";
        short idadeNinja3 = 22;
        char missaoAtribuidaNinja3 = 'E';
        String statusConclusaoNinja3 = "";


        if(idadeNinja1 <15) {
            if(missaoAtribuidaNinja1 == 'C' || missaoAtribuidaNinja1 == 'D') {
                statusConclusaoNinja1 = "Concluida";
            }
            else {
                statusConclusaoNinja1 = "Não concluida";
            }
        }else{
            statusConclusaoNinja1 = "Concluida";
        }

        if(idadeNinja2 <15) {
            if(missaoAtribuidaNinja2 == 'C' || missaoAtribuidaNinja2 == 'D') {
                statusConclusaoNinja2 = "Concluida";
            }else {
                statusConclusaoNinja2 = "Não concluida";
            }
        }else{
            statusConclusaoNinja2 = "Concluida";
        }

        if(idadeNinja3 <15) {
            if(missaoAtribuidaNinja3 == 'C' || missaoAtribuidaNinja3 == 'D') {
                statusConclusaoNinja3 = "Concluida";
            }else {
                statusConclusaoNinja3 = "Não concluida";
            }
        }else{
            statusConclusaoNinja3 = "Concluida";
        }


        System.out.println("nomeNinja1 = " + nomeNinja1);
        System.out.println("idadeNinja1 = " + idadeNinja1);
        System.out.println("missaoAtribuidaNinja1 = " + missaoAtribuidaNinja1);
        System.out.println("statusConclusaoNinja1 = " + statusConclusaoNinja1);

        System.out.println("-----------------------------------------------");
        System.out.println("nomeNinja2 = " + nomeNinja2);
        System.out.println("idadeNinja2 = " + idadeNinja2);
        System.out.println("missaoAtribuidaNinja2 = " + missaoAtribuidaNinja2);
        System.out.println("statusConclusaoNinja2 = " + statusConclusaoNinja2);

        System.out.println("-----------------------------------------------");        System.out.println("nomeNinja1 = " + nomeNinja1);
        System.out.println("idadeNinja3 = " + idadeNinja3);
        System.out.println("missaoAtribuidaNinja3 = " + missaoAtribuidaNinja3);
        System.out.println("statusConclusaoNinja3 = " + statusConclusaoNinja3);

        System.out.println("-----------------------------------------------");







    }
}
