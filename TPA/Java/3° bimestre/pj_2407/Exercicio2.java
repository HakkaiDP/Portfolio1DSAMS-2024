/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pj_2407;

import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class Exercicio2 {
    
    public static void main(String[] args) {
        
        double multa=0, peixesKg=0; 
                
        peixesKg = Double.parseDouble(JOptionPane.showInputDialog("Digite quantos quilos você pescou"));
        if(peixesKg > 50)
        {
        
        multa = (peixesKg-50)*4;
        JOptionPane.showMessageDialog(null, "Você terá que pagar R$"+multa);
                }
        else if (peixesKg < 50)
                
        JOptionPane.showMessageDialog(null, "Você não terá que pagar multa");
    }
    }