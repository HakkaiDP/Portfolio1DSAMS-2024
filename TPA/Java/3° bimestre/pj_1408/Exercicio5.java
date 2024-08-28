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
public class Exercicio5 {
        public static void main(String[] args) {
            
        //Abrindo o Scanner
        Scanner sc = new Scanner(System.in);
        
        //Pedindo a primeira nota
        System.out.print("Informe a primeira nota:");
        //Lendo a primeira nota
        double num1 = sc.nextDouble();
        //Pedindo a segunda nota
        System.out.print("Informe a segunda nota:");
        //Lendo a segunda nota
        double num2 = sc.nextDouble();
        //Pedindo a terceira nota
        System.out.print("Informe a terceira nota:");
        //Lendo a terceira nota
        double num3 = sc.nextDouble();
        //Pedindo a quarta nota
        System.out.print("Informe a quarta nota:");
        //Lendo a quarta nota
        double num4 = sc.nextDouble();
        
        //Atribuindo Valores
        double media = (num1 + num2 + num3 + num4) / 4;
        
        //Verificando se foi aprovado ou reprovado
        if(media >= 9 && media <= 10){
        System.out.print("Aprovado");
        }
        else if (media >= 7 && media < 9){
        System.out.print("Aprovado");
        }
        else if (media >=5 && media < 7)  {
        System.out.print("Aprovado");
        }    
        else if (media >= 2.5 && media < 5){
        System.out.print("Reprovado");
        }
        else if (media < 2.5){
        System.out.println("Reprovado");
        }
        else if (!(media >= 0 || media <= 10)){
        System.out.println("Notas Inválidas Para o Sistema");
        }
    }
}
