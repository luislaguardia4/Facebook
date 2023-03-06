package feb23;

import java.awt.BorderLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class ForgotPasswordPanel extends JPanel implements ActionListener {

    private JLabel emailLabel;
    private JTextField emailTextField;
    private JButton resetPasswordButton;

    public ForgotPasswordPanel() {
        // Set the panel layout
        setLayout(new BorderLayout());

        // Create the email label and text field
        emailLabel = new JLabel("Email:");
        emailTextField = new JTextField(20);

        // Create the reset password button
        resetPasswordButton = new JButton("Reset Password");

        // Set the reset password button's action listener
        resetPasswordButton.addActionListener(this);

        // Create a panel to hold the email label and text field
        JPanel emailPanel = new JPanel(new GridBagLayout());

        // Add the email label and text field to the email panel
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.anchor = GridBagConstraints.WEST;
        gbc.insets = new Insets(5, 5, 5, 5);
        gbc.gridx = 0;
        gbc.gridy = 0;
        emailPanel.add(emailLabel, gbc);

        gbc.gridx = 1;
        emailPanel.add(emailTextField, gbc);

        // Create a panel to hold the reset password button
        JPanel buttonPanel = new JPanel(new GridBagLayout());

        // Add the reset password button to the button panel
        gbc = new GridBagConstraints();
        gbc.anchor = GridBagConstraints.CENTER;
        gbc.insets = new Insets(10, 0, 0, 0);
        gbc.gridx = 0;
        gbc.gridy = 0;
        buttonPanel.add(resetPasswordButton, gbc);

        // Add the email panel and button panel to the main panel
        add(emailPanel, BorderLayout.CENTER);
        add(buttonPanel, BorderLayout.SOUTH);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == resetPasswordButton) {
            // Get the email address entered by the user
            String email = emailTextField.getText();

            // Send the password reset email to the email address
            sendPasswordResetEmail(email);

            // Show a message dialog to inform the user that the password reset email has been sent
            JOptionPane.showMessageDialog(this, "A password reset email has been sent to " + email + ".", "Password Reset", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    private void sendPasswordResetEmail(String email) {
        // Implement your code to send the password reset email here
        // You can use JavaMail API or any other email sending library to send the email
    }

    public static void main(String[] args) {
        // Create a JFrame to hold the Forgot Password panel
        JFrame frame = new JFrame("Forgot Password");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Add the Forgot Password panel to the JFrame
        ForgotPasswordPanel panel = new ForgotPasswordPanel();
        frame.getContentPane().add(panel);

        // Display the JFrame
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
