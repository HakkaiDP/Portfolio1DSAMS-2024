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
public class Exercicio8 {
    public static void main(String[] args) {
        
        //Abrindo o Scanner
        Scanner sc = new Scanner(System.in);
        
        //Pedindo a medida do lado A
        System.out.print("Informe a medida do lado A em centímetros:");
        //Lendo a medida do Lado A
        double LadoA = sc.nextDouble();
        
        //Pedindo a medida do lado B
        System.out.print("Informe a medida do lado B em centímetros:");
        //Lendo a medida do Lado B
        double LadoB = sc.nextDouble();
        
        //Pedindo a medida do lado C
        System.out.print("Informe a medida do lado C em centímetros:");
        //Lendo a medida do Lado C
        double LadoC = sc.nextDouble();
        
        //Atribuindo Valores
        double soma1 = LadoA + LadoB;
        double soma2 = LadoB + LadoC;
        double soma3 = LadoC + LadoA;
        
        
        //Fazendo a verificação do tipo de triângulo
        if(LadoA == LadoB && LadoA == LadoC && LadoB == LadoC && soma1 > LadoC && soma2 > LadoA && soma3 > LadoB){
        System.out.print("Triângulo Equilátero");
        }
        else if(LadoA == LadoB && LadoA != LadoC && LadoB != LadoC && soma1 > LadoC && soma2 > LadoA && soma3 > LadoB){
        System.out.print("Triângulo Isosceles");
        }
        else if(LadoA != LadoB && LadoA != LadoC && LadoB != LadoC && soma1 > LadoC && soma2 > LadoA && soma3 > LadoB){
        System.out.print("Triângulo Escaleno");
        }
        else {
        System.out.print("Não compõem um triângulo");
        }
    }
}
