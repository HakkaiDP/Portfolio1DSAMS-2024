Algoritmo "semnome"
// Disciplina   : [Linguagem e Lógica de Programação]
// Professor   : Antonio Carlos Nicolodi 
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 10/04/2024
Var
// Seção de Declarações das variáveis 
ValorDia, ValorKm, KmPercorridos, DiasPassados, ValorTotal: real

Inicio
// Seção de Comandos, procedimento, funções, operadores, etc... 
ValorDIa <- 90
ValorKm <- 20/100
escreval("Quantos quilometros foram percorridos pelo carro?")
leia(KmPercorridos)
escreval("Quantos dias você ficou com o carro alugado?")
leia(DiasPassados)
ValorTotal <- (DiasPassados*ValorDia + KmPercorridos*ValorKm)
escreval("Você irá pagar ao todo", ValorTotal)

Fimalgoritmo