package swingex;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import java.awt.Toolkit;
import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Panel;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;
import javax.swing.border.EtchedBorder;
import javax.swing.border.MatteBorder;

public class LabelDemo implements ActionListener {
	
	private static JFrame laguardia_gamboa;
	private static JPanel panel;
	private static JLabel lblNewLabel;
	private static JLabel userLabel;
	private static JTextField userText;
	private static JLabel passwordLabel;
	private static JPasswordField passwordText;
	private static JButton btnLogIn;
	private static JLabel frame;
	private static JButton btnForgotPass;
	private static JButton btnNewAccount;
	private static JLabel lblNewLabel_2;
	private static JLabel lblNewLabel_3;
	private static Panel panel_1;
	private static Panel panel_2;
	private static JRadioButton RDbtnShowPass;
	
	public static void main(String[] args) {

		laguardia_gamboa = new JFrame();
		laguardia_gamboa.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\L O N O V O\\Downloads\\LOGO.jpg"));
		laguardia_gamboa.setTitle("https://www.facebook.com");
		panel = new JPanel();
		panel.setBorder(null);
		panel.setBackground(new Color(233, 233, 233));
		laguardia_gamboa.setSize(1212,613);
		laguardia_gamboa.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		laguardia_gamboa.getContentPane().add(panel);
		
		panel.setLayout(null);
		
		lblNewLabel = new JLabel("facebook");
		lblNewLabel.setForeground(new Color(0, 128, 255));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 80));
		lblNewLabel.setBackground(new Color(238, 238, 238));
		lblNewLabel.setBounds(75, 130, 441, 103);
		panel.add(lblNewLabel);
		
		lblNewLabel_2 = new JLabel("Connect with friends and the world");
		lblNewLabel_2.setFont(new Font("Dialog", Font.BOLD, 21));
		lblNewLabel_2.setForeground(new Color(0, 0, 0));
		lblNewLabel_2.setBounds(75, 229, 357, 44);
		panel.add(lblNewLabel_2);
		
		lblNewLabel_3 = new JLabel("around you on Facebook.");
		lblNewLabel_3.setForeground(new Color(0, 0, 0));
		lblNewLabel_3.setFont(new Font("Dialog", Font.BOLD, 21));
		lblNewLabel_3.setBounds(75, 263, 280, 35);
		panel.add(lblNewLabel_3);
		
		panel_1 = new Panel();
		panel_1.setBackground(new Color(255, 255, 255));
		panel_1.setBounds(699, 46, 357, 437);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		userLabel = new JLabel("username:");
		userLabel.setBounds(29, 12, 92, 18);
		panel_1.add(userLabel);
		userLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		
		userText = new JTextField(20);
		userText.setBounds(29, 38, 285, 44);
		panel_1.add(userText);
		userText.setForeground(new Color(0, 0, 0));
		userText.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		passwordText = new JPasswordField();
		passwordText.setBounds(29, 129, 285, 44);
		panel_1.add(passwordText);
		passwordText.setFont(new Font("Tahoma", Font.PLAIN, 15));
		passwordText.setForeground(new Color(0, 0, 0));
		
		passwordLabel = new JLabel("password:");
		passwordLabel.setBounds(29, 94, 92, 36);
		panel_1.add(passwordLabel);
		passwordLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		
		RDbtnShowPass = new JRadioButton("");
		RDbtnShowPass.setBounds(322, 137, 21, 24);
		panel_1.add(RDbtnShowPass);
		RDbtnShowPass.setForeground(new Color(0, 0, 0));
		RDbtnShowPass.setBackground(new Color(255, 255, 255));
		
		btnLogIn = new JButton("Log In");
		btnLogIn.setBounds(29, 197, 285, 53);
		panel_1.add(btnLogIn);
		btnLogIn.setForeground(new Color(255, 255, 255));
		btnLogIn.setBackground(new Color(0, 128, 255));
		btnLogIn.setFont(new Font("Tahoma", Font.PLAIN, 23));
		
		btnForgotPass = new JButton("forgot password?");
		btnForgotPass.setBounds(103, 274, 156, 26);
		panel_1.add(btnForgotPass);
		btnForgotPass.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			newpass pass = new newpass();
			pass.setVisible(true);
			
			}
		});
		btnForgotPass.setBackground(new Color(255, 255, 255));
		btnForgotPass.setForeground(new Color(0, 128, 255));
		btnForgotPass.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		btnNewAccount = new JButton("Create new account");
		btnNewAccount.setBounds(52, 350, 253, 53);
		panel_1.add(btnNewAccount);
		btnNewAccount.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				create acc = new create();
				acc.setVisible(true);
				
			}
		});
		btnNewAccount.setBackground(new Color(0, 255, 128));
		btnNewAccount.setForeground(new Color(255, 255, 255));
		btnNewAccount.setFont(new Font("Tahoma", Font.BOLD, 17));
		
		panel_2 = new Panel();
		panel_2.setBackground(new Color(192, 192, 192));
		panel_2.setBounds(0, 319, 357, 2);
		panel_1.add(panel_2);
		btnLogIn.addActionListener(new LabelDemo());
		RDbtnShowPass.addMouseListener(new MouseAdapter() {
		
			public void mouseClicked(MouseEvent e) {
			if (RDbtnShowPass.isSelected()) {
				passwordText.setEchoChar((char)0);
			} else {
				passwordText.setEchoChar('\u25cf');
			}
			
		}
			});
		
		laguardia_gamboa.setVisible(true);
		
	}

	public void actionPerformed(ActionEvent e) {
		String user = userText.getText();
		String password = passwordText.getText();
		System.out.println(user + ", " + password);
		

		if(user.equals("laguardia") &&  password.equals("luis123")) {
			
			success next = new success();
			next.setVisible(true);
			dispose();
			

		}
		else if(user.equals("gamboa") &&  password.equals("earl123")) {
			success next = new success();
			next.setVisible(true);
			dispose();
	
		
		} else {
			JOptionPane.showMessageDialog(frame, "INVALID USERNAME AND PASSWORD!");

		}
		
		
	}

	private void dispose() {

	}	
}
