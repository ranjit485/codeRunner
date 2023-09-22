import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainWindow extends JFrame implements ActionListener {

    String fileName;
    String path;
    ProcessBuilder Run,Compile,clone;

    MainWindow(){
        JFrame f= new JFrame();
        this.setTitle("CodeRunner");
        this.setSize(350,400);
        this.setResizable(false);
        ImageIcon logo = new ImageIcon("src/play-button.png");
        this.setIconImage(logo.getImage());
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.getContentPane().setBackground(new Color(27,38,44));


        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("clicked");

        ProcessBuilder Run = new ProcessBuilder(
                "cmd.exe", "/c", "Git clone https://github.com/ranjit485/codeRunner");
        Run.redirectErrorStream(true);

        Process p = null;

        try {
            p = Run.start();
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }

        BufferedReader r = new BufferedReader(new InputStreamReader(p.getInputStream()));
        String line;

        while (true) {
            try {
                line = r.readLine();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
            if (line == null) { break; }
            System.out.println(line);
        }

    }
}
