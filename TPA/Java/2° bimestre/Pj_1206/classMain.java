/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pj_1206;

import java.util.Scanner;

/**
 *
 * @author FATEC ZONA LESTE
 */
public class classMain {
    public static void main(String[] args) {
    //Chamando o scanner
    Scanner scanner = new Scanner(System.in);
        
    //Pedindo para o usuário digitar o nome
    System.out.println("Por favor digite o seu nome");
    
    //Lendo o nome do usuário
    String nome = scanner.next();
    
    //Pedindo para o usuário digitar sua idade
    System.out.println("Por favor digite a sua idade");
        
    //Lendo a idade do usuário
    int idade = scanner.nextInt();
     
    //Pedindo para o usuário digitar o sexo
    System.out.println("Por favor digite seu sexo");
    
    //Lendo o sexo do usuário
    String sexo = scanner.next();
    
    //Pedindo para o usuário digitar sua altura
    System.out.println("Por favor digite sua altura");
    
    //Lendo a altura do usuário
    double altura = scanner.nextDouble();
    
    //Pedindo para o usuário digitar seu endereço
    System.out.println("Por favor digite seu endereço");
    
    //Lendo o endereço do usuário
    String endereco = scanner.next();
    
    //Pedindo para o usuário digitar obsevações sobre ele
    System.out.println("Por favor digite algumas informações sobre você");
    
    //Lendo as observações do usuário
    String observacoes = scanner.next();
    
    //Pedindo o para o usuário digitar seu peso
    System.out.println("Por favor digite seu peso");
    
    //Lendo o peso do usuário
    double peso = scanner.nextDouble();
    
    //Calculando o imc
    double imc = peso/(altura*altura);
    
    //Mostrando o nome para o usuário
    System.out.println("Nome: " + nome);
    
    //Mostrando a idade para o usuário
    System.out.println("Idade: " + idade);
    
    //Confere e mostre qual o sexo(F ou M) armazenado na variável sexo
    if("M".equals(sexo)){
    System.out.println("Sexo: Masculino");
    }else{
    System.out.println("Sexo: Feminino");
    }
    
    //Mostrando o endereço para o usuário
    System.out.println("Endereço: " + endereco);
        
    //Mostrando a altura para o usuário
    System.out.println("Altura: " + altura);
    
    //Mostrando as observações para o usuário
    System.out.println("Observações: " + observacoes);
    
    //Mostrando o peso para o usuário
    System.out.println("Peso: " + peso);
    
    //Mostrando o IMC para o usuário
    System.out.println("Imc: " +imc);
    }
    
}
