package Desafios.Dificil.Primeiro;

public class Main {


    public static void main(String[] args) {


        NinjaBasico NinjaBasico = new NinjaBasico("Watilla", 32, "TAIJUTSU");
        System.out.println(NinjaBasico.mostrarInformacoes());
        NinjaBasico.executarHabilidade();

        // NINJA AVANCADO

        NinjaAvancado N1 = new NinjaAvancado("Happy",225,"TAIJUTSU","TAIJUTSU");
        System.out.println(N1.mostrarInformacoes());
        N1.executarHabilidade();


        //
    }
}
