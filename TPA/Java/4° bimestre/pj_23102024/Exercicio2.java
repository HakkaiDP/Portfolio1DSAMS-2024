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
public class Exercicio2 {
    
    public static void main(String[] args) {
       
    //Atribuindo valores a variável
    String[] nomes = {"Ana", "Bruno", "Carlos", "Eduardo", "Fernanda", "Gabriel", "Juliana", "Lucas", "Mariana", "Paulo",
    "Ricardo", "Sofia", "Tiago", "Vanessa", "Wilson", "Xavier", "Yasmin", "Zara", "Lara", "Igor"};
    
    //Ordenando os elementos no array
    Arrays.sort(nomes, Collections.reverseOrder());
    
    //Exibindo os nomes em ordem decrescente
    System.out.println(Arrays.toString(nomes));
    }
}
