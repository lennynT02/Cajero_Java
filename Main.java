package Prueba2B;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        JFrame principal = new JFrame("Ejercicios");
        principal.setContentPane(new Verificacion().panel);
        principal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        principal.pack();
        principal.setVisible(true);
    }
}
