package Desafios.Dificil.Primeiro;

public class NinjaAvancado extends NinjaBasico implements NinjaAtribuicoes {

    String especialidade;

    public NinjaAvancado(String nome, int idade, String habilidade, String especialidade) {
        super(nome, idade, habilidade);
        this.especialidade = especialidade;
    }


    @Override
    public String mostrarInformacoes() {
        return super.mostrarInformacoes() + " especialidade: " + this.especialidade;
    }

    @Override
    public void executarHabilidade() {
        System.out.println("Ninja: " + this.nome + " executou: " + this.especialidade);

    }
}
