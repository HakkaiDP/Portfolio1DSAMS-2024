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
public class Exercicio2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        
        System.out.println("Quantos reais você irá converter?");
        double reais= sc.nextDouble();
        double dolar= reais*100/180;
        double marcoalemao= reais/2;
        double libraesterlina= reais*100/157;
        System.out.println("O valor em dólar é: " + dolar);
        System.out.println("O valor em marco alemão é: " + marcoalemao);
        System.out.println("O valor em libraesterlina é: " + libraesterlina);
        
        
    }
}
