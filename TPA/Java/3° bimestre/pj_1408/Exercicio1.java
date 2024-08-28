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
public class Exercicio1 {
    public static void main(String[] args) {
         
        //Abrindo o Scanner
         Scanner sc = new Scanner(System.in);
         
         //Pedindo o horário do turno
         System.out.print("Inicio do Turno:");
         //Lendo o horário do turno
         double horario = sc.nextDouble(); 
         
         //Verificando o turno
         if (horario >= 5 && horario < 13){
         System.out.print("Manhã");
         }
         if  (horario >= 13 && horario < 21 ){
             System.out.print("Tarde");
     }
         if( horario >= 21 && !(horario > 24) || horario < 5) {
             System.out.print("Noite");
         
         }
     }
}
