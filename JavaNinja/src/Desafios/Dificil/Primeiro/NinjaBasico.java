package Desafios.Dificil.Primeiro;


public class NinjaBasico implements NinjaAtribuicoes {
    String nome;
    int idade;
    TipoHabilidade habilidade;





    public NinjaBasico(String nome, int idade, String habilidade) {
        this.nome = nome;
        this.idade = idade;


    }

    @Override
    public String toString() {
        return "NinjaBasico " +
                "Nome=" + nome +
                ", Idade=" + idade +
                ", Habilidade=" + habilidade
                ;
    }

    @Override
    public String mostrarInformacoes() {
        //return "Nome: " + this.nome + " habilidade: " + this.habilidade;
        return toString();
    }

    @Override
    public void executarHabilidade() {
        System.out.println("Ninja executando: " + this.habilidade);

    }
}
