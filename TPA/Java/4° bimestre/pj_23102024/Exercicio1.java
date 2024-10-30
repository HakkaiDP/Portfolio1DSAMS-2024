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
public class Exercicio1 {
        public static void main(String[] args) {
            
        //atribuindo valores a variável
        String[] nomes = {"Ana", "Bruno", "Carlos", "Eduardo", "Fernanda", "Gabriel", "Juliana", "Lucas", "Mariana", "Paulo"};
            
        //ordenando elementos no array
        Arrays.sort(nomes);
        
        //Exibindo os valores em ordem crescente
        System.out.println(Arrays.toString(nomes));
    }
}
