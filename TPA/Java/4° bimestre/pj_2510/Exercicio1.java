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
public class Exercicio1 {
    public static void main(String[] args) {
        
        //Atribuindo valores para a variável "nomes"
        String[] nomes = {"Ana", "Bruno", "Carlos", "Eduardo", "Fernanda", "Gabriel", "Helena", "Igor", "Juliana", "Lucas", "Mariana", "Nadia", "Otavio", "Paulo", "Rita"};
        
        //Ordenando os nomes em ordem crescente
        Arrays.sort(nomes);
        
        //Exibindo os nomes em ordem crescente
        System.out.println("Nomes em ordem crescente:");
        for (String nome : nomes) {
            System.out.println(nome);
        }
    }
}
