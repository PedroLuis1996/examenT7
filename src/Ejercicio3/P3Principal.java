package Ejercicio3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class P3Principal extends JFrame {

    public P3Principal() throws HeadlessException {


        this.setTitle("Tres en raya");
        JPanel panelAbajo = new JPanel();
        JLabel texto = new JLabel("turno de jugador X");
        panelAbajo.add(texto);

        JPanel botones = new JPanel();
        botones.setLayout(new GridLayout(3, 3));

        for (int i = 1; i < 10; i++){
            JButton boton = new JButton("" + i);
            boton.setFont(boton.getFont().deriveFont(48.0f));
            botones.add(boton);

            boton.addActionListener(new ActionListener() {

                @Override
                public void actionPerformed(ActionEvent e) {
                    if (texto.getText().equals("turno de jugador X")){
                        boton.setText("X");
                        boton.setEnabled(false);
                        texto.setText("turno de jugador O");

                    }else if (texto.getText().equals("turno de jugador O")) {
                        boton.setText("O");
                        boton.setEnabled(false);
                        texto.setText("turno de jugador X");

                    }

                }
            });



        }



        this.add(botones);
        this.add(panelAbajo, BorderLayout.PAGE_END);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        this.setSize(640, 840);



    }
}
