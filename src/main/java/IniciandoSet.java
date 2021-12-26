import java.util.*;

public class IniciandoSet {

    public static void main(String[] args) {

        System.out.println("-_-_-_HashSet_-_-_-");
        System.out.println("");

        Set<Double> notasAlunos = new HashSet<>();

        notasAlunos.add(5.0);
        notasAlunos.add(8.5);
        notasAlunos.add(10.0);
        notasAlunos.add(4.0);
        notasAlunos.add(7.3);
        notasAlunos.add(3.0);
        notasAlunos.add(9.3);

        System.out.println(notasAlunos);

        notasAlunos.remove(4.0);

        System.out.println(notasAlunos);

        System.out.println(notasAlunos.size());

        Iterator<Double> interator = notasAlunos.iterator();
        while (interator.hasNext()) {
            System.out.println(interator.next());
        }

        for (Double nota : notasAlunos) {
            System.out.println(nota);
        }

        notasAlunos.clear();

        System.out.println(notasAlunos.isEmpty());

        System.out.println(" ");
        System.out.println("-_-_-_LinkedHashSet_-_-_-");
        System.out.println(" ");

        Set<Double> notasAlunos1 = new LinkedHashSet<>();

        notasAlunos1.add(5.0);
        notasAlunos1.add(8.5);
        notasAlunos1.add(10.0);
        notasAlunos1.add(4.0);
        notasAlunos1.add(7.3);
        notasAlunos1.add(3.0);
        notasAlunos1.add(9.3);

        System.out.println(notasAlunos1);

        notasAlunos1.remove(4.0);

        System.out.println(notasAlunos1);

        System.out.println(notasAlunos1.size());

        Iterator<Double> interatorUm = notasAlunos1.iterator();
        while (interatorUm.hasNext()) {
            System.out.println(interatorUm.next());
        }

        for (Double nota : notasAlunos1) {
            System.out.println(nota);
        }

        notasAlunos1.clear();

        System.out.println(notasAlunos1.isEmpty());

        System.out.println(" ");
        System.out.println("-_-_-_TreeSet_-_-_-");
        System.out.println(" ");

        TreeSet<String> nomesCapitais = new TreeSet<>();

        nomesCapitais.add("Porto Alegre");
        nomesCapitais.add("Florianópolis");
        nomesCapitais.add("Curitiba");
        nomesCapitais.add("São Paulo");
        nomesCapitais.add("Rio de Janeiro");
        nomesCapitais.add("Belo Horizonte");

        System.out.println(nomesCapitais);

        System.out.println(nomesCapitais.first()); // first -> retorna o primeiro elemento da árvore, ou seja o último a ser inserido

        System.out.println(nomesCapitais.last()); // last -> retorna o último elemento da árvore

        System.out.println(nomesCapitais.lower("Porto Alegre")); // lower -> retorna o elemento que está abaixo do elemnto parametrizado

        System.out.println(nomesCapitais.higher("Porto Alegre")); // higher -> retorna o elemento que está acima do elemnto parametrizado

        System.out.println(nomesCapitais);

        System.out.println(nomesCapitais.pollFirst()); // first -> retorna e remove o primeiro elemento da árvore, ou seja o último a ser inserido

        System.out.println(nomesCapitais.pollLast()); // last -> retorna e remove o último elemento da árvore.

        System.out.println(nomesCapitais);

        Iterator<String> interatorDois = nomesCapitais.iterator();
        while (interatorDois.hasNext()) {
            System.out.println(interatorDois.next());
        }

        for (String capital : nomesCapitais) {
            System.out.println(capital);
        }

        System.out.println(nomesCapitais.isEmpty());

        nomesCapitais.add("Rio Grande do Sul");

        System.out.println(nomesCapitais);

    }
}
