package feb23;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class RegistrationForm extends JFrame {
   // Create labels, text fields, and buttons
   private JLabel nameLabel = new JLabel("Name:");
   private JTextField nameTextField = new JTextField();
   private JLabel emailLabel = new JLabel("Email:");
   private JTextField emailTextField = new JTextField();
   private JLabel passwordLabel = new JLabel("Password:");
   private JPasswordField passwordField = new JPasswordField();
   private JButton registerButton = new JButton("Register");
   private final JLabel lblNewLabel = new JLabel("REGISTER TO FACEBOOK");

   public RegistrationForm() {
   	getContentPane().setBackground(new Color(0, 128, 255));
      // Set window properties
      setTitle("https://www.facebook.com/home.php");
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setSize(680, 479);
      setLocationRelativeTo(null);
      getContentPane().setLayout(null);
      nameLabel.setBounds(221, 131, 61, 20);

      // Add components to the window
      getContentPane().add(nameLabel);
      nameTextField.setBounds(292, 130, 214, 23);
      getContentPane().add(nameTextField);
      emailLabel.setBounds(221, 173, 94, 23);
      getContentPane().add(emailLabel);
      emailTextField.setBounds(292, 173, 214, 23);
      getContentPane().add(emailTextField);
      passwordLabel.setBounds(221, 207, 76, 31);
      getContentPane().add(passwordLabel);
      passwordField.setBounds(292, 211, 214, 23);
      getContentPane().add(passwordField);
      JLabel label = new JLabel("");
      label.setBounds(0, 330, 478, 110);
      getContentPane().add(label);
      registerButton.setBounds(292, 280, 121, 23);
      getContentPane().add(registerButton);
      lblNewLabel.setBounds(154, 11, 395, 57);
      lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 30));
      
      getContentPane().add(lblNewLabel);

      // Add action listener to the register button
      registerButton.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            // Get user input
            String name = nameTextField.getText();
            String email = emailTextField.getText();
            String password = new String(passwordField.getPassword());

            // Perform validation and registration logic
            if (name.isEmpty() || email.isEmpty() || password.isEmpty()) {
               JOptionPane.showMessageDialog(null, "Please fill out all fields.");
            } else {
               JOptionPane.showMessageDialog(null, "Registration successful.");
            }
         }
      });
   }

   public static void main(String[] args) {
      // Create and show the window
      RegistrationForm registrationForm = new RegistrationForm();
      registrationForm.setVisible(true);
   }
}
