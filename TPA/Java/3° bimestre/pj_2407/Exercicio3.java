/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pj_2407;

import javax.swing.JOptionPane;

/**
 *
 * @author Hakkai
 */
public class Exercicio3 {
     public static void main(String[] args) {
        
        double DiaNasc=0, MesNasc=0, AnoNasc=0, Idade=0;
        
        DiaNasc = Double.parseDouble(JOptionPane.showInputDialog("Em que dia você nasceu?"));
        MesNasc = Double.parseDouble(JOptionPane.showInputDialog("Em que mês você nasceu?"));
        AnoNasc = Double.parseDouble(JOptionPane.showInputDialog("Em que ano você nasceu?"));
        
        Idade = 2024-AnoNasc;
        
        if(Idade < 18){
        JOptionPane.showMessageDialog(null, "Você é menor de idade");
        }
        
        else if(Idade == 18){
        JOptionPane.showMessageDialog(null, "Você atingiu a maioridade");
        }
        
        else if(Idade>=60)
        {
            JOptionPane.showMessageDialog(null, "Você é idoso");
        }
        
         else if(Idade > 18){
        JOptionPane.showMessageDialog(null, "Você é maior de idade");
        }
}
}
