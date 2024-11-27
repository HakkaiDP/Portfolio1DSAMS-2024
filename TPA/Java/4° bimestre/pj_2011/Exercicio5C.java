/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pj_2011;

/**
 *
 * @author Hakkai
 */
public class Exercicio5C {
    public static void main(String[] args) {
        int altura = 4;
        char[][] matriz = new char[altura][altura];

        // Preenchendo a matriz para formar um triângulo
        for (int i = 0; i < altura; i++) {
            for (int j = 0; j <= i; j++) {
                matriz[i][j] = '*'; // Preenche a diagonal e a base
            }
        }

        // Exibindo a matriz
        exibirMatriz(matriz);
    }

    public static void exibirMatriz(char[][] matriz) {
        for (char[] linha : matriz) {
            for (char elemento : linha) {
                System.out.print(elemento + " "); // Adiciona um espaço entre os asteriscos
            }
            System.out.println();
        }
    }
}
