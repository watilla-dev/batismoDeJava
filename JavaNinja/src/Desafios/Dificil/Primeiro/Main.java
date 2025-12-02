package Desafios.Dificil.Primeiro;

public class Main {
    public static void main(String[] args) {

        NinjaBasico NinjaBasico = new NinjaBasico("Watilla", 32, "golpe de adagas");
        System.out.println(NinjaBasico.mostrarInformacoes());
        NinjaBasico.executarHabilidade();

        // NINJA AVANCADO

        NinjaAvancado N1 = new NinjaAvancado("Happy",225,"Latir","Lamber as unhas");
        System.out.println(N1.mostrarInformacoes());
        N1.executarHabilidade();
    }
}
