/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pj_23102024;

import java.util.Arrays;

/**
 *
 * @author Hakkai
 */
public class Exercicio3 {
    
        public static void main(String[] args) {
            
            //Colocando a capacidade máxima do array
            int[] numeros = new int[50];
            
                //Fazendo a verificação se há 50 números
                for (int i = 0; i < 50; i++) {
                //Atribuindo 50 números de 0 a 99 à variável numeros
                numeros[i] = (int) (Math.random() * 100);
        }
                
        //ordenando os números no array
        Arrays.sort(numeros);
        //Exibindo os 50 números em ordem crescente
        System.out.println(Arrays.toString(numeros));
    }
}
