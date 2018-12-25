import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Sandwich extends JFrame implements ActionListener{
	
	private JButton btnGoBack = new JButton("Go Back to Home");
	private JButton btnShoppingCart = new JButton("Shopping Cart");
	private JMenuItem item1 = new JMenuItem("Drip Coffee");
	private JMenuItem item2 = new JMenuItem("Frappe");
	private JMenuItem item3 = new JMenuItem("Iced Coffee");
	private JMenuItem item4 = new JMenuItem("Tea");
	private JMenuItem item5 = new JMenuItem("Sandwich");
	private JMenuItem item6 = new JMenuItem("Dessert");

	Sandwich(){
		
		getContentPane().setBackground(SystemColor.info);
		setTitle("Sandwich");
		setBounds(100, 100, 1024, 768);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		getContentPane().setLayout(null);
		setResizable(false);
		
		JLabel lblSandwich = new JLabel("SANDWICH");
		lblSandwich.setForeground(SystemColor.info);
		lblSandwich.setFont(new Font("Yu Gothic", Font.PLAIN, 75));
		lblSandwich.setBounds(300, 237, 407, 132);
		getContentPane().add(lblSandwich);
		
		JLabel lblSandwichCover = new JLabel("");
		lblSandwichCover.setIcon(new ImageIcon("C:\\Users\\ASUS PC\\Desktop\\CoffeeShop\\image\\sandwichCover.jpg"));
		lblSandwichCover.setBounds(-6, 86, 1017, 391);
		getContentPane().add(lblSandwichCover);
		
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
		
		JLabel imgCheeseSandwich = new JLabel("");
		imgCheeseSandwich.setIcon(new ImageIcon("C:\\Users\\ASUS PC\\Desktop\\CoffeeShop\\image\\cheesesandwich.png"));
		imgCheeseSandwich.setBounds(73, 523, 143, 137);
		getContentPane().add(imgCheeseSandwich);
			
		JLabel imgChickenSandwich = new JLabel("");
		imgChickenSandwich.setIcon(new ImageIcon("C:\\Users\\ASUS PC\\Desktop\\CoffeeShop\\image\\chickensandwich.jpg"));
		imgChickenSandwich.setBounds(270, 523, 143, 137);
		getContentPane().add(imgChickenSandwich);
		
		JLabel imgDelightSandwich = new JLabel("");
		imgDelightSandwich.setIcon(new ImageIcon("C:\\Users\\ASUS PC\\Desktop\\CoffeeShop\\image\\sandwich1.jpg"));
		imgDelightSandwich.setBounds(461, 523, 143, 137);
		getContentPane().add(imgDelightSandwich);
				
		btnGoBack.setBackground(SystemColor.info);
		btnGoBack.setFont(new Font("Yu Gothic", Font.BOLD, 13));
		btnGoBack.setBounds(800, 675, 170, 25);
		getContentPane().add(btnGoBack);
		ImageIcon lblGoBackIcon = new ImageIcon("C:\\Users\\ASUS PC\\Desktop\\CoffeeShop\\image\\Undo.png");
		btnGoBack.setIcon(lblGoBackIcon);
		
		JLabel lblCheeseSandwich = new JLabel("Cheese Sandwich");
		lblCheeseSandwich.setFont(new Font("Yu Gothic", Font.BOLD, 15));
		lblCheeseSandwich.setBounds(73, 670, 143, 23);
		getContentPane().add(lblCheeseSandwich);
		
		JLabel lblChickenSandwich= new JLabel("Chicken Sandwich");
		lblChickenSandwich.setFont(new Font("Yu Gothic", Font.BOLD, 15));
		lblChickenSandwich.setBounds(270, 670, 143, 23);
		getContentPane().add(lblChickenSandwich);
		
		JLabel lblDelightSandwich = new JLabel("Delight Sandwich");
		lblDelightSandwich.setFont(new Font("Yu Gothic", Font.BOLD, 15));
		lblDelightSandwich.setBounds(461, 670, 143, 23);
		getContentPane().add(lblDelightSandwich);
		
		JButton btnCheeseAddCart = new JButton("");
		btnCheeseAddCart.setIcon(new ImageIcon("C:\\Users\\ASUS PC\\Desktop\\CoffeeShop\\image\\addcart2.jpg"));
		btnCheeseAddCart.setBounds(211, 685, 26, 23);
		getContentPane().add(btnCheeseAddCart);
		
		JButton btnChickenAddCart = new JButton("");
		btnChickenAddCart.setIcon(new ImageIcon("C:\\Users\\ASUS PC\\Desktop\\CoffeeShop\\image\\addcart2.jpg"));
		btnChickenAddCart.setBounds(410, 685, 26, 23);
		getContentPane().add(btnChickenAddCart);
		
		JButton btnDelightAddCart = new JButton("");
		btnDelightAddCart.setIcon(new ImageIcon("C:\\Users\\ASUS PC\\Desktop\\CoffeeShop\\image\\addcart2.jpg"));
		btnDelightAddCart.setBounds(592, 685, 26, 23);
		getContentPane().add(btnDelightAddCart);
		
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
		
		Tea tea = new Tea();
	}


}

