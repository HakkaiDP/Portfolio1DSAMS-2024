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
public class Exercicio3 {
  public static void main(String[] args) {
        
        //Abrindo o Scanner
        Scanner sc = new Scanner (System.in);
        
        //Pedindo a opção
        System.out.print("Digite a opção:" );
        //Lendo a opção
        int opc = sc.nextInt();
        
        //Verificando a opção de 1 a 5
        switch(opc) {
        case 1 -> System.out.print("BigMac");
        case 2 -> System.out.print("Quarteirão");
        case 3 -> System.out.print("MacChicken");
        case 4 -> System.out.print("Cheddar");
        case 5 -> System.out.print("Cheese burger");
    }
        if(opc > 5 || opc < 1){
            System.out.println("Opção Inválida");
        }
  }
}
