/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package emsgui;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author User
 */
public class ImageLabel extends JLabel {
    
    public ImageLabel(String imgFile, int width, int height, String text, Font font, Float fontSize) throws IOException {
        if (width != 0 && height != 0) {
            setPreferredSize(new Dimension(width, height));
        }
        
        setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        
        if (!imgFile.equals("")) {
            BufferedImage img = ImageIO.read(getClass().getResource("/emsgui/assets/" + imgFile));    
            Image dimg = img.getScaledInstance(width, height, Image.SCALE_SMOOTH);
            ImageIcon ico = new ImageIcon(dimg);
            setIcon(ico);
        }
        
        if (!text.equals("")) {
            setText(text);
        }
        
        if (font != null) {
            setFont(font.deriveFont(fontSize));
        }
    }
    
}
