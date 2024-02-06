package Prueba2B;

import javax.swing.*;
import javax.swing.border.*;

import java.awt.*;
import java.awt.event.*;

public class Menu {
    JPanel menu = new JPanel(new GridBagLayout());

    JLabel encabezado = new JLabel("Menu de opciones");

    JRadioButton versaldo = new JRadioButton("Ver saldo");
    JRadioButton retirardinero = new JRadioButton("Retirar dinero");
    JRadioButton depositardinero = new JRadioButton("Depositar dinero");
    JRadioButton salir = new JRadioButton("Salir");
    ButtonGroup grupo = new ButtonGroup();

    JButton aceptar = new JButton("Aceptar");

    GridBagConstraints gbc = new GridBagConstraints();

    public Menu() {
        menu.setPreferredSize(new java.awt.Dimension(450, 600));

        // label
        encabezado.setFont(new Font("Serif", Font.PLAIN, 24));
        encabezado.setBorder(new MatteBorder(0, 0, 2, 0, new Color(76, 76, 76, 100)));
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 1;
        gbc.weightx = 1;
        gbc.weighty = 1;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.anchor = GridBagConstraints.NORTHWEST;
        gbc.insets = new Insets(0, 0, 40, 0);
        menu.add(encabezado, gbc);

        // radio buttons

        grupo.add(versaldo);
        grupo.add(retirardinero);
        grupo.add(depositardinero);
        grupo.add(salir);

        Font fuenteRB = new Font("Serif", Font.PLAIN, 18);
        versaldo.setFont(fuenteRB);
        gbc.gridy = 1;
        gbc.anchor = GridBagConstraints.CENTER;
        gbc.insets = new Insets(0, 50, 0, 0);
        menu.add(versaldo, gbc);

        retirardinero.setFont(fuenteRB);
        gbc.gridy = 2;
        menu.add(retirardinero, gbc);

        depositardinero.setFont(fuenteRB);
        gbc.gridy = 3;
        menu.add(depositardinero, gbc);

        salir.setFont(fuenteRB);
        gbc.gridy = 4;
        menu.add(salir, gbc);

        // boton
        gbc.gridy = 5;
        gbc.insets = new Insets(20, 0, 0, 0);
        gbc.fill = GridBagConstraints.HORIZONTAL;
        menu.add(aceptar, gbc);

        aceptar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (versaldo.isSelected()) {
                    JDialog verSaldo = new JDialog();
                    verSaldo.setContentPane(new VerSaldo().panel);
                    verSaldo.setDefaultCloseOperation(JDialog.DO_NOTHING_ON_CLOSE);
                    verSaldo.pack();
                    verSaldo.setVisible(true);

                } else if (retirardinero.isSelected()) {

                    JDialog retirarDinero = new JDialog();
                    retirarDinero.setContentPane(new RetirarDinero().panel);
                    retirarDinero.setDefaultCloseOperation(JDialog.DO_NOTHING_ON_CLOSE);
                    retirarDinero.pack();
                    retirarDinero.setVisible(true);
                } else if (depositardinero.isSelected()) {

                    JDialog depositarDinero = new JDialog();
                    depositarDinero.setContentPane(new DepositarDinero().panel);
                    depositarDinero.setDefaultCloseOperation(JDialog.DO_NOTHING_ON_CLOSE);
                    depositarDinero.pack();
                    depositarDinero.setVisible(true);

                } else if (salir.isSelected()) {
                    JFrame frame = (JFrame) SwingUtilities.getWindowAncestor(menu);
                    frame.dispose();
                    JFrame principal = new JFrame("Ejercicios");
                    principal.setContentPane(new Verificacion().panel);
                    principal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    principal.pack();
                    principal.setVisible(true);
                }
            }
        });

    }
}
