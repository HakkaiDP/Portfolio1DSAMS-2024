Algoritmo "1° algorimito"
// Disciplina   : [Linguagem e Lógica de Programação]
// Professor   : Antonio Carlos Nicolodi
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 25/03/2024
Var
// Seção de Declarações das variáveis
altura, raio, p: real
alateral, abase, atotal: real
litros, latas, custo: real

Inicio
// Seção de Comandos, procedimento, funções, operadores, etc...
p <- 3,14
escreval("digite a altura")
leia(altura)
escreval("digite o raio")
leia(raio)
alateral <- 2*p*raio**2*altura
abase <- 2*(p*raio**2)
atotal <- alateral+abase
litros <- atotal/3
latas <- litros/5
custo <- latas*100
escreval("a quantidade de latas de tinta para pintar o cilíndro é", latas)
escreval("o custo para pintar o cilindro é:",custo)
Fimalgoritmo