import java.awt.*;
import java.awt.event.*;
import java.sql.SQLException;

import javax.swing.*;
import javax.swing.border.*;

import Database.DatabaseConnector;
import Utils.Common;

public class HomePage extends JFrame implements ActionListener{

	private JMenuItem item1 = new JMenuItem("Drip Coffee");
	private JMenuItem item2 = new JMenuItem("Frappe");
	private JMenuItem item3 = new JMenuItem("Iced Coffee");
	private JMenuItem item4 = new JMenuItem("Tea");
	private JMenuItem item5 = new JMenuItem("Sandwich");
	private JMenuItem item6 = new JMenuItem("Dessert");
	private JMenuItem item7 = new JMenuItem("Login");
	private JMenuItem item8 = new JMenuItem("Sign Up");
	private static DatabaseConnector database;

	HomePage(){
		getContentPane().setBackground(SystemColor.info);
		
		setTitle("Coffee Shop");
		setBounds(100, 100, 1024, 768);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		getContentPane().setLayout(null);
		setResizable(false);
			
		JLabel lblCoffeeShop = new JLabel("COFFEE SHOP");
		lblCoffeeShop.setFont(new Font("Yu Gothic", Font.PLAIN, 75));
		lblCoffeeShop.setForeground(Color.WHITE);
		lblCoffeeShop.setBounds(240, 237, 594, 132);
		getContentPane().add(lblCoffeeShop);
		
		JLabel lblCover = new JLabel("cover");
		lblCover.setForeground(new Color(255, 255, 255));
		lblCover.setBounds(-6, 86, 1030, 475);
		getContentPane().add(lblCover);
		lblCover.setIcon(new ImageIcon("src//image//aromacoffee.jpg"));
		
		JMenuBar Drinks = new JMenuBar();
		Drinks.setBackground(SystemColor.info);
		Drinks.setFont(new Font("Yu Gothic", Font.BOLD, 18));
		JMenu menuDrink = new JMenu("Drinks");
		Drinks.setBounds(90, 54, 50, 26);
		getContentPane().add(Drinks);
		Drinks.add(menuDrink);		
		
		JMenuBar Foods = new JMenuBar();
		Foods.setBackground(SystemColor.info);
		Foods.setFont(new Font("Yu Gothic", Font.BOLD, 18));
		JMenu menuFood = new JMenu("Foods");
		Foods.setBounds(148, 54, 50, 26);
		getContentPane().add(Foods);
		Foods.add(menuFood);
		
		JMenuBar Login = new JMenuBar();
		Login.setBackground(SystemColor.info);
		Login.setFont(new Font("Yu Gothic", Font.BOLD, 18));
		JMenu menuLogin = new JMenu("Login");
		Login.setBounds(920, 37, 70, 30);
		getContentPane().add(Login);
		Login.add(menuLogin);
		ImageIcon lblLoginIcon = new ImageIcon("src//image//loginicon.png");
		menuLogin.setIcon(lblLoginIcon);
		
		menuDrink.add(item1);
		menuDrink.add(item2);
		menuDrink.add(item3);
		menuDrink.add(item4);
		menuFood.add(item5);
		menuFood.add(item6);
		menuLogin.add(item7);
		menuLogin.add(item8);
		
		item1.setBackground(SystemColor.info);
		item2.setBackground(SystemColor.info);
		item3.setBackground(SystemColor.info);
		item4.setBackground(SystemColor.info);
		item5.setBackground(SystemColor.info);
		item6.setBackground(SystemColor.info);
		item7.setBackground(SystemColor.info);
		item8.setBackground(SystemColor.info);
		
		JLabel lblLogo = new JLabel("");
		lblLogo.setIcon(new ImageIcon("src//image//logo2.jpg"));
		lblLogo.setBounds(11, 13, 70, 67);
		getContentPane().add(lblLogo);
		
		JLabel lblCoffeeQuotes = new JLabel("\"The smell of fresh-made coffee is one of the greatest inventions.\" ");
		lblCoffeeQuotes.setFont(new Font("Yu Gothic", Font.BOLD, 17));
		lblCoffeeQuotes.setBounds(257, 597, 563, 95);
		getContentPane().add(lblCoffeeQuotes);		
		
		JLabel lblNewLabel = new JLabel("Hugh Jackman");
		lblNewLabel.setFont(new Font("Yu Gothic", Font.BOLD, 17));
		lblNewLabel.setBounds(679, 664, 122, 26);
		getContentPane().add(lblNewLabel);
		
		item1.addActionListener(this);
		item2.addActionListener(this);
		item3.addActionListener(this);
		item4.addActionListener(this);
		item5.addActionListener(this);
		item6.addActionListener(this);
		item7.addActionListener(this);
		item8.addActionListener(this);
		
		setVisible(true);
				
	}
	
	public void actionPerformed(ActionEvent action){
		
		if(action.getSource() == item1){
			new DripCoffee();
			dispose();
		}
		else if(action.getSource() == item2){
			new Frappe();
			dispose();
		}
		else if(action.getSource() == item3){
			new IcedCoffee();
			dispose();
		}
		else if(action.getSource() == item4){
			new Tea();
			dispose();
		}
		else if(action.getSource() == item5){
			new Sandwich();
			dispose();
		}
		else if(action.getSource() == item6){
			new Dessert();
			dispose();
		}
		else if(action.getSource() == item7){
			new LoginPage();
			dispose();
		}
		else if(action.getSource() == item8){
			new SignUpPage();
			dispose();
		}
		
	}
	
	public static void main(String[] args) {
		
		HomePage homePage = new HomePage();
		try {
			database = new DatabaseConnector();
			database.getConnection(true);
			Common.connector = database;
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}