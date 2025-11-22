package NivelINtermediario;

public class Ninja {
    String nome;
    int idade;
    String statusMissao;

    public void mostrarInformacoes(){
        System.out.println("Nome: " + nome + "\nIdade: " + idade + "\nStatusMissao: " + statusMissao);
    }

    @Override
    public String toString() {
        return "Ninja{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", statusMissao='" + statusMissao + '\'' +
                '}';
    }
}
