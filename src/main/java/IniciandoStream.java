import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class IniciandoStream {

    public static void main(String[] args) {

        //stream -> muito utilizado quando está há grandes coleções e necessita de performance, pois a velocidade de busca e a iteração são mais rápidas.

        List<String> nomes = new ArrayList<>();

        nomes.add("Marcel");
        nomes.add("Viviane");
        nomes.add("Marry");
        nomes.add("Fuba");
        nomes.add("Dino");
        nomes.add("Bilu");
        nomes.add("Mia");
        nomes.add("Clark");

        System.out.println(nomes);

        System.out.println(nomes.stream().count());

        System.out.println("Maior nome por número de letras: " + nomes.stream().max(Comparator.comparingInt(String::length)));

        System.out.println("Menor nome por número de letras: " + nomes.stream().min(Comparator.comparingInt(String::length)));

        System.out.println("Nome que tem a letra a: " + nomes.stream().filter((nome) -> nome.toLowerCase().contains("a")).collect(Collectors.toList()));

        System.out.println("Nome que tem a letra M: " + nomes.stream().filter((nome) -> nome.toUpperCase().contains("M")).collect(Collectors.toList()));

        System.out.println("Retorna uma nova coleção com a quantidade de letras: " + nomes.stream().map(nome -> nome.concat(" - ").concat(String.valueOf(nome.length()))).collect(Collectors.toList()));

        System.out.println("Retorna os 3 primeiros elementos: " + nomes.stream().limit(3).collect(Collectors.toList()));

        System.out.println("Retorna os elementos: " + nomes.stream().peek(System.out::println).collect(Collectors.toList()));

        System.out.println("--- Retorna os elemntos usando forEach: ");
        nomes.stream().forEach(System.out::println);

        System.out.println("Todos os nomes te a letra 'D'? " + nomes.stream().allMatch((letra) -> letra.contains("D")));

        System.out.println("Existe algum nome com a letra 'o'? " + nomes.stream().anyMatch((letra) -> letra.contains("o")));

        System.out.println("Não tem nenhum nome com a letra 'a'? " + nomes.stream().noneMatch((letra) -> letra.contains("a")));

        System.out.print("--- Retorna o primeiro elemento da coleção: ");
        nomes.stream().findFirst().ifPresent(System.out::println);

        System.out.println("Exemplo de Operação Encadeada");
        System.out.println(nomes.stream()
                .peek(System.out::println)
                .map(nome -> nome.concat(" - ").concat(String.valueOf(nome.length())))
                .peek(System.out::println)
                .filter((nome) -> nome.toLowerCase().contains("a"))
                //.collect(Collectors.toList()));
                //.collect(Collectors.joining(", "))); // Transforma em String.
                //.collect(Collectors.toSet()));
                .collect(Collectors.groupingBy(nome -> nome.substring(nome.indexOf("-") + 1)))); //SQL agrupa os elementos iguais depois do "-".

    }
}
