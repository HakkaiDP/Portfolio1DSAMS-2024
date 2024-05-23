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
public class Exercicio4 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        System.out.print("Digite a altura do degrau em metros: ");
        double altDegrau = ler.nextDouble();
        System.out.print("Digite a altura que deseja alcançar em metros: ");
        double altDesejada = ler.nextDouble();
        double numDegraus = altDesejada/altDegrau;
        System.out.println("Você deverá subir " + numDegraus + " degraus para chegar a altura desejada.");
    }
}
