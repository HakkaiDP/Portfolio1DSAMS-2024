/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pj_23102024;

import java.util.Arrays;
import java.util.Collections;

/**
 *
 * @author Hakkai
 */
public class Exercicio4 {
    
      public static void main(String[] args) {
          
        //Colocando a capacidade máxima do array  
        Integer[] numeros = new Integer[50];
            
            //Verificando se há 50 números
            for (int i = 0; i < 50; i++) {
            //Atribuindo valores de 0 a 99 na variável numeros
            numeros[i] = (int) (Math.random() * 100);
        }
        
        //Ordenando os elementos no array
        Arrays.sort(numeros, Collections.reverseOrder());
        //Exibindo os números em ordem decrescente
        System.out.println(Arrays.toString(numeros));
    }
}
