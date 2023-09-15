import javax.swing.*;
import java.awt.*;

public class MainWindow extends JFrame {
    MainWindow(){
        this.setTitle("CodeRunner");
        this.setSize(350,400);
        this.setResizable(false);
        ImageIcon logo = new ImageIcon("src/play-button.png");
        this.setIconImage(logo.getImage());
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.getContentPane().setBackground(new Color(27,38,44));

        this.setVisible(true);
    }
}
