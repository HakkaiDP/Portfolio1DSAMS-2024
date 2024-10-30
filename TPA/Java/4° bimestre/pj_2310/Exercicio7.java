/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pj_23102024;

/**
 *
 * @author Hakkai
 */
public class Exercicio7 {
        public static void main(String[] args) {
            
    //Atribuindo valores para a váriavel times
    String[] times = { "Botafogo", "Palmeiras", "Fortaleza", "Flamengo", "São Paulo", "Internacional" , "Bahia" , "Cruzeiro", "Atlético- MG",
    "Vasco" , "Grêmio", "Criciúma" , "Bragantino", "Juventude", "Atlético-PR", "Fluminense", "EC-Vitória",  "Corinthians",  "Cuiabá", "Atlético-GO" };
        
        //Exibindo a tabela do brasileirão
        System.out.println("Tabela do Brasileirão: ");
        
        //Fazendo com que não pare de exbir os times até que passe por todos os elementos do array
        for(int i =0; i< times.length; i++){
            //Exibindo todos os times em ordem com o sufixo ordinal para a saída ser 1°, 2°, 3°...
            System.out.println((i + 1) + "° " + times[i]);
        }
    }
}
