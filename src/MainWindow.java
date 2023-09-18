import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

public class MainWindow extends JFrame implements ActionListener {

    MenuBar mb;
    MenuItem m1,m2,m3,m4;
    Menu mn;
    MenuShortcut menuShortcut;
    MainWindow(){
        JFrame f= new JFrame();
        this.setTitle("CodeRunner");
        this.setSize(350,400);
        this.setResizable(false);
        ImageIcon logo = new ImageIcon("src/play-button.png");
        this.setIconImage(logo.getImage());
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.setLayout(new BorderLayout(3,4));
        this.getContentPane().setBackground(new Color(27,38,44));

        Container main = this.getContentPane();
        main.setLayout(new BorderLayout(0,0));

        menuShortcut =new MenuShortcut(KeyEvent.VK_X);
        mn =new Menu("File");
        mb = new MenuBar();
        m1 =new MenuItem("New");
        m2 =new MenuItem("Open");
        m3 =new MenuItem("Save As");
        m4 = new MenuItem("Exit",menuShortcut);

        mn.add(m1);
        mn.add(m2);
        mn.add(m3);
        mn.addSeparator();
        mb.add(mn);

        Button addNew=new Button("ADD NEW");
        addNew.setBackground(Color.cyan);
        addNew.addActionListener(this);
        main.add(addNew,BorderLayout.SOUTH);

        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("clicked");

    }
}
