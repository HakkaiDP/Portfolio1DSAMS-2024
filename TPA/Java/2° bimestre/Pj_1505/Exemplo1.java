/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pj_1505;

import java.util.Scanner;

/**
 *
 * @author Hakkai
 */
public class Exemplo1 {
    public static void main(String[] args) {
        Scanner ler= new Scanner(System.in);
        
        System.out.println("Informe o primeiro numero");
        int n1 = ler.nextInt();
        System.out.println("Informe o segundo numero");
        int n2 = ler.nextInt();
        int soma= n1+n2;
        int subtracao= n1-n2;
        int multiplicacao= n1*n2;
        int divisao= n1/n2;
        System.out.println("A soma destes numeros é: " + soma);
        System.out.println("A subtração destes numeros é: " + subtracao);
        System.out.println("A multiplicação destes numeros é: " + multiplicacao);
        System.out.println("A divisão destes numeros é: " +  divisao);
    }
    
}
