package gui;

import javax.swing.*;

public class RegisterForm extends JFrame {
    private JPanel panel;
    private JTextField usernameField, emailField, ageField, phoneNumberField;
    private JPasswordField passwordField, confirmPasswordField;
    private JLabel usernameLabel, emailLabel, ageLabel, phoneNumberLabel, passwordLabel, confirmPasswordLabel, userTypeLabel;
    private JButton registerButton;
    // private JCheckBox isAdminCheckbox;

    public void initComponents(){
        panel = new JPanel();
        this.add(panel);
        panel.setLayout(null); // Absolute positioning for components

        // Username field
        usernameLabel = new JLabel("Username: ");
        usernameLabel.setBounds(50, 50, 100, 30);
        panel.add(usernameLabel);
        usernameField = new JTextField(20);
        usernameField.setBounds(200, 50, 150, 30);
        panel.add(usernameField);

        // Email field
        emailLabel = new JLabel("Email: ");
        emailLabel.setBounds(50, 100, 100, 30);
        panel.add(emailLabel);
        emailField = new JTextField(20);
        emailField.setBounds(200, 100, 150, 30);
        panel.add(emailField);

        // Age field
        ageLabel = new JLabel("Age: ");
        ageLabel.setBounds(50, 150, 100, 30);
        panel.add(ageLabel);
        ageField = new JTextField(20);
        ageField.setBounds(200, 150, 150, 30);
        panel.add(ageField);

        // Phone number field
        phoneNumberLabel = new JLabel("Phone Number: ");
        phoneNumberLabel.setBounds(50, 200, 100, 30);
        panel.add(phoneNumberLabel);
        phoneNumberField = new JTextField(20);
        phoneNumberField.setBounds(200, 200, 150, 30);
        panel.add(phoneNumberField);

        // Password field
        passwordLabel = new JLabel("Password: ");
        passwordLabel.setBounds(50, 250, 100, 30);
        panel.add(passwordLabel);
        passwordField = new JPasswordField(20);
        passwordField.setBounds(200, 250, 150, 30);
        panel.add(passwordField);

        // Confirm Password field
        confirmPasswordLabel = new JLabel("Confirm Password: ");
        confirmPasswordLabel.setBounds(50, 300, 150, 30);
        panel.add(confirmPasswordLabel);
        confirmPasswordField = new JPasswordField(20);
        confirmPasswordField.setBounds(200, 300, 150, 30);
        panel.add(confirmPasswordField);

        // User type selection
        userTypeLabel = new JLabel("User Type: ");
        userTypeLabel.setBounds(50, 350, 100, 30);
        panel.add(userTypeLabel);
        String[] userTypes = {"Admin", "User"};
        JComboBox<String> userTypeComboBox = new JComboBox<>(userTypes);
        userTypeComboBox.setBounds(200, 350, 150, 30);
        panel.add(userTypeComboBox);

        // Register button
        registerButton = new JButton("Register");
        registerButton.setBounds(150, 400, 100, 30);
        panel.add(registerButton);
    }

    RegisterForm()
    {
        initComponents();
        setTitle("Register Form");
        setSize(400, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new RegisterForm();
    }
}
