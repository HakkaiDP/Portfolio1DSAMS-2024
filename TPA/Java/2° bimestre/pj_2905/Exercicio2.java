/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pj_2905;
/**
 *
 * @author FATEC ZONA LESTE
 */
public class Exercicio2 {
    public static int calcularDobro(int numero) {
        return numero*2;
    }
    public static void main(String[] args) {
        int numero = 5;
        var resultado = calcularDobro(numero);
        System.out.println("O dobro de " + numero + " é: " + resultado);
    }
}
