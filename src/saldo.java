import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class saldo {
    JPanel ventanaSaldo;
    private JButton Button;

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
}
