import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class login {
    private JPasswordField passwordField1;
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JButton button5;
    private JButton button6;
    private JButton button7;
    private JButton button8;
    private JButton button9;
    private JButton button10;
    private JButton button11;
    JPanel ventanaLogin;

    public login() {
        passwordField1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            }
        });
        passwordField1.setEditable(false);
        ActionListener listener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JButton clickedButton = (JButton) e.getSource();
                String digit = clickedButton.getText();
                passwordField1.setText(passwordField1.getText() + digit);
            }
        };
        button1.addActionListener(listener);
        button2.addActionListener(listener);
        button3.addActionListener(listener);
        button4.addActionListener(listener);
        button5.addActionListener(listener);
        button6.addActionListener(listener);
        button7.addActionListener(listener);
        button8.addActionListener(listener);
        button9.addActionListener(listener);
        button10.addActionListener(listener);

        button11.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String password = passwordField1.getText();
                    if (!password.equals("1234")) {
                        throw new IllegalArgumentException("Contraseña incorrecta");
                    }
                    JFrame menu = new JFrame("Transacción a Realizar");
                    menu.setUndecorated(true);
                    menu.setContentPane(new menu().ventanaMenu);
                    menu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    menu.pack();
                    menu.setSize(850, 420);
                    menu.setVisible(true);
                    ((JFrame) SwingUtilities.getWindowAncestor(button1)).dispose();
                }
                catch (IllegalArgumentException ex) {
                    JOptionPane.showMessageDialog(ventanaLogin, "Contraseña Incorrecta");
                    passwordField1.setText("");
                }
            }
        });
    }
}
