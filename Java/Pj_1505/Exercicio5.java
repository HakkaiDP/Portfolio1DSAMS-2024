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
public class Exercicio5 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        System.out.print("Informe o custo total do espetáculo em reais: ");
        double custoEspetaculo = ler.nextDouble();
        System.out.print("Informe o preço do convite em reais: ");
        double valorConvite = ler.nextDouble();
        int quantConvites = (int) (custoEspetaculo / valorConvite);
        System.out.println("Você precisará vender " + quantConvites + " convites para alcançar o custo do espetáculo.");
}
}
