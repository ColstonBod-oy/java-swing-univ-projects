/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package emsgui;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.GraphicsEnvironment;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.io.IOException;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author User
 */
public class EMSGui {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException, FontFormatException {
        Font font = Font.createFont(Font.TRUETYPE_FONT, EMSGui.class.getResourceAsStream("/emsgui/assets/I-pixel-u.ttf"));
        GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
        ge.registerFont(font);
        
        ImageLabel emblem = new ImageLabel("emblem.png", 195, 256, "", null, 0f);
        ImageLabel emblemText = new ImageLabel("", 0, 0, "EMS", font, 70f);
        EMSButton addEmployee = new EMSButton(250, 50, "Add Employee", font, 25f);
        EMSButton removeEmployee = new EMSButton(250, 50, "Remove Employee", font, 25f);
        EMSButton findEmployee = new EMSButton(250, 50, "Find Employee", font, 25f);
        EMSButton updateEmployee = new EMSButton(250, 50, "Update Employee", font, 25f);
        ImageLabel bg = new ImageLabel("bg.png", 780, 780, "", null, 0f);
        
        JPanel mainPanel = new JPanel();
        mainPanel.setPreferredSize(new Dimension(780, 780));
        mainPanel.setLayout(new GridBagLayout());
        mainPanel.add(emblem, new GridBagConstraints(0, 0, 3, 1, 0, 0, GridBagConstraints.PAGE_START, 
                GridBagConstraints.NONE, new Insets(80, 0, 0, 0), 0, 0));
        mainPanel.add(emblemText, new GridBagConstraints(0, 0, 3, 1, 0, 0, GridBagConstraints.CENTER, 
                GridBagConstraints.NONE, new Insets(-10, 0, 0, 0), 0, 0));
        mainPanel.add(addEmployee, new GridBagConstraints(0, 0, 3, 1, 0, 0, GridBagConstraints.CENTER, 
                GridBagConstraints.NONE, new Insets(150, 0, 0, 0), 0, 0));
        mainPanel.add(removeEmployee, new GridBagConstraints(0, 0, 3, 1, 0, 0, GridBagConstraints.CENTER, 
                GridBagConstraints.NONE, new Insets(270, 0, 0, 0), 0, 0));
        mainPanel.add(findEmployee, new GridBagConstraints(0, 0, 3, 1, 0, 0, GridBagConstraints.CENTER, 
                GridBagConstraints.NONE, new Insets(390, 0, 0, 0), 0, 0));
        mainPanel.add(updateEmployee, new GridBagConstraints(0, 0, 3, 1, 0, 0, GridBagConstraints.CENTER, 
                GridBagConstraints.NONE, new Insets(510, 0, 0, 0), 0, 0));
        mainPanel.add(bg, new GridBagConstraints(0, 0, 3, 1, 0, 0, GridBagConstraints.CENTER, 
                GridBagConstraints.NONE, new Insets(0, 0, 0, 0), 0, 0));
        
        JFrame mainFrame = new JFrame("Employee Management System");
        mainFrame.setResizable(false);
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.add(mainPanel);
        mainFrame.pack();
        mainFrame.setLocationRelativeTo(null);
        mainFrame.setVisible(true);
        
        ImageLabel employeePic = new ImageLabel("son.png", 180, 225, "", null, 0f);
        ImageLabel employeeName = new ImageLabel("box.png", 210, 73, "John Doe", font, 20f);
        ImageLabel employeePosition = new ImageLabel("box.png", 210, 73, "Chief Tech Officer", font, 20f);
        ImageLabel employeeSalary = new ImageLabel("box.png", 210, 73, "$123/hr", font, 20f);
        ImageLabel employeeHours = new ImageLabel("box.png", 210, 73, "18:34:36", font, 20f);
        ImageLabel emblem2 = new ImageLabel("emblem.png", 195, 256, "", null, 0f);
        EMSButton update = new EMSButton(220, 50, "Update", font, 25f);
        EMSButton promote = new EMSButton(220, 50, "Promote", font, 25f);
        EMSButton back = new EMSButton(220, 50, "< Back", font, 25f);
        ImageLabel bg2 = new ImageLabel("bg.png", 780, 780, "", null, 0f);
        
        JPanel subPanel = new JPanel();
        subPanel.setPreferredSize(new Dimension(780, 780));
        subPanel.setLayout(new GridBagLayout());
        subPanel.add(employeePic, new GridBagConstraints(0, 0, 3, 1, 0, 0, GridBagConstraints.FIRST_LINE_START, 
                GridBagConstraints.NONE, new Insets(52, 52, 0, 0), 0, 0));
        subPanel.add(employeeName, new GridBagConstraints(0, 0, 3, 1, 0, 0, GridBagConstraints.PAGE_START, 
                GridBagConstraints.NONE, new Insets(74, 0, 0, 0), 0, 0));
        subPanel.add(employeePosition, new GridBagConstraints(0, 0, 3, 1, 0, 0, GridBagConstraints.PAGE_START, 
                GridBagConstraints.NONE, new Insets(167, 0, 0, 0), 0, 0));
        subPanel.add(employeeSalary, new GridBagConstraints(0, 0, 3, 1, 0, 0, GridBagConstraints.PAGE_START, 
                GridBagConstraints.NONE, new Insets(260, 0, 0, 0), 0, 0));
        subPanel.add(employeeHours, new GridBagConstraints(0, 0, 3, 1, 0, 0, GridBagConstraints.PAGE_START, 
                GridBagConstraints.NONE, new Insets(353, 0, 0, 0), 0, 0));
        subPanel.add(emblem2, new GridBagConstraints(0, 0, 3, 1, 0, 0, GridBagConstraints.FIRST_LINE_END, 
                GridBagConstraints.NONE, new Insets(94, 0, 0, 73), 0, 0));
        subPanel.add(update, new GridBagConstraints(0, 0, 3, 1, 0, 0, GridBagConstraints.LAST_LINE_START, 
                GridBagConstraints.NONE, new Insets(0, 52, 52, 0), 0, 0));
        subPanel.add(promote, new GridBagConstraints(0, 0, 3, 1, 0, 0, GridBagConstraints.PAGE_END, 
                GridBagConstraints.NONE, new Insets(0, 0, 52, 0), 0, 0));
        subPanel.add(back, new GridBagConstraints(0, 0, 3, 1, 0, 0, GridBagConstraints.LAST_LINE_END, 
                GridBagConstraints.NONE, new Insets(0, 0, 52, 52), 0, 0));
        subPanel.add(bg2, new GridBagConstraints(0, 0, 3, 1, 0, 0, GridBagConstraints.CENTER, 
                GridBagConstraints.NONE, new Insets(0, 0, 0, 0), 0, 0));
        
        JFrame subFrame = new JFrame("Employee Info");
        subFrame.setResizable(false);
        subFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        subFrame.add(subPanel);
        subFrame.pack();
        subFrame.setLocationRelativeTo(null);
        subFrame.setVisible(true);
    }
    
}
