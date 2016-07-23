package cobagit;

import java.awt.EventQueue;
import javax.swing.*;

public class Cobagit extends JFrame {
JLabel asdf = new JLabel();

    private static final long serialVersionUID = 1L;
    
    public Cobagit() {
        
        initUI();
    }

    private void initUI() {
        setTitle("Lul");
        setSize(300, 600);
        setUndecorated(false);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        asdf.setText("Hi guys");        
        getContentPane().add(asdf);
        asdf.setBounds(10, 30, 70, 14);
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                Cobagit ex = new Cobagit();
                ex.setVisible(true);
            }
        });
    }
}
