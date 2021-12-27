# Collections

***Collections*** é um conjunto bem definido de interfaces e classes para representar e tratar grupos de dados como uma única unidade, que pode ser chamada coleção, ou collection. 

## Elementos das Collections

**- Interfaces:** tipos abstratos que representam as coleções;

**- Implementações:** são as implementações concretas das interfaces;

**- Algoritmos:** são os métodos que realizam as operações sobre os objetos das coleções, tais como busca e ordenação.

![Hierarquia de interfaces e classes da Java Collections Framework](https://arquivo.devmedia.com.br/REVISTAS/easyjava/imagens/1/4/image001.jpg)

Figura: Hierarquia de interfaces e classes da Java Collections Framework

## Interfaces

### Collection
  - Não existe implementação direta dessa interface. Define as operações básicas para as coleções, como adicionar, remover, esvaziar, etc.;

### Set
  - Define uma coleção que não permite elementos duplicados.
  - **SortedSet:** Estende Set, possibilita a classificação natural dos elementos, tal como a ordem alfabética;
  
  - Implementações:
  
  **- HashSet:** Acesso aos dados é mais rápido que em um TreeSet.
        
    - Não é garantido que os dados estarão ordenados;
        
    - Utilizado quando a solução exigir elementos únicos e a ordem não for importante.
  
  **- TreeSet:** Os dados são classificados, mas o acesso é mais lento que em um HashSet.
  
    - Os elementos não são duplicados;
  
    - Acesso aos elementos em ordem natural.
  
  **- LinkedHashSet:** Derivada de HashSet.
  
    - Mantém uma lista duplamente ligada através de seus itens;
  
    - Seus elementos são iterados na ordem em que foram inseridos;
  
    - É possível criar um LinkedHashSet que seja percorrido na ordem em que os elementos foram acessados na última iteração.

### List
  - Define uma coleção ordenada, podendo conter elementos duplicados. Existe o controle total sobre a posição onde cada elemento é inserido e pode recuperá-los através de seus índices;
  
  - Implementações:
  
  **- ArrayList:** É como um array cujo tamanho pode crescer. 
    
       - A busca de um elemento é rápida;
    
       - As inserções e exclusões não são rápidas;
        
       - Utilizada na implementação quando se deseja acesso mais rápido aos elementos.
       
  **- LinkedList:** Implementa uma lista ligada, ou seja, cada nó contém o dado e uma referência para o próximo nó.
    
       - A busca é linear;
        
       - As inserções e exclusões são rápidas.
        
       - Utilizada quando a aplicação exigir uma grande quantidade de inserções e exclusões.
      
### Queue
  - Tipo de coleção para manter uma lista de prioridades, onde a ordem dos seus elementos, definida pela implementação de Comparable ou Comparator, determina essa prioridade. Com a interface pode-se criar filas e pilhas;
  
   - Implementações:
    
   **- LinkedList:** Implementa uma lista ligada, ou seja, cada nó contém o dado e uma referência para o próximo nó.
    
      - A busca é linear;
        
      - As inserções e exclusões são rápidas.
        
      - Utilizada quando a aplicação exigir uma grande quantidade de inserções e exclusões.

### Map
  - Mapeia chaves para valores. Cada elemento tem dois objetos: uma chave e um valor. Valores podem ser duplicados, mas chaves não. 
  
  - **SortedMap:** Estende Map, e permite classificação ascendente das chaves. Uma aplicação dessa interface é a classe Properties, que é usada para persistir propriedades/configurações de um sistema.
  
  - Implementações:
  
  **- HashMap:** Baseada em tabela de espalhamento, permite chaves e valores null. 
  
    - Não existe garantia que os dados ficarão ordenados;
  
    - Utilizada como implementação se a ordenação não for importante e desejar uma estrutura onde seja necessário um ID-identificador.
  
  **- TreeMap:** Implementa a interface SortedMap. 
  
    - Classificado em ordem ascendente das chaves; 
  
    - Permite especificar uma ordem diferente;
      
    - Implementação para um Map ordenado. Aplicação semelhante a HashMap;
  
    - Perde no quesito desempenho.
  
  **- LinkedHashMap:** antém uma lista duplamente ligada através de seus itens. 
  
    - A ordem de iteração é a ordem em que as chaves são inseridas;
    
    
### Link de referência

Fonte: [DevMedia](https://www.devmedia.com.br/java-collections-como-utilizar-collections/18450)
  
  
