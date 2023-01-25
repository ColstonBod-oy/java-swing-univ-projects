# A. Title of the Project (MIDTERM)

### EMS (Employee Management System)  
An employee management system is a software that helps track employee records. It also securely stores and manages personal and other work-related details for employees. That makes it easier to store and access the data when there is a need. It also helps on the employee engagement and employee retention which brings down costs and increases productivity.

We chose this title to help track employee data like the total number of hours they worked each month so that the releasing of payments would be automated along with other information that an employee would have that needs recording and automation. 

# B. Development of the Java Swing Interface (MIDTERM)  

## B.1 Problem  
For this system to work the program basically needs 2 components the main menu page where the administrator could perform operations like adding employees, removing, etc. and a details page where the employees details could be seen like hours worked and in there, the administrator could also update some of these data as well as a promote option.

## B.2 Solution/Implementation
To implement a GUI demo, we created 1 main class named EMSGui where the menu and employee info would be instantiated temporarily, 1 class named EMSButton that instantiates custom JButtons for the program, and 1 class named ImageLabel where the texts and data for the program would be displayed. We also have I-pixel-u.ttf as our font asset and bg.png, box.png, emblem.png, son.png as our image assets.  
  
![Screenshot_1](https://user-images.githubusercontent.com/75562733/161208599-480fec9d-bcef-45e6-a61f-74aec7436ec3.png)  
  
![Screenshot_2](https://user-images.githubusercontent.com/75562733/161209414-033a62d7-6f9f-4da5-9790-9076a764b179.png)  

### ImageLabel.java
```java
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
    
    public ImageLabel(String imgFile, int width, int height, String text, Font font, Float fontSize) 
    throws IOException {
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
```  

### EMSButton.java
```java
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
```  

### EMSGui.java
```java
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
        Font font = Font.createFont(Font.TRUETYPE_FONT, EMSGui.class.
        getResourceAsStream("/emsgui/assets/I-pixel-u.ttf"));
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
```

## B.3 Explanation

### ImageLabel.java  
Extends the JLabel class that instantiates JLabels with custom icons if a non-empty String imgFile, a non-zero int width, and int height arguments were provided or with custom texts if a non-empty String text and a non-null Font font object were provided. A JLabel with text and background image would be instantiated if all valid arguments are provided.  
  
Constructor:
```java
public ImageLabel(String imgFile, int width, int height, String text, Font font, Float fontSize)
```
Examples:
```java
// Instantiates a JLabel with icon only
ImageLabel emblem = new ImageLabel("emblem.png", 195, 256, "", null, 0f); 

// Instantiates a JLabel with text only
ImageLabel emblemText = new ImageLabel("", 0, 0, "EMS", font, 70f);  

// Instantiates a JLabel with icon and text
ImageLabel employeeName = new ImageLabel("box.png", 210, 73, "John Doe", font, 20f); 
```
Allows image to automatically adjust to the label's dimensions using a Buffered Image object:
```java
Image dimg = img.getScaledInstance(width, height, Image.SCALE_SMOOTH);
```  
  
### EMSButton.java  
Extends the JButton class that instantiates JButtons with custom dimensions, font, font size, and background color.  
  
Constructor:
```java
public EMSButton(int width, int height, String text, Font font, Float fontSize)
```
Examples:
```java
EMSButton addEmployee = new EMSButton(250, 50, "Add Employee", font, 25f);
EMSButton update = new EMSButton(220, 50, "Update", font, 25f);
```  
  
### EMSGui.java
This is the main class of the program where the menu and employee info would be instantiated temporarily along with their components. First, a font object was created to be passed as an argument whenever we would create texts for our program.  
  
Next, an ImageLabel icon named emblem, ImageLabel text named emblemText, ImageLabel icon named bg were created along with the EMSButtons addEmployee, removeEmployee, findEmployee, and updateEmployee. These components were then added to a mainPanel that's using a GridBagLayout, the emblem being added at the PAGE_START of the layout and the rest at the CENTER. After that, the mainPanel was then added to a mainFrame with the title "Employee Management System".

A subPanel was then created using GridBagLayout as well which contains the ImageLabel icons named  employeePic, emblem2, bg2, ImageLabel text with icons named employeeName, employeePosition, employeeSalary, employeeHours, and EMSButtons update, promote, back.  
  
The employeePic was added at the FIRST_LINE_START, employeeName, employeePosition, employeeSalary, employeeHours at the PAGE_START, emblem2 at the FIRST_LINE_END, update at the LAST_LINE_START, promote at the PAGE_END, back at the LAST_LINE_END, and bg2 at the CENTER. Finally, the subPanel was added to a subFrame with the title "Employee Info" to be displayed as well.  
  
GridBagConstraints Insets were added to all the components for the spacing and positioning on the GridBagLayout after assigning their location on the container.  
  
GridBagLayout Container Reference:  
  
|                  |                  |                  |
|:----------------:|:----------------:|:----------------:|
| FIRST_LINE_START |    PAGE_START	  |  FIRST_LINE_END  | 
|    LINE_START	   |      CENTER	    |     LINE_END     |
|  LAST_LINE_START |     PAGE_END	    |  LAST_LINE_END   |

  
# C. Case Analysis (Employee Management System) (FINAL)  
  
# D. References  
[1] Pocket HRMS (2022) What is Employee Management System? [Online].  
Available: https://www.pockethrms.com/employee-management-system
  
[2] The Java™ Tutorials (2022) How to Use GridBagLayout [Online].  
Available: https://docs.oracle.com/javase/tutorial/uiswing/layout/gridbag.html
