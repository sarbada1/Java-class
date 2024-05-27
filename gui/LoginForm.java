package gui;

import javax.swing.*;
// import java.awt.event.ActionEvent;
// import java.awt.event.ActionListener;

public class LoginForm extends JFrame {
    private JPanel panel;
    private JTextField usernameField;
    private JPasswordField passwordField;
    private JLabel usernameLabel, passwordLabel, loginLabel;
    private JRadioButton isAdmin, isUser;
    private ButtonGroup userGroup;
    private JButton loginButton;

    public void initComponents() {
        panel = new JPanel();
        this.add(panel);
        panel.setLayout(null); // Absolute positioning for each component

        usernameLabel = new JLabel("Username: ");
        usernameLabel.setBounds(50, 50, 100, 30); // x, y, length, height
        panel.add(usernameLabel);
        usernameField = new JTextField(20);
        usernameField.setBounds(200, 50, 150, 30);
        panel.add(usernameField);

        passwordLabel = new JLabel("Password: ");
        passwordLabel.setBounds(50, 100, 100, 30); // x, y, length, height
        panel.add(passwordLabel);
        passwordField = new JPasswordField(20);
        passwordField.setBounds(200, 100, 150, 30);
        panel.add(passwordField);

        loginLabel = new JLabel("Login user as: ");
        loginLabel.setBounds(50, 150, 100, 30); // x, y, length, height
        panel.add(loginLabel);

        isAdmin = new JRadioButton("Admin");
        isAdmin.setBounds(200, 150, 70, 30);
        panel.add(isAdmin);

        isUser = new JRadioButton("User");
        isUser.setBounds(300, 150, 70, 30);
        panel.add(isUser);

        // Add radio buttons to the same button group
        userGroup = new ButtonGroup();
        userGroup.add(isAdmin);
        userGroup.add(isUser);

        loginButton = new JButton("Login");
        loginButton.setBounds(150, 200, 70, 30);
        panel.add(loginButton);
    }

    LoginForm() {
        initComponents();
        setTitle("Login Form");
        setSize(400, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);

        loginButton.addActionListener(new LoginEvent());
        // loginButton.addActionListener(new ActionListener() {
        //     @Override
        //     public void actionPerformed(ActionEvent e) {
        //         String username = usernameField.getText();
        //         String password = new String(passwordField.getPassword()); // Get password as string
        //      if(username.equals("admin") && password.equals("admin123"))
        //      {
        //         JOptionPane.showMessageDialog(null,"Login successfull");
        //         panel.removeAll();
        //         JLabel lable=new JLabel("Welcome user " + username);
        //         lable.setBounds(100,100,200,30);
        //         panel.add(lable);
        //         panel.revalidate();
        //         panel.repaint();
        //      }
        //      else{
        //         JOptionPane.showMessageDialog(null,"Login unsuccessfull");
        //         usernameField.setText("");
        //         passwordField.setText("");

        //      }
        //     }
        // });
    }

    public static void main(String[] args) {
        new LoginForm();
    }
}
