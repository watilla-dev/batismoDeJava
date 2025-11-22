package NivelINtermediario;

public class Uchiha extends Ninja {
    String habilidadeEspecial;

    public String mostrarHabilidadeEspecial() {
        return habilidadeEspecial;
    }

    @Override
    public void mostrarInformacoes() {
        System.out.println("Nome: "+ nome + "\nidade: "+ idade+ "\nStatusMissao: "+ statusMissao +
                "\nHabilidade: "+ habilidadeEspecial);
    }

    @Override
    public String toString() {
        return "Uchiha{" +
                "nome='" + nome + '\'' +
                ", habilidadeEspecial='" + habilidadeEspecial + '\'' +
                ", idade=" + idade +
                ", statusMissao='" + statusMissao + '\'' +
                '}';
    }
}
