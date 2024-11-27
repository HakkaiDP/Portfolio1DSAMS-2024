/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pj_2011;

import java.util.Scanner;

/**
 *
 * @author Hakkai
 */
import java.util.Scanner;

public class Exercicio9 {
    public static void main(String[] args) {
        // Inicializa o tabuleiro como uma matriz 3x3 preenchida com espaços
        char[][] tabuleiro = {{' ', ' ', ' '}, {' ', ' ', ' '}, {' ', ' ', ' '}};
        
        // Define o jogador atual e se o jogo está em andamento
        char jogadorAtual = 'X';
        boolean jogoEmAndamento = true;
        int jogadas = 0; // Contador de jogadas realizadas

        // Cria um scanner para a entrada do usuário
        Scanner sc = new Scanner(System.in);

        // Loop principal do jogo que continua enquanto o jogo está em andamento
        while (jogoEmAndamento) {
            // Exibe o tabuleiro atual
            exibirTabuleiro(tabuleiro);
            System.out.println("Jogador " + jogadorAtual + ", faça sua jogada (linha e coluna de 0 a 2): ");
            
            // Lê a entrada do jogador para linha e coluna
            int linha = sc.nextInt();
            int coluna = sc.nextInt();

            // Verifica se a jogada é válida
            if (linha < 0 || linha > 2 || coluna < 0 || coluna > 2 || tabuleiro[linha][coluna] != ' ') {
                System.out.println("Jogada inválida, tente novamente.");
                continue; // Se inválida, repete o loop
            }

            // Atualiza o tabuleiro com a jogada do jogador atual
            tabuleiro[linha][coluna] = jogadorAtual;
            jogadas++; // Incrementa o contador de jogadas

            // Verifica se o jogador atual venceu
            if (verificarVencedor(tabuleiro, jogadorAtual)) {
                exibirTabuleiro(tabuleiro);
                System.out.println("Jogador " + jogadorAtual + " venceu!");
                jogoEmAndamento = false; // Termina o jogo
            } else if (jogadas == 9) { // Verifica se o jogo terminou em empate
                exibirTabuleiro(tabuleiro);
                System.out.println("Empate!");
                jogoEmAndamento = false; // Termina o jogo
            } else {
                // Alterna entre os jogadores
                jogadorAtual = (jogadorAtual == 'X') ? 'O' : 'X';
            }
        }

        // Fecha o scanner após o término do jogo
        sc.close();
    }

    // Método para exibir o tabuleiro no console
    public static void exibirTabuleiro(char[][] tabuleiro) {
        System.out.println("Tabuleiro:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                // Imprime cada espaço do tabuleiro
                System.out.print(" " + tabuleiro[i][j] + " ");
                if (j < 2) System.out.print("|"); // Adiciona separadores entre colunas
            }
            System.out.println(); // Nova linha após cada linha do tabuleiro
            if (i < 2) System.out.println("---|---|---"); // Adiciona separadores entre linhas
        }
    }

    // Método para verificar se um jogador venceu
    public static boolean verificarVencedor(char[][] tabuleiro, char jogador) {
        // Verifica linhas e colunas para uma combinação vencedora
        for (int i = 0; i < 3; i++) {
            if ((tabuleiro[i][0] == jogador && tabuleiro[i][1] == jogador && tabuleiro[i][2] == jogador) ||
                (tabuleiro[0][i] == jogador && tabuleiro[1][i] == jogador && tabuleiro[2][i] == jogador)) {
                return true; // Retorna verdadeiro se houver um vencedor
            }
        }
        // Verifica as diagonais para uma combinação vencedora
        if ((tabuleiro[0][0] == jogador && tabuleiro[1][1] == jogador && tabuleiro[2][2] == jogador) ||
            (tabuleiro[0][2] == jogador && tabuleiro[1][1] == jogador && tabuleiro[2][0] == jogador)) {
            return true; // Retorna verdadeiro se houver um vencedor
        }
        return false; // Retorna falso se não houver vencedor
    }
}