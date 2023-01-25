/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package emsgui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.JButton;

/**
 *
 * @author User
 */
public class EMSButton extends JButton {
    
    public EMSButton(int width, int height, String text, Font font, Float fontSize) {
        setPreferredSize(new Dimension(width, height));
        setText(text);
        setFont(font.deriveFont(fontSize));
        setBackground(Color.decode("#a7a7a7"));
    }
    
}
