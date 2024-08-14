/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pj_0708;

import java.util.Scanner;

/**
 *
 * @author FATEC ZONA LESTE
 */
public class mainClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //Pedindo a primeira nota
        System.out.println("Digite a primeira nota de 1 a 100");
        //Recebendo a primeira nota
        double nota1 = sc.nextDouble();
        //Pedindo a segunda nota
        System.out.println("Digite a segunda nota de 1 a 100");
        //Recebendo a sengunda nota
        double nota2 = sc.nextDouble();
        //Pedindo a terceira nota
        System.out.println("Digite a terceira nota de 1 a 100");
        //Recebendo a terceira nota
        double nota3 = sc.nextDouble();
        //Pedindo a quarta nota
        System.out.println("Digite a quarta nota de 1 a 100");
        //Recebendo a quarta nota
        double nota4 = sc.nextDouble();
        
        double media = (nota1+nota2+nota3+nota4)/4;
        
        //Verificando e devolvendo o desempenho do aluno
        if(media <= 100&&media >= 80){
            System.out.println("Parabéns você obteve uma boa nota com a média "+media);
        }
        if(media <= 70&&media >= 50){
            System.out.println("Você conseguiu uma nota mediana com a média "+media);
        }
        else if(media <= 49||media == 0){
            System.out.println("Você não passou com a média "+media);
        }
        else if(!(media < 100)){
            System.out.println("Nota ultrapassou 100, INVALIDO");
        }
        //Fecha scanner
        sc.close();
        
       
    }
}
