import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class salir {
    JPanel ventanaSalir;
    private JButton Button;

    public salir() {
        Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame login = new JFrame("Bienvenido al Banco del Búho");
                login.setContentPane(new login().ventanaLogin);
                login.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                login.pack();
                login.setSize(850,420);
                login.setVisible(true);
                ((JFrame) SwingUtilities.getWindowAncestor(Button)).dispose();
            }
        });
    }
}
