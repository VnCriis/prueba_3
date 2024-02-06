import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class saldo {
    JPanel ventanaSaldo;
    private JButton Button;
    private JLabel saldoLabel;

    // Variable para almacenar el saldo actual
    private static double saldo = 200; // Ejemplo: Saldo inicial de 200 dólares
    public saldo() {

        Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame menu = new JFrame("Transacción a Realizar");
                menu.setContentPane(new menu().ventanaMenu);
                menu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                menu.pack();
                menu.setSize(850, 420);
                menu.setVisible(true);
                ((JFrame) SwingUtilities.getWindowAncestor(Button)).dispose();
            }
        });
    }
    public static double getSaldo() {
        return saldo;
    }
    public static void actualizarSaldo(double nuevoSaldo) {
        saldo = nuevoSaldo;

    }
}
