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
public class Exercicio1 {
    public static void main(String[] args) {
        Scanner ler= new Scanner(System.in);
        
        System.out.print("Digite o valor da base maior do trapézio: ");
        double bm= ler.nextDouble();
        System.out.print("Digite o valor da base menor do trapézio: ");
        double bn= ler.nextDouble();
        System.out.print("Digite a altura do trapézio: ");
        double a= ler.nextDouble();
        double area= ((bm+bn)*a)/2;
        System.out.println("A área deste trapézio é: " + area);
    }
    
}
