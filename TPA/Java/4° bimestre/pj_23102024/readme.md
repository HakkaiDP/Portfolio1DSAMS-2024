## Atividade Array em java

<hr>

## Exercicios Solicitados: 
1. Array armazenando 10 nomes e indexando em ordem crescente;
2. Array armazenando 20 nomes e indexando em ordem decrescente; 
3. Array armazenando 50 números e indexando em ordem crescente;
4. Array armazenando 50 números e indexando em ordem decrescente;
5. Array armazenando 100 números e indexando números pares;
6. Array armazenando 100 números e indexando números impares;
7. Array armazenado a tabela de classificação do campeonato brasileiro atual;

<hr>

## Explicação do Exercicio 1: 

* Importei a classe array que será utilizada para armazenar os dados das variáveis e exibir elas.
  
* Atribui 10 nomes para a váriavel nomes.

* Utilizei o comando "arrays.sort(nomes)" para coloca-los em ordem alfabética.

* E por fim com o código "System.out.println(Arrays.toString(nomes))" fareu com que sejam exibidos os 10 nomes em ordem alfabética.

<hr>
 
## Explicação do Exercício 2: 

* Importei as classes array e collections para conseguir armazenar e manipular os dados.

* Atribui 20 nomes para a váriavel nomes.

* Utilizei o comando "Arrays.sort(nomes, Collections.reverseOrder())" para coloca-los em ordem decrescente.

* E por fim com o código "System.out.println(Arrays.toString(nomes))" farei com que sejam exibidos os 20 nomes em ordem decrescente.

<hr>

 ## Explicação do Exercício 3:  

* Importei a classe array para armazenar os dados das variáveis, sua capacidade e exibir eles.

* Com o uso do código "int[] numeros = new int[50]" coloquei uma capacidade de armazenamento para a váriavel numeros.

* Logo após com o comando "for (int i = 0; i < 50; i++)" atribui o valor i=0 e fiz a verificação, onde, enquanto i<50 irá continuar adicionando números na váriavel.

* Com o comando "numeros[i] = (int) (Math.random() * 100)" eliminei qualquer número decimal e atribui números aleátorios de 0 à 99 para a váriavel numeros.

* Com o comando "Arrays.sort(numeros)" eu coloco os números sorteados em ordem crescente.

* E por fim com o comando "System.out.println(Arrays.toString(numeros))" farei com que sejam exibidos os 50 números em ordem crescente.

<hr>

## Explicação do Exercício 4: 

* Importei as classes array e collections para armazenamento e manipulação dos dados.

* Primeiro utilizo o comando "Integer[] numeros = new Integer[50];" coloco uma capacidade de armazenamento para a váriavel números.

* Logo após com o comando "for (int i = 0; i < 50; i++)" atribui o valor i=0 e fiz a verificação, onde, enquanto i<50 irá continuar adicionando números na váriavel.

* Com o comando "numeros[i] = (int) (Math.random() * 100)" eliminei qualquer número decimal e atribui números aleátorios de 0 à 99 para a váriavel numeros.

* Com o comando "Arrays.sort(numeros, Collections.reverseOrder())" organizo os números sorteados em ordem decrescente.

* E por fim com o comando "System.out.println(Arrays.toString(numeros))" farei com que sejam exibidos 50 números em ordem decrescente

<hr>

## Explicação do Exercício 5:

* Importei a classe array para armazenar os dados das váriaveis, sua capacidade e exibir eles.

* Utilizei o comando "int[] numspares = new int[100]" para atribuir a capacidade de armazenamento para a váriavel numspares.

* Logo após, com o comando "int num = 0" coloco o valor 0 na váriavel num.

* Com o comando "for (int i = 0; i < 100; i++)" eu preencho o array com 100 números e faço a verificação se já tem 100 números armazenados.

* Com o comando "numspares[i] = num" atribuo todos os valores de "num" para o indice do array numspares.

* Logo após utilizo o comando "num += 2" e como o valor de num é 0 todos os números que irão aparecer serão pares, já que este código soma 2 para os valores de "num".

* E por fim com o comando "System.out.println(Arrays.toString(numspares))" farei com que sejam exibidos os 100 números pares.

<hr>

## Explicação do Exercício 6: 

* Importei a classe array para armazenar os dados das váriaveis, sua capacidade e exibir eles.

* Utilizei o comando "int[] numsimpares = new int[100]" para atribuir a capacidade de armazenamento para a váriavel numspares.

* Logo após, com o comando "int num = 1" coloco o valor 1 na váriavel num.

* Com o comando "for (int i = 0; i < 100; i++)" eu preencho o array com 100 números e faço a verificação se já tem 100 números armazenados.

* Com o comando "numsimpares[i] = num" atribuo todos os valores de "num" para o indice do array numsimpares.

* Logo após utilizo o comando "num += 2" e como o valor de num é 1 todos os números que irão aparecer serão ímpares, já que este código soma 2 para os valores de "num".

* E por fim com o comando "System.out.println(Arrays.toString(numsimpares))" farei com que sejam exibidos os 100 números ímpares.

<hr>

## Explicação do Exercício 7: 

* Importei a classe array para armazenar os dados das váriaveis.

* Criei uma váriavel times e atribui os valores à ela.

* Com o comando "System.out.println("Tabela do Brasileirão: ")" farei com que seja exibido este texto.

* Logo após, com o comando "for(int i =0; i< times.length; i++)" farei com que o i passe por todos os elementos do array e não pare até que chegue a o ultimo item

* E por fim utilizando o código "System.out.println((i + 1) + "° " + times[i])" farei com que sejam exibidos todos os elementos do array junto com o sufixo ordinal ° para listar eles neste estilo: 1°, 2°, 3°...
