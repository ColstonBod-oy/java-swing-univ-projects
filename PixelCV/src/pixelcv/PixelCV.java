/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pixelcv;

import java.awt.Dimension;
import java.awt.FontFormatException;
import java.io.IOException;
import javax.swing.JFrame;

/**
 *
 * @author User
 */
public class PixelCV {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException, FontFormatException {
        ImageLabel bg = new ImageLabel("bg.png", 0, 0, 780, 780);
        ImageLabel son = new ImageLabel("son.png", 52, 52, 180, 225);
        ImageLabel emblem = new ImageLabel("emblem.png", 500, 90, 195, 256);
        
        ImageLabel section = new ImageLabel("box.png", 250, 70, 200, 35);
        section.setImageLabelFont("I-pixel-u.ttf", 18f);
        section.setText("BSCS-2A");
        
        ImageLabel name = new ImageLabel("box.png", 250, 120, 200, 25);
        name.setImageLabelFont("I-pixel-u.ttf", 14f);
        name.setText("Colston Dela Cruz Bod-oy");
        
        ImageLabel birthday = new ImageLabel("box.png", 250, 150, 200, 25);
        birthday.setImageLabelFont("I-pixel-u.ttf", 14f);
        birthday.setText("07.24.2002");
        
        ImageLabel sex = new ImageLabel("box.png", 250, 180, 200, 25);
        sex.setImageLabelFont("I-pixel-u.ttf", 14f);
        sex.setText("Male");
        
        ImageLabel nationality = new ImageLabel("box.png", 250, 210, 200, 25);
        nationality.setImageLabelFont("I-pixel-u.ttf", 14f);
        nationality.setText("Filipino");
        
        ImageLabel info = new ImageLabel("box.png", 70, 409, 640, 300);
        info.setImageLabelFont("I-pixel-u.ttf", 20f);
        info.setText("<html><b>EDUCATION</b><br>Tarlac State University<br><b>SKILLS</b>"
                + "<br>WebDev, MobileDev, DevOps<br><b>BOOKS</b><br>Fablehaven Series by Brandon Mull</html>");
        
        JFrame frame = new JFrame("Pixel CV");
        frame.setSize(780, 780);
        frame.setLayout(null);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.add(info);
        frame.add(nationality);
        frame.add(sex);
        frame.add(birthday);
        frame.add(name);
        frame.add(section);
        frame.add(emblem);
        frame.add(son);
        frame.add(bg);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // Adds excess width and height caused by window borders on the frame to match bg size
        Dimension frameSize = frame.getContentPane().getSize();
        int excessWidth = frame.getWidth() - frameSize.width;
        int excessHeight = frame.getHeight() - frameSize.height;
        frame.setSize(frame.getWidth() + excessWidth, frame.getHeight() + excessHeight);
    }
    
}
