/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pj_0409;

import java.util.Scanner;

/**
 *
 * @author Hakkai
 */
public class Exercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o valor inicial: ");
        int inicio = sc.nextInt();
        System.out.print("Digite o valor final: ");
        int fim = sc.nextInt();

        int soma = 0;
        for (int i = inicio; i <= fim; i++) {
            if (i % 2 != 0) {
                soma += i;
            }
        }
        System.out.println("Soma dos números ímpares: " + soma);
    }
}
