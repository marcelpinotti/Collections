# Stream

- É um recurso, que entrou a partir do Java 8, que facilita o desenvolvimento, reduz o tamanho do código e simplifica o uso do paralelismo.

- O recurso trouxe novas classes e métodos que ajudam a manipular coleções de maneira mais simples e eficiente, lançando mão do estilo da programação funcional.

- Combinada com as expressões lambda, ela proporciona uma forma diferente de lidar com conjuntos de elementos, oferecendo ao desenvolvedor uma maneira simples e concisa de escrever código que resulta em facilidade de manutenção e paralelização sem efeitos indesejados em tempo de execução.
  - Obs: para o uso da paralelização, basta trocar o método ***stream()*** pelo método ***parallelStream()***. Será decomposta as ações em várias subtarefas, e as operações serão processadas em paralelo.

- A proposta é fazer com que o desenvolvedor não se preocupe mais com a forma de se programar o comportamento, deixando a parte relacionada ao controle de fluxo e loop a cargo da API.

- É uma poderosa solução para processar coleções de maneira declarativa, ao invés da tradicional forma imperativa.

## Características de uma Stream 

Uma Stream pode ser definida como uma **sequência de elementos de uma fonte de dados que oferece suporte a diferentes tipos de operações de agregação**. 

- ***Sequência de elementos:*** Uma stream provê uma interface para um conjunto sequencial de valores de um determinado tipo. Contudo, streams não armazenam elementos. Eles são processados sob demanda;
- ***Fonte de dados:*** Streams consomem dados de uma fonte, como coleções, arrays ou mesmo recursos de E/S (entrada e saída);
- ***Operações de agregação:*** Streams suportam operações comuns a linguagens de programação funcionais, como filtrar, modificar, transformar o elemento em outro e assim por diante. Essas operações podem ser realizadas em série ou em paralelo.

### Link de referência

Fonte: [Oracle](https://www.oracle.com/br/technical-resources/articles/java-stream-api.html)
