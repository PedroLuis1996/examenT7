package ejercicio1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class P1MenuColoresFrame {
    public static void main(String[] args) {
        JFrame ventana = new JFrame();

        JPanel panel = new JPanel();
        ventana.add(panel);


        JMenuBar menuBar = new JMenuBar();
        JMenu color = new JMenu("Color");
        JMenuItem rojo = new JMenuItem("Rojo");
        JMenuItem verde = new JMenuItem("Verde");
        JMenuItem azul = new JMenuItem("Azul");
        JMenuItem menuItemSalir = new JMenuItem("Salir");
        menuItemSalir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        rojo.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                panel.setBackground(Color.red);
            }
        });

        azul.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                panel.setBackground(Color.blue);
            }
        });

        verde.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                panel.setBackground(Color.green);
            }
        });

        color.add(rojo);
        color.add(verde);
        color.add(azul);
        color.addSeparator();
        color.add(menuItemSalir);
        menuBar.add(color);
        ventana.setJMenuBar(menuBar);
        ventana.setSize(640, 480);
        ventana.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        ventana.setVisible(true);






    }
}