package NivelINtermediario;

public class Ninja {
    String nome;
    int idade;
    String aldeia;


    public int mostrarIdade(){
        return idade;
    }

    public void ataque(Class Ninja){
        System.out.println("PERDEU");
    }

    public void sharinganAtivado(){
        System.out.println("Meu nome é " + this.nome + " o sharingan ativou, eu sou um Uchiha!");
    }
    @Override
    public String toString() {
        return "Ninja{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", aldeia='" + aldeia + '\'' +
                '}';
    }
}
