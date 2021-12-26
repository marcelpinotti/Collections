import java.util.List;
import java.util.Vector;

public class IniciandoVetor {

    public static void main(String[] args) {

        List<String> sports = new Vector<>();//Instanciar com o tipo primitivo <tipo>

        sports.add("Futebol"); //add -> adiciona a lista
        sports.add("Voleibol");
        sports.add("Handeibol");
        sports.add("Basquetebol");
        sports.add("Natação");
        sports.add("Atletismo");

        System.out.println(sports);

        sports.set(3, "Hipismo");//set -> alteraçãoo do elementos passando o index
        System.out.println(sports);

        sports.remove(4);// remove -> remove um elemento pelo index
        System.out.println(sports);

        sports.remove("Futebol");// remove -> remove o elemento
        System.out.println(sports);

        System.out.println(sports.get(3));// get -> retorna um elemento pelo index

        //Navegar pelas Collections
        // for each
        int cont = 0;
        int ind = -1;
        for (String esporte: sports) {
            cont++;
            ind++;
            System.out.println("INDEX " + ind +" ESPORTE " + cont + ": " + esporte);
        }

    }
}
