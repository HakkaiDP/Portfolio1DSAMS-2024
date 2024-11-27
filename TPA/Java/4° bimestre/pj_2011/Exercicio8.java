/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pj_2011;

import javax.swing.JOptionPane;

/**
 *
 * @author Hakkai
 */
public class Exercicio8 {
    public static void main(String[] args) {
        // Inicializa a matriz 2x5 com valores inteiros
        int[][] mat = {{1, 42, 23, 14, 51}, {22, 32, 55, 54, 12}};
        int x, y;

        // Exibe uma mensagem informando que os elementos pares da matriz serão exibidos
        JOptionPane.showMessageDialog(null, "***** Exibindo apenas os elementos pares da matriz ****");

        // Loop para percorrer as linhas da matriz
        for (x = 0; x < 2; x++) {
            // Loop para percorrer as colunas da matriz
            for (y = 0; y < 5; y++) {
                // Verifica se o elemento atual é par
                if (mat[x][y] % 2 == 0) {
                    // Se o elemento for par, imprime o elemento
                    System.out.print(mat[x][y] + " ");
                } else {
                    // Se o elemento não for par, imprime um traço
                    System.out.print(" - ");
                }
            }
            // Imprime uma nova linha após cada linha da matriz
            System.out.print("\n");
        }
    }
}