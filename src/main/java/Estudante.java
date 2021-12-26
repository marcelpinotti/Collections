import java.util.Comparator;

public class Estudante implements Comparable<Estudante>, Comparator<Estudante> {

    private String nome;
    private Integer idade;

    public Estudante (String nome, Integer idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public Estudante() {}

    public String getNome() {
        return this.nome;
    }

    public Integer getIdade() {
        return this.idade;
    }

    @Override
    public String toString() {
        return getNome() + " " + getIdade();
    }


    @Override
    public int compareTo(Estudante estudante) {
        return this.getIdade() - estudante.getIdade() ;
    }

    @Override
    public int compare(Estudante estudante1, Estudante estudante2) { // ordem reversa
        return estudante2.getIdade() - estudante1.getIdade();
    }
}
