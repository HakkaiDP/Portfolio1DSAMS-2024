/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pj_2011;
import java.util.HashSet;
import javax.swing.JOptionPane;

/**
 *
 * @author Hakkai
 */
public class Exercicio3 {
    public static void main(String[] args) {
        //Declarando variáveis
        final int LINHAS = 3;
        final int COLUNAS = 5;
        int[][] matriz = new int[LINHAS][COLUNAS];
        HashSet<Integer> elementos = new HashSet<>();
        int pares = 0;
        int impares = 0;

        //Preenchendo a matriz
        for (int i = 0; i < LINHAS; i++) {
            for (int j = 0; j < COLUNAS; j++) {
                String entrada = JOptionPane.showInputDialog("Digite o valor para a posição [" + i + "][" + j + "]");
                matriz[i][j] = Integer.parseInt(entrada);
                elementos.add(matriz[i][j]);

                // Contando pares e ímpares
                if (matriz[i][j] % 2 == 0) {
                    pares++;
                } else {
                    impares++;
                }
            }
        }
        //Verificando elementos repetidos
        boolean repetidos = (elementos.size() < LINHAS * COLUNAS);
        //Exibindo os Resultados
        String resultado = "A matriz possui elementos repetidos: " + repetidos + "\n" +
                           "Quantidade de números pares: " + pares + "\n" +
                           "Quantidade de números ímpares: " + impares;

        JOptionPane.showMessageDialog(null, resultado, "Resultados da Matriz", JOptionPane.INFORMATION_MESSAGE);
    }
}
