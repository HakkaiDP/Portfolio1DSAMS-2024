/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pj_2011;

/**
 *
 * @author Hakkai
 */
public class Exercicio5A {
    public static void main(String[] args) {
        
        //Declarando variáveis
        int tamanho = 4;
        char[][] matriz = new char[tamanho][tamanho];

        // Preenchendo a matriz com '*'
        for (int i = 0; i < tamanho; i++) {
            for (int j = 0; j < tamanho; j++) {
                matriz[i][j] = '*';
            }
        }

        // Exibindo a matriz
        exibirMatriz(matriz);
    }
    public static void exibirMatriz(char[][] matriz) {
        for (char[] linha : matriz) {
            for (char elemento : linha) {
                System.out.print(elemento + " ");
            }
            System.out.println();
        }
    }
}
