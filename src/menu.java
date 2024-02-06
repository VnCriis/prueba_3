import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class menu {
    JPanel ventanaMenu;
    private JRadioButton RadioButton1;
    private JRadioButton RadioButton2;
    private JRadioButton RadioButton3;
    private JRadioButton RadioButton4;

    public menu() {
        RadioButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(ventanaMenu, "Dirigiendose a la pantalla..");
                JFrame saldo = new JFrame("Saldo");
                saldo.setUndecorated(true);
                saldo.setContentPane(new saldo().ventanaSaldo);
                saldo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                saldo.pack();
                saldo.setSize(850,420);
                saldo.setVisible(true);
                ((JFrame) SwingUtilities.getWindowAncestor(RadioButton1)).dispose();
            }
        });
        RadioButton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Mensaje de confirmacion
                JOptionPane.showMessageDialog(ventanaMenu, "Dirigiendose a la pantalla..");
                JFrame retiro = new JFrame("Retiro");
                retiro.setUndecorated(true);
                retiro.setContentPane(new retiro().ventanaRetiro);
                retiro.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                retiro.pack();
                retiro.setSize(850,420);
                retiro.setVisible(true);
                ((JFrame) SwingUtilities.getWindowAncestor(RadioButton2)).dispose();
            }
        });
        RadioButton3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(ventanaMenu, "Dirigiendose a la pantalla..");
                JFrame deposito = new JFrame("Depósito");
                deposito.setUndecorated(true);
                deposito.setContentPane(new deposito().ventanaDeposito);
                deposito.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                deposito.pack();
                deposito.setSize(850,420);
                deposito.setVisible(true);
                ((JFrame) SwingUtilities.getWindowAncestor(RadioButton3)).dispose();
            }
        });
        RadioButton4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame salir = new JFrame("Muchas gracias..!");
                salir.setContentPane(new salir().ventanaSalir);
                salir.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                salir.pack();
                salir.setSize(250,300);
                salir.setVisible(true);
                ((JFrame) SwingUtilities.getWindowAncestor(RadioButton1)).dispose();
            }
        });
    }
}
