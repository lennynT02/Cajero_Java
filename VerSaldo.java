package Prueba2B;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
import javax.swing.border.*;

public class VerSaldo {
    JPanel panel = new JPanel(new GridBagLayout());

    JLabel saldo = new JLabel("Saldo");
    JLabel saldoActual = new JLabel("Saldo actual"+" "+Saldo.saldo);

    JButton menu = new JButton("Menu");

    GridBagConstraints gbc = new GridBagConstraints();

    public VerSaldo() {
        panel.setPreferredSize(new Dimension(450, 600));

        // label
        saldo.setFont(new Font("Serif", Font.PLAIN, 24));
        saldo.setBorder(new MatteBorder(0, 0, 2, 0, new Color(76, 76, 76, 100)));
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 1;
        gbc.weightx = 1;
        gbc.weighty = 1;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.anchor = GridBagConstraints.NORTHWEST;
        gbc.insets = new Insets(0, 0, 40, 0);
        panel.add(saldo, gbc);

        // saldo
        saldoActual.setFont(new Font("Serif", Font.PLAIN, 40));
        gbc.gridy = 1;
        gbc.anchor = GridBagConstraints.CENTER;
        gbc.insets = new Insets(0, 0, 40, 0);
        panel.add(saldoActual, gbc);

        // boton
        gbc.gridy = 2;
        gbc.insets = new Insets(0, 0, 0, 0);
        panel.add(menu, gbc);

        menu.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JDialog frame = (JDialog) SwingUtilities.getWindowAncestor(panel);
                frame.dispose();
                
            }
        });


    }
}
