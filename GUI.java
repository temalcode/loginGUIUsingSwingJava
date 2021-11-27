package loginGUIUsingSwingJava;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI extends JFrame implements ActionListener {
    JFrame frame = new JFrame();
    JTextField usernameField = new JTextField();
    JPasswordField passwordField = new JPasswordField();
    JButton login = new JButton();
    JLabel user = new JLabel();
    JLabel passwordtext = new JLabel();
    JLabel success = new JLabel();

    GUI() {
        user.setBounds(10, 20, 80, 25);
        user.setText("Username");
        usernameField.setBounds(100, 20, 165, 25);

        passwordtext.setBounds(10, 50, 80, 25);
        passwordtext.setText("Password");
        passwordField.setBounds(100, 50, 165, 25);

        login.setBounds(10, 80, 80, 25);
        login.setText("Login");
        login.addActionListener(this);

        success.setText("Login Successful !");
        success.setBounds(10, 115, 120, 25);
        success.setVisible(false);

        frame.setSize(350, 200);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(usernameField);
        frame.add(passwordField);
        frame.add(login);
        frame.add(user);
        frame.add(passwordtext);
        frame.add(success);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        String username = usernameField.getText();
        String password = passwordField.getText();
        System.out.println("username: " + username + "  " + "password: " + password);

        if (username.equals("user") && password.equals("1234")) {
            success.setVisible(true);
        } else {
            success.setVisible(false);
        }
    }
}
