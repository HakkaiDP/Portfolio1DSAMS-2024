/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pj_1408;

import java.util.Scanner;

/**
 *
 * @author Hakkai
 */
public class Exercicio4 {
    public static void main(String[] args) {
        
        //Abrindo o Scanner
        Scanner sc = new Scanner(System.in);
        
        //Pedindo um número
        System.out.println("Digite um número entre 1 e 12" );
        //Lendo o número
        int m = sc.nextInt();
        
        //Verificando a qual mês o número corresponde
        switch(m) {
            
        case 1 -> System.out.print("Você digitou o número: " + m + " Que Corresponde o mês de Janeiro");
        case 2 -> System.out.print("Você digitou o número: " + m + " Que Corresponde o mês de Fevereiro") ;
        case 3 -> System.out.print("Você digitou o número: " + m + " Que Corresponde o mês de Março") ;
        case 4 -> System.out.print("Você digitou o número: " + m + " Que Corresponde o mês de Abril") ;
        case 5 -> System.out.print("Você digitou o número: " + m + " Que Corresponde o mês de Maio") ;
        case 6 -> System.out.print("Você digitou o número: " + m + " Que Corresponde o mês de Junho") ;        
        case 7 -> System.out.print("Você digitou o número: " + m + " Que Corresponde o mês de Julho") ;
        case 8 -> System.out.print("Você digitou o número: " + m + " Que Corresponde o mês de Agosto") ;
        case 9 -> System.out.print("Você digitou o número: " + m + " Que Corresponde o mês de Setembro") ;
        case 10 -> System.out.print("Você digitou o número: " + m + " Que Corresponde o mês de Outubro") ;
        case 11 -> System.out.print("Você digitou o número: " + m + " Que Corresponde o mês de Novembro") ;
        case 12 -> System.out.print("Você digitou o número: " + m + " Que Corresponde o mês de Dezembro") ; 
        }
        if(m > 12 || m < 0){
            System.out.println("Número Inválido");
        }
    }
}
