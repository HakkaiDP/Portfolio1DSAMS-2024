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
public class Exercicio6 {
    public static void main(String[] args) {
        
        // Definindo constantes para o número de linhas e colunas da matriz
        final int N_Lin = 3, N_Col = 3; 
        int[][] mat = new int[N_Lin][N_Col]; // Inicializa a matriz com as dimensões definidas
        int l, c; // Variáveis para iteração nas linhas e colunas

        // Exibe uma mensagem informativa para o usuário
        JOptionPane.showMessageDialog(null, "****** Cadastrando dados na matriz ******\nEntre com o valor em cada posição da matriz");

        // Loop para atribuir valores à matriz
        for (l = 0; l < N_Lin; l++) { // Percorre cada linha
            for (c = 0; c < N_Col; c++) { // Percorre cada coluna
                // Solicita ao usuário que insira um valor para a posição atual na matriz
                mat[l][c] = Integer.parseInt(JOptionPane.showInputDialog("Valor linha " + (l + 1) + " coluna " + (c + 1) + " ::"));
            }
        }

        // Exibe uma mensagem informativa para mostrar que os dados da matriz serão exibidos
        JOptionPane.showMessageDialog(null, "****** Exibindo os dados da matriz ******");

        // Loop para exibir os valores armazenados na matriz
        for (l = 0; l < N_Lin; l++) { // Percorre cada linha
            for (c = 0; c < N_Col; c++) { // Percorre cada coluna
                // Imprime o valor atual da matriz seguido de uma tabulação
                System.out.print(mat[l][c] + "\t");
            }
            // Imprime uma nova linha após cada linha da matriz para melhor organização
            System.out.println();
        }
    }
}
