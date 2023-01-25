# Documentation

Documentation for Activity#2: Resume or CV.

## Groupmates

Colston Bod-oy - Coding  
Jean Delmari Bernal - Documentation

## Output

![Screenshot_1](https://user-images.githubusercontent.com/75562733/154498016-5174a63a-a578-413d-986e-440bf88ec925.png)

* Contains 1 main class named PixelCV and 1 class named ImageLabel.
* Assets: I-pixel-u.ttf, bg.png, box.png, emblem.png, son.png.
```
Whole project with assets: https://github.com/ColstonBod-oy/pixel-cv
```

### ImageLabel.java

![Screenshot_2](https://user-images.githubusercontent.com/75562733/154497645-b9a571a9-9548-41b1-a557-9406947e4857.png)

* Extends the JLabel class.
* Allows to create an ImageIcon with optional text.
* Allows custom positioning and sizing of label using setBounds.
* Has a utility method named setImageLabelFont to create custom fonts and font sizes.
```
Image dimg = img.getScaledInstance(getWidth(), getHeight(), Image.SCALE_SMOOTH);
```
Allows image to automatically adjust to the label's dimensions using a Buffered Image object.

### PixelCV.java

![Screenshot_3](https://user-images.githubusercontent.com/75562733/154501678-3f50a83d-f185-42cb-aa5a-58ef7a9c67ee.png)
![Screenshot_4](https://user-images.githubusercontent.com/75562733/154501722-bb4d71c6-21f6-491e-9fc1-6e538a25ba20.png)

* The main class of the program.
* Creates a non-resizable frame and centers it on the screen.
* Instanciates ImageLabels with different assets.
* Adds the created ImageLabels to the frame with the last one being the bottomost.
```
Dimension frameSize = frame.getContentPane().getSize();
int excessWidth = frame.getWidth() - frameSize.width;
int excessHeight = frame.getHeight() - frameSize.height;
frame.setSize(frame.getWidth() + excessWidth, frame.getHeight() + excessHeight);
```
This adds excess width and height caused by window borders on the frame to match bg size.

### End of Documentation
