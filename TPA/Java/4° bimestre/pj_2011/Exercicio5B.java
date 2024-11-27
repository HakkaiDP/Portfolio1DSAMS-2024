/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pj_2011;

/**
 *
 * @author Hakkai
 */
public class Exercicio5B {
    public static void main(String[] args) {
        int linhas = 4;
        int colunas = 10;
        char[][] matriz = new char[linhas][colunas];

        // Preenchendo a matriz para formar um retângulo
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                // Preenchendo a borda do retângulo
                if (i == 0 || i == linhas - 1 || j == 0 || j == colunas - 1) {
                    matriz[i][j] = '*';
                } else {
                    matriz[i][j] = ' ';
                }
            }
        }

        // Exibindo a matriz
        exibirMatriz(matriz);
    }

    public static void exibirMatriz(char[][] matriz) {
        for (char[] linha : matriz) {
            for (char elemento : linha) {
                System.out.print(elemento);
            }
            System.out.println();
        }
    }
}    
