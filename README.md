# Studies in Java

> Repository resposible to keep my studies and notes about Java and Spring Framework.

O Hibernate é um framework de mapeamento objeto-relacional (ORM) para a linguagem de programação Java. Ele fornece uma solução para o mapeamento de objetos Java para tabelas em bancos de dados relacionais e vice-versa. Isso significa que, em vez de escrever consultas SQL diretamente, você pode manipular objetos Java e deixar o Hibernate cuidar da persistência dos dados no banco de dados.
O Hibernate simplifica o desenvolvimento de aplicativos Java que interagem com bancos de dados, oferecendo uma abstração de alto nível sobre o acesso a dados. Ele gerencia automaticamente o mapeamento entre as classes Java e as tabelas do banco de dados, facilitando a manutenção e evolução do código.

Porém, quando utilizamos o Spring Data JPA, automaticamente implementamos/usamos o Hibernate

- Spring Data JPA: O Spring Data JPA é um projeto dentro do ecossistema Spring que simplifica o acesso a dados em aplicativos Java baseados em Spring. Ele oferece uma abstração sobre a camada de persistência e facilita o desenvolvimento de repositórios de dados.

- Hibernate: O Hibernate é frequentemente escolhido como a implementação padrão do JPA (Java Persistence API), que é uma especificação para o mapeamento objeto-relacional em Java. O JPA define uma API padrão para interagir com bancos de dados relacionais usando objetos Java

## Query no JPA

```
@Query("SELECT p FROM Pessoa p JOIN p.endereco e WHERE e.cidade = :cidade")
List<Pessoa> findByCidade(@Param("cidade") String cidade);
```

## DTO / Entity
- DTO - Data Transfer Object: Responsavel pela transferencia de dados
- Entity - Responsavel pela persistencia dos dados no BD. 

Enquanto o DTO é utilizado para agilizar os dados e o sistema, a entidade é mais lenta. No caso do DTO, não sou obrigado ter todos os atributos, enquanto a entidade sim.


## Alguns métodos para listas

stream (api - introduzida no Java 8) - posso encadear operações em uma coleção de objetos, criando uma cadeia de funções que serão executadas em ordem. <br>
.map - apenas mapeio, pego o elemento e posso fazer o que quiser com ele - ex.: .map(numero -> numero *2)<br>
.filter(nome -> startsWith(nome))<br>
.reduce - combinação de dois elementos<br>
.collect() - converter em alguma coisa - ex.: .collect(Collectors.toList())<br>
em dentro desses metodos posso usar os metodos já existentes, por exemplo o get<br>
.map(Pessoa::getNome)<br>
.collect(Collectors.toList()); // .collect(Collectors.groupingBy(Pessoa::getIdade));<br>


## Listas em Java

Coleções: ArrayList, LinkedList, HashMap, TreeSet<br>
Interfaces: Set, List, Map<br>
```
List<String> array = new ArrayList<>();
````
 - acesso rapido - muita leitura e pouca escrita - não é sincronizada

```
List<String> list = new LinkedList<>();
```
LinkedList - lista duplamente encadeada - otimo para inserção e remoção. - Ruins para acesso aleatório.

Map -  INTERFACE que mapeia chaves para valores<br>
Fornece métodos para inserir(put), remover(remove) e recuperar(get - retorna o valor de acordo com a chave) elementos com base em chaves. .containsKey()<br>
As implementações comuns incluem HashMap, TreeMap, LinkedHashMap, etc.<br>

```
Map<Chave, Valor> nome = new HashMap<>();
```
Permite a recuperação rápida de valores com base em chaves.<br>
Não garante a ordem dos elementos.<br>

Set - Interface que representa um conjunto de elementos únicos.<br>
Não permite elementos duplicados.<br>
As implementações comuns incluem HashSet, TreeSet, LinkedHashSet, etc<br>
