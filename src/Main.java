import javax.swing.*;

public class Main{
    public static void main(String [] args){
        JFrame login = new JFrame("Bienvenido al Banco del Búho");
        login.setContentPane(new login().ventanaLogin);
        login.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        login.pack();
        login.setSize(850,420);
        login.setVisible(true);
    }
}