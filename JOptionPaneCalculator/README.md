# Documentation

Activity#3: JOptionPane (Calculator).

## Groupmates

Colston Bod-oy - Coding  
Jean Delmari Bernal - Documentation

## Output

![Screenshot_1](https://user-images.githubusercontent.com/75562733/155999527-dc8c118d-24aa-4e67-8f98-e08bf0718267.png)
![Screenshot_2](https://user-images.githubusercontent.com/75562733/155999556-d2dacdc5-f1df-46e7-bdd9-fda19ee7b96b.png)
![Screenshot_3](https://user-images.githubusercontent.com/75562733/155999589-505903e1-9729-4973-b6b3-6cdcd00ea032.png)

* Contains 1 main class named JOptionPaneCalculator.
```
Whole project with assets: https://github.com/ColstonBod-oy/joptionpane-calculator
```

### JOptionPaneCalculator.java

![Screenshot_4](https://user-images.githubusercontent.com/75562733/156000236-9c500bfd-3879-49a4-a313-94f14ca631da.png)

* Creates 2 input dialogs and assigns their values to input1 and input2.
* Creates an operators array and pass it to an option dialog.
* Assigns the selected operator's int value to the operator variable.
```
Integer.parseInt(String);
```
Converts the strings input1 and input2 to integers and assigns them to num1 and num2 int variables. 

![Screenshot_5](https://user-images.githubusercontent.com/75562733/156002763-1f37210b-0eca-4af5-b423-955c90c6bfa6.png)
![Screenshot_6](https://user-images.githubusercontent.com/75562733/156002778-38ad9afd-7079-40ae-a84a-ce3d603a778a.png)
![Screenshot_7](https://user-images.githubusercontent.com/75562733/156002793-cce3624a-b1a0-4a8b-bcbc-33ff65d771d8.png)
![Screenshot_8](https://user-images.githubusercontent.com/75562733/156002805-dd36a3cb-d66c-4235-b2d5-e50bb6f495a0.png)
```
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
```
Performs the appropriate operation on num1 and num2 based on the selected operator's int value and outputs the answer on a message dialog (see above image where num1 and num2 both have the value 1). 

### End of Documentation
