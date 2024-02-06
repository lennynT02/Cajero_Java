package Prueba2B;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.MatteBorder;

public class Verificacion {
    JLabel encabezado = new JLabel("Bienvenido al Banco Buho");

    PlaceholderPasword pin = new PlaceholderPasword();

    JButton boton1 = new JButton("1");
    JButton boton2 = new JButton("2");
    JButton boton3 = new JButton("3");
    JButton boton4 = new JButton("4");
    JButton boton5 = new JButton("5");
    JButton boton6 = new JButton("6");
    JButton boton7 = new JButton("7");
    JButton boton8 = new JButton("8");
    JButton boton9 = new JButton("9");
    JButton boton0 = new JButton("0");
    JButton botonAceptar = new JButton("Aceptar");

    JPanel panel = new JPanel(new GridBagLayout());
    GridBagConstraints gbc = new GridBagConstraints();

    public Verificacion() {
        panel.setPreferredSize(new Dimension(450, 600));

        // label
        encabezado.setFont(new Font("Serif", Font.PLAIN, 24));
        encabezado.setBorder(new MatteBorder(0, 0, 2, 0, new Color(76, 76, 76, 100)));
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 3;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.anchor = GridBagConstraints.NORTHWEST;
        gbc.insets = new Insets(0, 0, 40, 0);
        panel.add(encabezado, gbc);
        
        // pin
        pin.setPlaceholder("Ingrese su pin");
        pin.setPreferredSize(new Dimension(300,30));
        gbc.fill = GridBagConstraints.NONE;
        gbc.anchor = GridBagConstraints.CENTER;
        gbc.gridy = 1;
        gbc.gridwidth = 3;
        panel.add(pin, gbc);
        
        // botones
        gbc.insets = new Insets(0, 20, 0, 0);
        gbc.weightx = 1;
        gbc.weighty = 1;
        gbc.fill = GridBagConstraints.BOTH;
        gbc.gridwidth = 1; 
        gbc.gridy = 2;
        panel.add(boton1, gbc);

        gbc.insets = new Insets(0, 0, 0, 0);
        gbc.gridx = 1;
        gbc.gridy = 2;
        panel.add(boton2, gbc);

        gbc.insets = new Insets(0, 0, 0, 20);
        gbc.gridx = 2;
        panel.add(boton3, gbc);

        gbc.insets = new Insets(0, 20, 0, 0);
        gbc.gridx = 0;
        gbc.gridy = 3;
        panel.add(boton4, gbc);

        gbc.insets = new Insets(0, 0, 0, 0);
        gbc.gridx = 1;
        panel.add(boton5, gbc);

        gbc.insets = new Insets(0, 0, 0, 20);
        gbc.gridx = 2;
        panel.add(boton6, gbc);

        gbc.insets = new Insets(0, 20, 0, 0);
        gbc.gridx = 0;
        gbc.gridy = 4;
        panel.add(boton7, gbc);

        gbc.insets = new Insets(0, 0, 0, 0);
        gbc.gridx = 1;
        panel.add(boton8, gbc);

        gbc.insets = new Insets(0, 0, 0, 20);
        gbc.gridx = 2;
        panel.add(boton9, gbc);

        gbc.insets = new Insets(0, 20, 20, 0);
        gbc.gridx = 0;
        gbc.gridy = 5;
        panel.add(boton0, gbc);

        gbc.insets = new Insets(0, 0, 20, 20);
        gbc.gridx = 1;
        gbc.gridwidth = 2;
        panel.add(botonAceptar, gbc);

        pin.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                e.consume(); 
            }
        });
        boton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String textoActual = new String(pin.getPassword());
                textoActual += "1";
                pin.setText(textoActual);
            }
        });
        boton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String textoActual = new String(pin.getPassword());
                textoActual += "2";
                pin.setText(textoActual);
            }
        });
        boton3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String textoActual = new String(pin.getPassword());
                textoActual += "3";
                pin.setText(textoActual);
            }
        });
        boton4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String textoActual = new String(pin.getPassword());
                textoActual += "4";
                pin.setText(textoActual);
            }
        });
        boton5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String textoActual = new String(pin.getPassword());
                textoActual += "5";
                pin.setText(textoActual);
            }
        });
        boton6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String textoActual = new String(pin.getPassword());
                textoActual += "6";
                pin.setText(textoActual);
            }
        });
        boton7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String textoActual = new String(pin.getPassword());
                textoActual += "7";
                pin.setText(textoActual);
            }
        });
        boton8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String textoActual = new String(pin.getPassword());
                textoActual += "8";
                pin.setText(textoActual);
            }
        });
        boton9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String textoActual = new String(pin.getPassword());
                textoActual += "9";
                pin.setText(textoActual);
            }
        });
        boton0.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String textoActual = new String(pin.getPassword());
                textoActual += "0";
                pin.setText(textoActual);
            }
        });
        botonAceptar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent e) {
                String textoActual = new String(pin.getPassword());
                if (textoActual.equals("1234")) {
                    JFrame frame = (JFrame) SwingUtilities.getWindowAncestor(panel);
                    frame.dispose();
                    JFrame menuopciones = new JFrame();
                    menuopciones.setContentPane(new Menu().menu);
                    menuopciones.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    menuopciones.pack();
                    menuopciones.setVisible(true);
                } else {
                    JOptionPane.showMessageDialog(null, "Pin incorrecto");
                }
            }
        });

    }
}
