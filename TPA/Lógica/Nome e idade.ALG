Algoritmo "semnome"
// Disciplina   : [Linguagem e Lógica de Programação]
// Professor   : Antonio Carlos Nicolodi 
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 15/03/2024
Var
// Seção de Declarações das variáveis 
nome: caractere
ano, nascimento, idade: inteiro

Inicio
// Seção de Comandos, procedimento, funções, operadores, etc... 
escreval("Qual seu nome?")
leia(nome)
escreval("Qual seu nascimento?")
leia(nascimento)
escreval("Em que ano estamos?")
leia(ano)
idade <- ano-nascimento
escreval("seu nome é ",nome," e você tem ",idade," anos de idade")

Fimalgoritmo