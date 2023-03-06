package feb23;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ForgotPassword implements ActionListener {

    private JFrame frame;
    private JPanel panel;
    private JLabel emailLabel;
    private JTextField emailField;
    private JButton resetButton;

    public ForgotPassword() {
        // Create the JFrame and set its properties
        frame = new JFrame("Forgot Password");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);
        frame.setLocationRelativeTo(null);

        // Create the JPanel and set its layout
        panel = new JPanel(new GridBagLayout());

        // Create the email label and text field
        emailLabel = new JLabel("Email:");
        emailField = new JTextField(20);

        // Create the reset button
        resetButton = new JButton("Reset Password");

        // Set the action listener for the reset button
        resetButton.addActionListener(this);

        // Add the components to the panel using GridBagConstraints
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.insets = new Insets(10, 10, 10, 10);
        gbc.anchor = GridBagConstraints.WEST;
        panel.add(emailLabel, gbc);

        gbc.gridx = 1;
        gbc.anchor = GridBagConstraints.EAST;
        panel.add(emailField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.gridwidth = 2;
        gbc.anchor = GridBagConstraints.CENTER;
        panel.add(resetButton, gbc);

        // Add the panel to the frame and make it visible
        frame.getContentPane().add(panel);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == resetButton) {
            // Get the email address entered by the user
            String email = emailField.getText();

            // Send the password reset email to the email address
            sendPasswordResetEmail(email);

            // Show a message dialog to inform the user that the password reset email has been sent
            JOptionPane.showMessageDialog(panel, "A password reset email has been sent to " + email + ".", "Password Reset", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    private void sendPasswordResetEmail(String email) {
        // Implement your code to send the password reset email here
        // You can use JavaMail API or any other email sending library to send the email
    }

    public static void main(String[] args) {
        // Create an instance of the ForgotPassword class
        ForgotPassword forgotPassword = new ForgotPassword();
    }

	public void setVisible(boolean b) {
		// TODO Auto-generated method stub
		
	}
}
