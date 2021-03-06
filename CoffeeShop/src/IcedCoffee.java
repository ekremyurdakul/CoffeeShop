import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class IcedCoffee extends JFrame implements ActionListener{
	
	private JButton btnGoBack = new JButton("Go Back to Home");
	private JButton btnShoppingCart = new JButton("Shopping Cart");
	private JMenuItem item1 = new JMenuItem("Drip Coffee");
	private JMenuItem item2 = new JMenuItem("Frappe");
	private JMenuItem item3 = new JMenuItem("Iced Coffee");
	private JMenuItem item4 = new JMenuItem("Tea");
	private JMenuItem item5 = new JMenuItem("Sandwich");
	private JMenuItem item6 = new JMenuItem("Dessert");

	IcedCoffee(){
		
		getContentPane().setBackground(SystemColor.info);
		setTitle("Iced Coffee");
		setBounds(100, 100, 1024, 768);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		getContentPane().setLayout(null);
		setResizable(false);
		
		JLabel lblIcedCoffee = new JLabel("ICED COFFEE");
		lblIcedCoffee.setForeground(SystemColor.info);
		lblIcedCoffee.setFont(new Font("Yu Gothic", Font.PLAIN, 75));
		lblIcedCoffee.setBounds(290, 237, 520, 132);
		getContentPane().add(lblIcedCoffee);
		
		JLabel lblIcedCover = new JLabel("");
		lblIcedCover.setIcon(new ImageIcon("C:\\Users\\ASUS PC\\Desktop\\CoffeeShop\\image\\IcedCover.jpg"));
		lblIcedCover.setBounds(-6, 86, 1017, 391);
		getContentPane().add(lblIcedCover);
		
		JLabel lblLogo = new JLabel("");
		lblLogo.setIcon(new ImageIcon("C:\\Users\\ASUS PC\\Desktop\\CoffeeShop\\image\\logo2.jpg"));
		lblLogo.setBounds(11, 13, 70, 67);
		getContentPane().add(lblLogo);
		
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
		
		menuDrink.add(item1);
		menuDrink.add(item2);
		menuDrink.add(item3);
		menuDrink.add(item4);
		menuFood.add(item5);
		menuFood.add(item6);
		
		item1.setBackground(SystemColor.info);
		item2.setBackground(SystemColor.info);
		item3.setBackground(SystemColor.info);
		item4.setBackground(SystemColor.info);
		item5.setBackground(SystemColor.info);
		item6.setBackground(SystemColor.info);
		
		JLabel imgIcedAmericano = new JLabel("");
		imgIcedAmericano.setIcon(new ImageIcon("C:\\Users\\ASUS PC\\Desktop\\CoffeeShop\\image\\IcedAmericano.jpg"));
		imgIcedAmericano.setBounds(73, 523, 143, 137);
		getContentPane().add(imgIcedAmericano);
			
		JLabel imgIcedMocha = new JLabel("");
		imgIcedMocha.setIcon(new ImageIcon("C:\\Users\\ASUS PC\\Desktop\\CoffeeShop\\image\\IcedMocha.jpg"));
		imgIcedMocha.setBounds(249, 523, 143, 140);
		getContentPane().add(imgIcedMocha);
		
		JLabel imgColdBrew = new JLabel("");
		imgColdBrew.setIcon(new ImageIcon("C:\\Users\\ASUS PC\\Desktop\\CoffeeShop\\image\\coldbrew.jpg"));
		imgColdBrew.setBounds(415, 523, 143, 140);
		getContentPane().add(imgColdBrew);
		
		JLabel imgIcedCaramel = new JLabel("");
		imgIcedCaramel.setIcon(new ImageIcon("C:\\Users\\ASUS PC\\Desktop\\CoffeeShop\\image\\IcedCaramelMacchiato.jpg"));
		imgIcedCaramel.setBounds(583, 523, 143, 140);
		getContentPane().add(imgIcedCaramel);
		
		btnGoBack.setBackground(SystemColor.info);
		btnGoBack.setFont(new Font("Yu Gothic", Font.BOLD, 13));
		btnGoBack.setBounds(800, 675, 170, 25);
		getContentPane().add(btnGoBack);
		ImageIcon lblGoBackIcon = new ImageIcon("C:\\Users\\ASUS PC\\Desktop\\CoffeeShop\\image\\Undo.png");
		btnGoBack.setIcon(lblGoBackIcon);
		
		JLabel lblIcedAmericano = new JLabel("Iced Americano");
		lblIcedAmericano.setFont(new Font("Yu Gothic", Font.BOLD, 15));
		lblIcedAmericano.setBounds(73, 670, 143, 23);
		getContentPane().add(lblIcedAmericano);
		
		JLabel lblIcedMocha = new JLabel("Iced Mocha");
		lblIcedMocha.setFont(new Font("Yu Gothic", Font.BOLD, 15));
		lblIcedMocha.setBounds(249, 670, 143, 23);
		getContentPane().add(lblIcedMocha);
		
		JLabel lblColdBrew = new JLabel("Cold Brew");
		lblColdBrew.setFont(new Font("Yu Gothic", Font.BOLD, 15));
		lblColdBrew.setBounds(415, 670, 143, 23);
		getContentPane().add(lblColdBrew);
				
		JLabel lblIcedCaramel = new JLabel("Iced Caramel Macchiato");
		lblIcedCaramel.setFont(new Font("Yu Gothic", Font.BOLD, 15));
		lblIcedCaramel.setBounds(583, 667, 177, 30);
		getContentPane().add(lblIcedCaramel);
		
		JButton btnAmericanoAddCart = new JButton("");
		btnAmericanoAddCart.setIcon(new ImageIcon("C:\\Users\\ASUS PC\\Desktop\\CoffeeShop\\image\\addcart2.jpg"));
		btnAmericanoAddCart.setBounds(190, 685, 26, 23);
		getContentPane().add(btnAmericanoAddCart);
		
		JButton btnIcedMochaAddCart = new JButton("");
		btnIcedMochaAddCart.setIcon(new ImageIcon("C:\\Users\\ASUS PC\\Desktop\\CoffeeShop\\image\\addcart2.jpg"));
		btnIcedMochaAddCart.setBounds(365, 685, 26, 23);
		getContentPane().add(btnIcedMochaAddCart);
		
		JButton btnBrewAddCart = new JButton("");
		btnBrewAddCart.setIcon(new ImageIcon("C:\\Users\\ASUS PC\\Desktop\\CoffeeShop\\image\\addcart2.jpg"));
		btnBrewAddCart.setBounds(533, 685, 26, 23);
		getContentPane().add(btnBrewAddCart);
		
		JButton btnCaramelAddCart = new JButton("");
		btnCaramelAddCart.setIcon(new ImageIcon("C:\\Users\\ASUS PC\\Desktop\\CoffeeShop\\image\\addcart2.jpg"));
		btnCaramelAddCart.setBounds(762, 685, 26, 23);
		getContentPane().add(btnCaramelAddCart);
		
		btnShoppingCart.setBackground(SystemColor.info);
		btnShoppingCart.setFont(new Font("Yu Gothic", Font.BOLD, 13));
		btnShoppingCart.setBounds(836, 24, 170, 39);
		getContentPane().add(btnShoppingCart);
		ImageIcon lblShoppingCartIcon = new ImageIcon("C:\\Users\\ASUS PC\\Desktop\\CoffeeShop\\image\\addcart2.jpg");
		btnShoppingCart.setIcon(lblShoppingCartIcon);
		
		item1.addActionListener(this);
		item2.addActionListener(this);
		item3.addActionListener(this);
		item4.addActionListener(this);
		item5.addActionListener(this);
		item6.addActionListener(this);
		btnGoBack.addActionListener(this);
		btnShoppingCart.addActionListener(this);
		
		setVisible(true);
	}
	
	public void actionPerformed(ActionEvent action){
		
		if(action.getSource() == btnGoBack){
			new HomePage();
			dispose();
		}
		else if(action.getSource() == item1){
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
		else if(action.getSource() == btnShoppingCart){
			new ShoppingCart();
			dispose();
		}
	}
	public static void main(String[] args) {
		
		IcedCoffee icedcoffee = new IcedCoffee();
	}


}
