import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class IniciandoComparableComparators {

    public static void main(String[] args) {

        List<Estudante> estudantes = new ArrayList<>();

        estudantes.add(new Estudante("Pedro", 19));
        estudantes.add(new Estudante("Carlos", 23));
        estudantes.add(new Estudante("Mariana", 21));
        estudantes.add(new Estudante("João", 18));
        estudantes.add(new Estudante("Thiago", 20));
        estudantes.add(new Estudante("George", 22));
        estudantes.add(new Estudante("Larissa", 21));

        System.out.println(estudantes); // --> ordem que foram inseridos os objetos

        estudantes.sort((first, second) -> first.getIdade() - second.getIdade()); // Lambda
        System.out.println(estudantes); // --> ordem natural dos números

        estudantes.sort((first, second) -> second.getIdade() - first.getIdade()); // Lambda
        System.out.println(estudantes); // --> ordem reversa dos números

        estudantes.sort(Comparator.comparingInt(Estudante::getIdade)); // método reference
        System.out.println(estudantes); // --> ordem natural dos números

        estudantes.sort(Comparator.comparingInt(Estudante::getIdade).reversed()); // método reference
        System.out.println(estudantes); // --> ordem reversa dos números

        Collections.sort(estudantes);  // interface Comparable

        System.out.println(estudantes); // --> ordem natural dos números

        Collections.sort(estudantes, new Estudante()); // interface Comparator

        System.out.println(estudantes); // --> ordem reversa dos números

    }
}
