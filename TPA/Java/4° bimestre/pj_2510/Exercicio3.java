/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pj_2510;

import java.util.Arrays;
/**
 *
 * @author Hakkai
 */
public class Exercicio3 {
    public static void main(String[] args) {
        
        //Atribuindo valores para a variável "números"
        int[] numeros = {34, 23, 12, 45, 67, 89, 10, 4, 56, 78, 90, 11, 22, 33, 44, 55, 66, 77, 99, 100, 9, 8, 7, 6, 5, 3, 2, 1, 91, 92, 93, 94, 95,
        96, 97, 98, 84, 83, 82, 81, 80, 79, 88, 87, 86, 85, 74, 73, 72, 71};
        
        //Ordenando os números em ordem crescente
        Arrays.sort(numeros);
        
        //Exibindo os números em ordem crescente
        System.out.println("Números em ordem crescente:");
        for (int numero : numeros) {
            System.out.println(numero);
        }
    }
}
