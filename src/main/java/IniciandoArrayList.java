import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class IniciandoArrayList {

    public static void main(String[] args) {

        List<String> nomes = new ArrayList<>();//Instanciar com o tipo primitivo <tipo>

        nomes.add("Marcel"); //add -> adiciona a lista
        nomes.add("Viviane");
        nomes.add("Marry");
        nomes.add("Fuba");
        nomes.add("Dino");
        nomes.add("Bilu");
        nomes.add("Mia");
        nomes.add("Clark");
        System.out.println(nomes);

        Collections.sort(nomes);//Collections.sort -> Colocar em ordem alfabética
        System.out.println(nomes);

        nomes.set(3, "Bob");//set -> alteraçãoo do elementos passando o index
        System.out.println(nomes);

        nomes.remove(3);// remove -> remove um elemento pelo index
        System.out.println(nomes);

        nomes.remove("Marcel"); // remove -> remove o elemento
        System.out.println(nomes);

        String nome = nomes.get(3); // get -> retorna um elemento pelo index
        System.out.println(nome);

        int tamanho = nomes.size(); // size -> retorna o tamanho de uma ArrayList
        System.out.println(tamanho);

        boolean nomeTem = nomes.contains("Mia");// contains -> retorna um booleano se existe ou não o elemento na lista
        System.out.println(nomeTem);

        //nomes.clear(); clear -> limpa a lista
        boolean listaVazia = nomes.isEmpty();// isEmpty -> retorna um booleano se a lista esté ou não vazia
        System.out.println(listaVazia);

        int posicao = nomes.indexOf("Viviane");// indexOF -> retorna o index do elemento (quando não encontra retorna -1)
        System.out.println(posicao);

        //Navegar pelas Collections
        // for each
        int cont = 0;
        int ind = -1;
        for (String nomeDoItem : nomes) {
            cont++;
            ind++;
            System.out.println("INDEX " + ind + " NOME " + cont + " : " + nomeDoItem);
        }

        Iterator<String> iterator = nomes.iterator();
        while (iterator.hasNext()) {// hasNext -> retorna um true sempre que houver mais um elemento na lista
            System.out.print(iterator.hasNext() + "--> ");
            System.out.println(iterator.next());// next -> retorna o elemento que está sendo itaradp no momento
        }
    }
}
