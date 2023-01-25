/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pixelcv;

import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.GraphicsEnvironment;
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
    
    public ImageLabel(String imgFile, int x, int y, int width, int height) throws IOException {
        setBounds(x, y, width, height);
        setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BufferedImage img = ImageIO.read(getClass().getResource("/pixelcv/assets/" + imgFile));    
        Image dimg = img.getScaledInstance(getWidth(), getHeight(), Image.SCALE_SMOOTH);
        ImageIcon ico = new ImageIcon(dimg);
        setIcon(ico);
    }
    
    public void setImageLabelFont(String fontFile, float fontSize) throws FontFormatException, IOException {
        Font font = Font.createFont(Font.TRUETYPE_FONT, getClass()
                .getResourceAsStream("/pixelcv/assets/" + fontFile)).deriveFont(fontSize);
        GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
        ge.registerFont(font);
        setFont(font);
    }
    
}
