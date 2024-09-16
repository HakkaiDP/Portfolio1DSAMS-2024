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
public class Exercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o primeiro número: ");
        int num1 = sc.nextInt();
        System.out.print("Digite o segundo número: ");
        int num2 = sc.nextInt();

        int inicio = Math.min(num1, num2);
        int fim = Math.max(num1, num2);

        for (int i = fim; i >= inicio; i--) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}