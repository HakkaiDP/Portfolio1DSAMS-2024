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
public class Exercicio6 {
    public static void main(String[] args) {
        
        //Abrindo o Scanner
        Scanner sc = new Scanner(System.in);
        
        //Pedindo a Idade
        System.out.print("Insire sua idade: ");
        //Lendo a idade
        int idade = sc.nextInt();
        
        //Verificando a qual categoria o usuário pertence
        if(idade >=5 && idade <= 7){
        System.out.print("Infantil A");
        }
        else if(idade >= 8 && idade <= 10 ){
        System.out.print("Infantil B");
        }
        else if (idade >= 11 && idade <= 13){
        System.out.print("Juvenil A");
        }
        else if(idade >= 14 && idade <= 17){
        System.out.print("Juvenil B");
        }
        else if(idade >= 18) {
        System.out.print("Senior");
        }   
    }
}
