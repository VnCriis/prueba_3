import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class retiro {
    JPanel ventanaRetiro;
    private JTextField textField1;
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
    private JButton Button;

    public retiro() {
        textField1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        textField1.setEditable(false);
        ActionListener listener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JButton clickedButton = (JButton) e.getSource();
                String digit = clickedButton.getText();
                textField1.setText(textField1.getText() + digit);
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

            }
        });
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
