import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;


public class IniciandoLinkedListQueue {


    public static void main(String[] args) {

        Queue<String> filaDeBanco = new LinkedList<>();

        filaDeBanco.add("Marcel");
        filaDeBanco.add("Viviane");
        filaDeBanco.add("Marry");
        filaDeBanco.add("Bilu");
        filaDeBanco.add("Clark");
        filaDeBanco.add("Mia");
        filaDeBanco.add("Dino");
        filaDeBanco.add("Fuba");

        System.out.println(filaDeBanco);


        String clienteAtender = filaDeBanco.poll();// poll -> mostra o primeiro elemento da fila e remove;

        System.out.println(clienteAtender);

        System.out.println(filaDeBanco);


        String clientePrimeiro = filaDeBanco.peek(); // peek -> mostra o primeiro eemento da fila mas não remove

        System.out.println(clientePrimeiro);

        System.out.println(filaDeBanco);


        //Queue<String> filaDeBancoErro = new LinkedList<>();

        //String clienteErro = filaDeBancoErro.element(); // element -> chama uma exceção caso a fila esteja vazia.

        //System.out.println(clienteErro);


        for(String fila : filaDeBanco) {
            System.out.print(fila + " ");

        }

        Iterator<String> iteratorFilaDeBanco = filaDeBanco.iterator();

        while(iteratorFilaDeBanco.hasNext()) {
            System.out.println("---> " + iteratorFilaDeBanco.next());
        }

        System.out.println(filaDeBanco.size());

        System.out.println(filaDeBanco.isEmpty());

        filaDeBanco.add("Lucas");

        System.out.println(filaDeBanco);

    }

}

