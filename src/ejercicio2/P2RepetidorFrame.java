package ejercicio2;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class P2RepetidorFrame extends JFrame {
    private int repeticiones;
    public P2RepetidorFrame() throws HeadlessException {
        repeticiones = 2;
        setTitle( repeticiones +" repeticiones");
        setSize(300, 150);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JPanel pnlBotones = new JPanel(new FlowLayout());


        JButton btnMenos = new JButton("-1");
        JButton btnMas = new JButton("+1");


        pnlBotones.add(btnMenos);
        pnlBotones.add(btnMas);
        add(pnlBotones, BorderLayout.PAGE_START);

        JPanel pnlCentral = new JPanel(new GridLayout(2, 2));
        pnlCentral.setBorder(new EmptyBorder(10, 10, 10, 10));
        pnlCentral.add(new JLabel("Entrada:", SwingConstants.RIGHT));


        JTextField txtEntrada = new JTextField(20);


        pnlCentral.add(txtEntrada);
        pnlCentral.add(new JLabel("Salida:", SwingConstants.RIGHT));
        JTextField txtSalida = new JTextField(20);
        pnlCentral.add(txtSalida);
        add(pnlCentral, BorderLayout.CENTER);


        btnMenos.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int rep = Integer.parseInt(String.valueOf(getTitle().charAt(0)));
                rep--;
                setTitle(rep + " repeticiones");

                String texto = txtEntrada.getText();
                String nuevoTexto = "";
                int numero = txtEntrada.getText().length();
                for (int i = 0; i < numero; i = i + 2){
                    nuevoTexto =nuevoTexto + texto.charAt(i);
                }
                txtSalida.setText(nuevoTexto);
                btnMas.setEnabled(true);
                if (getTitle().equals("2 repeticiones")){
                    btnMenos.setEnabled(false);
                }
            }
        });

        btnMas.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                int rep = Integer.parseInt(String.valueOf(getTitle().charAt(0)));
                rep++;
                setTitle(rep + " repeticiones");

                String texto = txtEntrada.getText();
                String nuevoTexto = "";
                int numero = txtEntrada.getText().length();
                for (int i = 0; i < numero; i++){
                    nuevoTexto = nuevoTexto + texto.charAt(i);
                    nuevoTexto = nuevoTexto + texto.charAt(i);

                }
                txtSalida.setText(nuevoTexto);
                btnMenos.setEnabled(true);

                if (getTitle().equals("5 repeticiones")){
                    btnMas.setEnabled(false);
                }

            }
        });






        setVisible(true);
    }
}
