/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pj_2510;

import java.util.Arrays;
import java.util.Collections;
/**
 *
 * @author Hakkai
 */
public class Exercicio2 {
    public static void main(String[] args) {
        
        //Atribuindo valores para a variável "nomes"
        String[] nomes = {"Ana", "Bruno", "Carlos", "Eduardo", "Fernanda", "Gabriel", "Helena", "Igor", "Juliana", "Lucas", "Mariana", "Nadia", "Otavio", "Paulo", "Rita"};
        
        //Ordenando os nomes em ordem decrescente
        Arrays.sort(nomes, Collections.reverseOrder());
        
        //Exibindo os nomes em ordem decrescente
        System.out.println("Nomes em ordem decrescente:");
        for (String nome : nomes) {
            System.out.println(nome);
        }
    }
}