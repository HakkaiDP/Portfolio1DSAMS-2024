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
public class Exercicio4 {
    public static void main(String[] args) {
        // Cria um scanner para entrada de dados do usuário
        Scanner sc = new Scanner(System.in);
        
        // Inicializa uma matriz 4x4 para armazenar valores do tipo double
        double[][] matriz = new double[4][4];
        
        // Loop para capturar os valores na matriz
        for (int i = 0; i < 4; i++) { // Percorre as linhas da matriz
            for (int j = 0; j < 4; j++) { // Percorre as colunas da matriz
                // Solicita ao usuário que insira um valor na posição atual
                System.out.print("Digite o valor para a posição (" + (i + 1) + ", " + (j + 1) + "): ");
                matriz[i][j] = sc.nextDouble(); // Armazena o valor na matriz
            }
        }

        // Exibe os valores da diagonal principal
        System.out.println("Valores da diagonal principal:");
        for (int i = 0; i < 4; i++) { // Percorre a diagonal principal
            System.out.println("Elemento na posição (" + (i + 1) + ", " + (i + 1) + "): " + matriz[i][i]);
        }

        // Exibe os valores da diagonal secundária
        System.out.println("Valores da diagonal secundária:");
        for (int i = 0; i < 4; i++) { // Percorre a diagonal secundária
            System.out.println("Elemento na posição (" + (i + 1) + ", " + (4 - i) + "): " + matriz[i][3 - i]);
        }
        
        // Fecha o scanner
        sc.close();
    }
}