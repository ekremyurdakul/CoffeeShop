import javax.swing.*;

import Database.DatabaseConnector;
import Utils.AppLogger;
import Utils.Common;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

public class LoginPage extends JFrame{

	private JTextField Username;
	private JTextField Password;
	private DatabaseConnector connector;

	LoginPage(){
		
		getContentPane().setBackground(SystemColor.info);
		setTitle("Login");
		setBounds(100, 100, 1024, 768);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		getContentPane().setLayout(null);
		setResizable(false);
		
		JLabel lblLogo2 = new JLabel("");
		lblLogo2.setIcon(new ImageIcon("src//image//logo2.jpg"));
		lblLogo2.setBounds(338, 130, 70, 70);
		getContentPane().add(lblLogo2);
		
		JLabel lblLogin = new JLabel("Login to Coffee Shop");
		lblLogin.setFont(new Font("Yu Gothic", Font.BOLD, 18));
		lblLogin.setBounds(420, 129, 229, 71);
		getContentPane().add(lblLogin);
		
		JLabel lblUsername = new JLabel("Username:");
		lblUsername.setFont(new Font("Yu Gothic", Font.BOLD, 15));
		lblUsername.setBounds(338, 239, 95, 25);
		getContentPane().add(lblUsername);
		
		Username = new JTextField();
		Username.setFont(new Font("Yu Gothic", Font.PLAIN, 13));
		Username.setBounds(338, 270, 276, 22);
		getContentPane().add(Username);
		Username.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Password:");
		lblNewLabel.setFont(new Font("Yu Gothic", Font.BOLD, 15));
		lblNewLabel.setBounds(338, 305, 95, 16);
		getContentPane().add(lblNewLabel);
		
		Password = new JTextField();
		Password.setBounds(338, 336, 276, 22);
		getContentPane().add(Password);
		Password.setColumns(10);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.setBackground(SystemColor.info);
		btnLogin.setFont(new Font("Yu Gothic", Font.BOLD, 14));
		btnLogin.setBounds(500, 402, 114, 25);
		getContentPane().add(btnLogin);
		
		btnLogin.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				String username = Username.getText();
				String password = Password.getText();
				
				try {
					connector = new DatabaseConnector();
					boolean exist = connector.login(username, password);
					if(exist) {
						AppLogger.setLog("User Succesfully Logged In");
						JOptionPane.showMessageDialog(null, "Succesfully Logged In");
					} else {
						JOptionPane.showMessageDialog(null, "Succesfully Logged In");
					}
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
			
		});
		
		setVisible(true);
	}

}
