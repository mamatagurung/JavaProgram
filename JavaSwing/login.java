import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class login {

	private JFrame frame;
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					login window = new login();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public login() {
		initialize();
	}
	
	public boolean isLogin(String username, String password) {
		
		if(username.equals("national") && password.equals("college")) {
			return true;
		}
			
		return false;
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Login Form");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel.setBounds(118, 30, 113, 25);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Username");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1.setBounds(77, 76, 85, 20);
		frame.getContentPane().add(lblNewLabel_1);
		
		textField = new JTextField();  //username textfield
		textField.setBounds(170, 78, 86, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Password");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_2.setBounds(77, 107, 85, 25);
		frame.getContentPane().add(lblNewLabel_2);
		
		passwordField = new JPasswordField(); // password passwordfield
		passwordField.setBounds(169, 111, 87, 20);
		frame.getContentPane().add(passwordField);
		
		JButton btnNewButton = new JButton("Login");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String username = new String(textField.getText());
				String pass = new String(passwordField.getPassword());
				
				if(isLogin(username, pass)) {
					
					Dashboard db = new Dashboard();
					db.show();
					//JOptionPane.showConfirmDialog(null, "Username and password verified!!!");
				}else {
					JOptionPane.showConfirmDialog(null, "Username and password not matched!!");
				}
				
				//JOptionPane.showConfirmDialog(null, "username"+username+"--"+pass);
				
			}
		});
		btnNewButton.setBounds(167, 155, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("New Registration");
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Reg rg = new Reg();
				rg.show();
				 	
			}
		});
		btnNewButton_1.setBounds(156, 189, 121, 25);
		frame.getContentPane().add(btnNewButton_1);
	}
}
