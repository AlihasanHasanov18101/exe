import javax.swing.*;

public class MyFrame extends JFrame {
    MyFrame(){
        this.setVisible(true);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        ImageIcon image = new ImageIcon("src/image1.jpg");
        this.setIconImage(image.getImage());



    }
}
