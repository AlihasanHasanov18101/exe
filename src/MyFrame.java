import javax.swing.*;

public class MyFrame extends JFrame {
    MyFrame(){
        this.setVisible(true);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setTitle("Crazy Kur");
        this.setSize(900,900);

        ImageIcon image = new ImageIcon("src/image1.jpg");
        this.setIconImage(image.getImage());



    }
}
