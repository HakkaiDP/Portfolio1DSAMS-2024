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
public class Exercicio2 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        //Declarando o tamanho da raiz
        int[][] matriz = new int[5][5];
        //Criando a váriavel para soma dos números impares
        int somaImpares = 0;

        // Preenchendo a matriz
        System.out.println("Digite os elementos da matriz 5x5:");
        //Percorrendo as linhas
        for (int i = 0; i < 5; i++) {
        //Percorrendo as colunas
        for (int j = 0; j < 5; j++) {
            matriz[i][j] = sc.nextInt();
            //Se o número inserido for ímpar, ele será somado à variável somaImpares.
                if (matriz[i][j] % 2 != 0) {
                    somaImpares += matriz[i][j];
                }
            }
        }

        // Um vetor de tamanho 5 que será usado para armazenar a soma de cada coluna.
        int[] somaColunas = new int[5];
        //percorrendo as colunas
        for (int j = 0; j < 5; j++) {
            //Percorrendo as linhas de cada coluna
            for (int i = 0; i < 5; i++) {
                //Adicionando os valores de cada elemento da coluna j à posição correspondente
                somaColunas[j] += matriz[i][j];
            }
        }

        //Um vetor de tamanho 5 que será usado para armazenar a soma de cada linha
        int[] somaLinhas = new int[5];
        //percorrendo as linhas
        for (int i = 0; i < 5; i++) {
            //Percorrendo as colunas de cada linha
            for (int j = 0; j < 5; j++) {
                //Adicionando os valores de cada elemento da linha i à posição correspondente
                somaLinhas[i] += matriz[i][j];
            }
        }

        // Exibição dos resultados
        System.out.println("a) Soma dos números ímpares: " + somaImpares);
        System.out.println("b) Soma de cada coluna:");
        //percorrendo o vetor somaColunas e exibindo a soma de cada coluna numerada de 1 a 5
        for (int j = 0; j < 5; j++) {
            System.out.println("Coluna " + (j + 1) + ": " + somaColunas[j]);
        }
        System.out.println("c) Soma de cada linha:");
        //percorrendo o vetor somaLinhas e exibindo a soma de cada linha numerada de 1 a 5
        for (int i = 0; i < 5; i++) {
            System.out.println("Linha " + (i + 1) + ": " + somaLinhas[i]);
        }
    }
    
}
