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
public class Exercicio6 {
    public static void main(String[] args) {
        
        //Colocando a capacidade máxima do array
        int[] numsimpares = new int[100];
        
        //Atribuindo o valor 1 para a váriavel num
        int num = 1;
        
        //Fazendo a veriificação se há 100 números
        for (int i = 0; i < 100; i++) {
            
            //Atribuindo os valores de num para o índice do array
            numsimpares[i] = num;
            //Incrementando em 2 os valores do num, para garantir os números impares
            num += 2;
        }
        
        System.out.println(Arrays.toString(numsimpares));
    }
}
