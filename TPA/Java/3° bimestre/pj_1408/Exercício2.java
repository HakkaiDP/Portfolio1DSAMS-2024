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
public class Exercício2 {
    public static void main(String[] args) {
        
          //Abrindo o Scanner
          Scanner sc = new Scanner (System.in);
    
    //Pedindo o peso
    System.out.print("informe seu peso em kg:");
    //Lendo o peso
    double massa = sc.nextDouble();
    
    //Pedindo a altura
    System.out.print("Informe sua altura em metros:");
    //Lendo a altura
    double altura = sc.nextDouble();
    
    //Atribuindo valor
    double imc = massa / ( altura * altura) ;
    
    //Verificando o IMC
    if(imc < 18){
    System.out.print("Magreza");
    }
    else if (imc > 18.0 && imc <= 24.9) {
        System.out.print("Saudável");
        } 
    else if (imc > 25.0 && imc < 29.9 ){
    System.out.print("Sobrepeso");
    }
    else if(imc >=30.0) {
        System.out.print("Obesidade");
    }
    }
}
