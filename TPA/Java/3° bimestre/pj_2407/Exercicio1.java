/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pj_2407;

import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class Exercicio1 {

    public static void main(String[] args) {
        
        double nota1=0, nota2=0, nota3=0, nota4=0, media=0;
        
        nota1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a 1° nota"));
        nota2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a 2° nota"));
        nota3 = Double.parseDouble(JOptionPane.showInputDialog("Digite a 3° nota"));
        nota4 = Double.parseDouble(JOptionPane.showInputDialog("Digite a 4° nota"));
        
        media=(nota1+nota2+nota3+nota4)/4;
        if(media>=5)
            
        {
            JOptionPane.showMessageDialog(null, "O aluno foi aprovado com média: "+media);
        }

    }
}
