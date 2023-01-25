/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package joptionpanecalculator;

import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class JOptionPaneCalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String input1 = JOptionPane.showInputDialog(null, "Enter First Number", 
                "JOptionPane Calculator", JOptionPane.INFORMATION_MESSAGE);
        int num1 = Integer.parseInt(input1);
        
        String[] operators = new String[]{"+", "-", "*", "/"};
        int operator = JOptionPane.showOptionDialog(null, "Select Operator", "JOptionPane Calculator", 
                JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, operators, operators[0]);
        
        String input2 = JOptionPane.showInputDialog(null, "Enter Second Number", 
                "JOptionPane Calculator", JOptionPane.INFORMATION_MESSAGE);
        int num2 = Integer.parseInt(input2);
        
        switch (operator) {
            case 0:
                JOptionPane.showMessageDialog(null, "Sum: " + (num1 + num2), 
                    "JOptionPane Calculator", JOptionPane.INFORMATION_MESSAGE);
                break;
                
            case 1:
                JOptionPane.showMessageDialog(null, "Difference: " + (num1 - num2), 
                    "JOptionPane Calculator", JOptionPane.INFORMATION_MESSAGE);
                break;
            
            case 2:
                JOptionPane.showMessageDialog(null, "Product: " + (num1 * num2), 
                    "JOptionPane Calculator", JOptionPane.INFORMATION_MESSAGE);
                break;
             
            case 3:
                JOptionPane.showMessageDialog(null, "Quotient: " + (num1 / num2), 
                    "JOptionPane Calculator", JOptionPane.INFORMATION_MESSAGE);
                break;
        }
    }
    
}
