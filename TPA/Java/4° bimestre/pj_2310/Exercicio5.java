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
public class Exercicio5 {
    public static void main(String[] args) {
        
        //declarando a capacidade do array
        int[] numspares = new int[100];
        
        //igualando a zero para conseguirmos os números pares
        int num = 0;
        
        //Preenchendo o array com 100 números
        for (int i = 0; i < 100; i++) {
            
            //atribuindo o valor de num ao numspares
            numspares[i] = num;
            //Incrementando em 2 os valores do num, para garantir os números pares
            num += 2;
        }
        //Exibindo os números pares
        System.out.println(Arrays.toString(numspares));
    }
}
