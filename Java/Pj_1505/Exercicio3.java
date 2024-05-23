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
public class Exercicio3 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        System.out.print("Digite o nome: ");
        String nome = ler.nextLine();
        System.out.print("Digite o salário fixo: ");
        double sFixo = ler.nextDouble();
        System.out.print("Digite o valor das vendas: ");
        double vVendas = ler.nextDouble();
        double com = vVendas * 0.04;
        double sFinal = sFixo + com;
        System.out.println("Nome do funcionário: " + nome);
        System.out.println("Comissão: R$ " + com);
        System.out.println("Salário final: R$ " + sFinal);
    }
    
}
