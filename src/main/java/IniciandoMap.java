import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class IniciandoMap {

    public static void main(String[] args) {

        System.out.println("_-_-_- HASHMAP -_-_-_");
        System.out.println(" ");

        Map<String, Integer> campeoesMundiaisFifa = new HashMap<>();

        campeoesMundiaisFifa.put("Brasil", 5); // put -> adiciona chave e valor
        campeoesMundiaisFifa.put("Alemanha", 4);
        campeoesMundiaisFifa.put("Italia", 4);
        campeoesMundiaisFifa.put("Uruguai", 2);
        campeoesMundiaisFifa.put("Argentina", 2);
        campeoesMundiaisFifa.put("França", 2);
        campeoesMundiaisFifa.put("Inglaterra", 1);
        campeoesMundiaisFifa.put("Espanha", 1);
        campeoesMundiaisFifa.put("Japao", null);

        System.out.println(campeoesMundiaisFifa);

        campeoesMundiaisFifa.put("Brasil", 6); // put -> atualiza o valor

        System.out.println(campeoesMundiaisFifa);

        System.out.println(campeoesMundiaisFifa.get("França")); // get -> retorna o valor

        System.out.println(campeoesMundiaisFifa.containsKey("Argentina")); // containsKey -> retorna true ou false para a chava

        System.out.println(campeoesMundiaisFifa.remove("França")); // remove -> remove a chave

        System.out.println(campeoesMundiaisFifa);

        System.out.println(campeoesMundiaisFifa.containsValue(6)); // containsValue -> retorna true ou false para o valor

        System.out.println(campeoesMundiaisFifa);

        System.out.println(campeoesMundiaisFifa.size()); // size -> retorna o tamanho da Map

        for (Map.Entry<String, Integer> campeoes: campeoesMundiaisFifa.entrySet()) {
            System.out.println(campeoes.getKey() + " -> " + campeoes.getValue());
        }

        for (String chave : campeoesMundiaisFifa.keySet()) {
            System.out.println(chave + " __ " + campeoesMundiaisFifa.get(chave));
        }

        System.out.println(campeoesMundiaisFifa);

        campeoesMundiaisFifa.clear();

        System.out.println(campeoesMundiaisFifa.size());

        System.out.println("-_-_-_ TREEMAP _-_-_-");
        System.out.println(" ");

        TreeMap<String, String> capitais = new TreeMap<>();

        capitais.put("RS", "Porto Alegre");
        capitais.put("SC", "Florianópolis");
        capitais.put("PR", "Curitiba");
        capitais.put("SP", "São Paulo");
        capitais.put("RJ", "Rio de Janeiro");
        capitais.put("MG", "Belo Horizonte");

        System.out.println(capitais);

        System.out.println(capitais.firstKey()); // firstKey -> primeiro elemento da árvore

        System.out.println(capitais.lastKey()); // lastKey -> último elemnto da árvore

        System.out.println(capitais.lowerKey("PR")); // lowerKey -> retorna o elemento abaixo do elemento parametrizado

        System.out.println(capitais.higherKey("PR")); // higherKey -> retorna o elemento acima do elemnto parametrizado

        System.out.println(capitais);

        System.out.println(capitais.firstEntry().getKey() + " --> " + capitais.firstEntry().getValue()); // firstEntry -> primeira chave e elemento da árvore

        System.out.println(capitais.lastEntry().getKey() + " __ " + capitais.lastEntry().getValue()); // lastEntry -> última chave e elemento da árvore

        System.out.println(capitais.higherEntry("SC").getKey() + " __ " + capitais.higherEntry("SC").getValue()); // higherEntry -> retorna a chave e o elemento acima do elemento parametrizado

        System.out.println(capitais.lowerEntry("SC").getKey() + " --> " + capitais.lowerEntry("SC").getValue()); // lowerEntry -> retorna a chave e o elemento abaixo do elemento parametrizado

        Map.Entry<String, String> firstEntry = capitais.pollFirstEntry();

        Map.Entry<String, String> lastEntry = capitais.pollLastEntry();

        System.out.println(firstEntry.getKey() + " --> " + firstEntry.getValue()); // firstEntry -> primeira chave e elemento da úrvore

        System.out.println(lastEntry.getKey() + " __ " + lastEntry.getValue()); // lastEntry -> última chave e elemento da árvore

        System.out.println(capitais);


    }
}
