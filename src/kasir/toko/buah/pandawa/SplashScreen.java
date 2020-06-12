/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kasir.toko.buah.pandawa;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.UIManager;
import javax.swing.border.Border;
/**
 *
 * @author User
 */
public class SplashScreen extends JFrame{
    int a = 0;
    JProgressBar progressBar = new JProgressBar(0, 100);
    JLabel label = new JLabel();
    Border border = BorderFactory.createTitledBorder("Waiting…");
    public SplashScreen() {

        progressBar.setStringPainted(true);
        progressBar.setBorder(border);
        label.setText("Kasir Toko Buah Pandawa");
        label.setFont(new Font("Tahoma", 1, 24));
        JPanel content = (JPanel)getContentPane();
        content.setBackground(Color.yellow);
        Color warnaBorder =  Color.white;
        content.setBorder(BorderFactory.createLineBorder(warnaBorder, 5));
        setLayout(null);
        add(label);
        label.setBounds(10, 10, 350, 100);
        Component add = add(progressBar);
        progressBar.setBounds(10, 130, 315, 40);
        pack();
        setSize(350, 250);
        setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(3);
        while (a <= 100) {
            progressBar.setValue(a);
            try {
                Thread.sleep(20);
            } catch (InterruptedException e) {
            }
            a += 1;
        }
        this.dispose();
      }
        public static void main(String args[]) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            new SplashScreen();
            new Login().setVisible(true);
        } catch (Exception ex) {
        }
    }
}
