package feb23;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.border.BevelBorder;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Dialog.ModalExclusionType;
import javax.swing.JCheckBox;

public class Home implements ActionListener  {

	private static JLabel userlabel;
	private static JTextField userText;
	private static JLabel passwordLabel;
	private static JPasswordField passwordText;
	private static JButton btnLogIn;
	private static JLabel success;
	private static JLabel lblConnectWithFriends;
	private static JLabel lblAroundYouOn;
	private static JLabel lblWelcomeToFacebook;
	private static JButton btnNewButton;
	private static JButton btnNewButton_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		JPanel panel = new JPanel();
		panel.setBackground(new Color(218, 219, 220));
		JFrame frmHttpswwwfacebookcomhomephp = new JFrame();
		frmHttpswwwfacebookcomhomephp.setTitle("https://www.facebook.com/home.php");
		frmHttpswwwfacebookcomhomephp.setModalExclusionType(ModalExclusionType.APPLICATION_EXCLUDE);
		frmHttpswwwfacebookcomhomephp.setSize(1079, 492);
		frmHttpswwwfacebookcomhomephp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmHttpswwwfacebookcomhomephp.getContentPane().add(panel);
		panel.setLayout(null);
		
		userlabel = new JLabel("Username:");
		userlabel.setBounds(590, 106, 80, 25);
		panel.add(userlabel);
		
		userText = new JTextField(20);
		userText.setBounds(694, 106, 165, 25);
		panel.add(userText);
		
		passwordLabel = new JLabel("Password:");
		passwordLabel.setBounds(590, 168, 80, 25);
		panel.add(passwordLabel);
		
		passwordText = new JPasswordField();
		passwordText.setBounds(694, 168, 165, 25);
		panel.add(passwordText);
		
		btnLogIn = new JButton("Log In");
		btnLogIn.setBackground(new Color(0, 128, 255));
		btnLogIn.setBounds(664, 278, 209, 45);
		btnLogIn.addActionListener(new Home());
		panel.add(btnLogIn);
		
		success = new JLabel("");
		success.setBounds(610, 242, 300, 25);
		panel.add(success);
		
		JLabel lblNewLabel = new JLabel("FACEBOOK");
		lblNewLabel.setForeground(new Color(0, 128, 255));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 80));
		lblNewLabel.setBounds(24, 71, 466, 102);
		panel.add(lblNewLabel);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Show Password");
		chckbxNewCheckBox.setBackground(new Color(218, 219, 220));
		chckbxNewCheckBox.setForeground(new Color(0, 0, 0));
		chckbxNewCheckBox.setBounds(590, 212, 157, 23);
		panel.add(chckbxNewCheckBox);
		
		lblConnectWithFriends = new JLabel("Connect with friends and the world");
		lblConnectWithFriends.setFont(new Font("Dialog", Font.BOLD, 21));
		lblConnectWithFriends.setBounds(34, 173, 360, 25);
		panel.add(lblConnectWithFriends);
		
		lblAroundYouOn = new JLabel("around you on Facebook.");
		lblAroundYouOn.setFont(new Font("Dialog", Font.BOLD, 21));
		lblAroundYouOn.setBounds(44, 195, 360, 25);
		panel.add(lblAroundYouOn);
		
		lblWelcomeToFacebook = new JLabel("Welcome To Facebook");
		lblWelcomeToFacebook.setHorizontalAlignment(SwingConstants.CENTER);
		lblWelcomeToFacebook.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblWelcomeToFacebook.setBounds(639, 45, 220, 25);
		panel.add(lblWelcomeToFacebook);
		
		btnNewButton = new JButton("Forgot Password?");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ForgotPassword action = new ForgotPassword();
				action.setVisible(true);
			}
		});
		btnNewButton.setBackground(new Color(0, 128, 255));
		btnNewButton.setBounds(715, 334, 119, 23);
		panel.add(btnNewButton);
		
		btnNewButton_1 = new JButton("Create new account");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				RegistrationForm Account = new  RegistrationForm();
				Account.setVisible(true);
			}
		});
		btnNewButton_1.setBackground(new Color(0, 255, 0));
		btnNewButton_1.setBounds(664, 368, 209, 45);
		panel.add(btnNewButton_1);
		chckbxNewCheckBox.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (chckbxNewCheckBox.isSelected()) {
				      passwordText.setEchoChar((char)0); //password = JPasswordField
				   } else {
					   passwordText.setEchoChar('\u25cf');
				   }
			}
		});
		frmHttpswwwfacebookcomhomephp.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		  String user = userText.getText();
		  String password = passwordText.getText(); 
		  
		  if(user.equals("Admin") && password.equals("password1")) {
			  success.setText("Login Successful!!");
		  }
		  else if
		  (user.equals("Secretary") && password.equals("password2")) {
			  success.setText("Login Successful!!");
		  }
		  else {
		  success.setText("Incorrect username and password");
		  }
	}
}
