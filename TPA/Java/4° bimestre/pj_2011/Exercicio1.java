/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pj_2011;

/**
 *
 * @author Hakkai
 */
public class Exercicio1 {
    public static void main(String[] args) {
        // a)
        //Prenchendo a matriz
        char[][] matrizA = {
            {'a', 'b', 'c', 'd', 'e'},
            {'f', 'g', 'h', 'i', 'j'},
            {'l', 'm', 'n', 'o', 'p'},
            {'q', 'r', 's', 't', 'u'},
        };
        //Exibindo a matriz
        System.out.println("Matriz A:");
        for (char[] linha : matrizA) {
            for (char elemento : linha) {
                System.out.print(elemento + " ");
            }
            System.out.println();
        }

        // b)
        //Prenchendo a matriz
        int[][] matrizB = {
            {19, 25, 100, 99},
            {10, 7, 25, 14},
            {35, 2, 47, 74}
        };
        //Exibindo a matriz
        System.out.println("Matriz B:");
        for (int[] linha : matrizB) {
            for (int elemento : linha) {
                System.out.print(elemento + " ");
            }
            System.out.println();
        }

        // c)
        //Prenchendo a matriz
        double[][] matrizC = {
            {1.9, 2.5, 10.0},
            {1.0, 7.8, 2.5},
            {3.5, 2.2, 4.7}
        };
        //Exibindo a matriz
        System.out.println("Matriz C:");
        for (double[] linha : matrizC) {
            for (double elemento : linha) {
                System.out.print(elemento + " ");
            }
            System.out.println();
        }
    }
}
