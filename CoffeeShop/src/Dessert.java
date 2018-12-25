import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Dessert extends JFrame implements ActionListener{
	
	private JButton btnGoBack = new JButton("Go Back to Home");
	private JButton btnShoppingCart = new JButton("Shopping Cart");
	private JMenuItem item1 = new JMenuItem("Drip Coffee");
	private JMenuItem item2 = new JMenuItem("Frappe");
	private JMenuItem item3 = new JMenuItem("Iced Coffee");
	private JMenuItem item4 = new JMenuItem("Tea");
	private JMenuItem item5 = new JMenuItem("Sandwich");
	private JMenuItem item6 = new JMenuItem("Dessert");

	Dessert(){
		
		getContentPane().setBackground(SystemColor.info);
		setTitle("Dessert");
		setBounds(100, 100, 1024, 768);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		getContentPane().setLayout(null);
		setResizable(false);
		
		JLabel lblDessert = new JLabel("DESSERT");
		lblDessert.setForeground(SystemColor.info);
		lblDessert.setFont(new Font("Yu Gothic", Font.PLAIN, 75));
		lblDessert.setBounds(300, 237, 374, 132);
		getContentPane().add(lblDessert);
		
		JLabel lblDessertCover = new JLabel("");
		lblDessertCover.setIcon(new ImageIcon("C:\\Users\\ASUS PC\\Desktop\\CoffeeShop\\image\\DessertCover.jpg"));
		lblDessertCover.setBounds(-6, 86, 1017, 391);
		getContentPane().add(lblDessertCover);
		
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
		
		JLabel imgCoffeeCake = new JLabel("");
		imgCoffeeCake.setIcon(new ImageIcon("C:\\Users\\ASUS PC\\Desktop\\CoffeeShop\\image\\coffeecake.jpg"));
		imgCoffeeCake.setBounds(73, 523, 143, 140);
		getContentPane().add(imgCoffeeCake);
		
		JLabel imgBrownie = new JLabel("");
		imgBrownie.setIcon(new ImageIcon("C:\\Users\\ASUS PC\\Desktop\\CoffeeShop\\image\\brownie.jpg"));
		imgBrownie.setBounds(249, 523, 143, 140);
		getContentPane().add(imgBrownie);
		
		JLabel imgRaspberryCake= new JLabel("");
		imgRaspberryCake.setIcon(new ImageIcon("C:\\Users\\ASUS PC\\Desktop\\CoffeeShop\\image\\dessert.jpg"));
		imgRaspberryCake.setBounds(415, 523, 143, 137);
		getContentPane().add(imgRaspberryCake);
		
		JLabel imgLemonCheesecake = new JLabel("");
		imgLemonCheesecake.setIcon(new ImageIcon("C:\\Users\\ASUS PC\\Desktop\\CoffeeShop\\image\\lemoncheesecake.jpg"));
		imgLemonCheesecake.setBounds(583, 523, 143, 140);
		getContentPane().add(imgLemonCheesecake);
		
		btnGoBack.setBackground(SystemColor.info);
		btnGoBack.setFont(new Font("Yu Gothic", Font.BOLD, 13));
		btnGoBack.setBounds(800, 675, 170, 25);
		getContentPane().add(btnGoBack);
		ImageIcon lblGoBackIcon = new ImageIcon("C:\\Users\\ASUS PC\\Desktop\\CoffeeShop\\image\\Undo.png");
		btnGoBack.setIcon(lblGoBackIcon);
		
		JLabel lblCoffeeCake = new JLabel("Coffee Cake");
		lblCoffeeCake.setFont(new Font("Yu Gothic", Font.BOLD, 15));
		lblCoffeeCake.setBounds(73, 670, 143, 23);
		getContentPane().add(lblCoffeeCake);
		
		JLabel lblBrownie = new JLabel("Brownie");
		lblBrownie.setFont(new Font("Yu Gothic", Font.BOLD, 15));
		lblBrownie.setBounds(249, 670, 186, 23);
		getContentPane().add(lblBrownie);		
		
		JLabel lblRaspberryCake = new JLabel("Raspberry Cake");
		lblRaspberryCake.setFont(new Font("Yu Gothic", Font.BOLD, 15));
		lblRaspberryCake.setBounds(415, 670, 143, 23);
		getContentPane().add(lblRaspberryCake);
		
		JLabel lblLemonCheesecake = new JLabel("Lemon Cheesecake");
		lblLemonCheesecake.setFont(new Font("Yu Gothic", Font.BOLD, 15));
		lblLemonCheesecake.setBounds(583, 670, 157, 23);
		getContentPane().add(lblLemonCheesecake);
		
		JButton btnCoffeeCakeAddCart = new JButton("");
		btnCoffeeCakeAddCart.setIcon(new ImageIcon("C:\\Users\\ASUS PC\\Desktop\\CoffeeShop\\image\\addcart2.jpg"));
		btnCoffeeCakeAddCart.setBounds(190, 685, 26, 23);
		getContentPane().add(btnCoffeeCakeAddCart);
		
		JButton btnBrownieAddCart = new JButton("");
		btnBrownieAddCart.setIcon(new ImageIcon("C:\\Users\\ASUS PC\\Desktop\\CoffeeShop\\image\\addcart2.jpg"));
		btnBrownieAddCart.setBounds(365, 685, 26, 23);
		getContentPane().add(btnBrownieAddCart);
		
		JButton btnRaspberryAddCart = new JButton("");
		btnRaspberryAddCart.setIcon(new ImageIcon("C:\\Users\\ASUS PC\\Desktop\\CoffeeShop\\image\\addcart2.jpg"));
		btnRaspberryAddCart.setBounds(538, 685, 26, 23);
		getContentPane().add(btnRaspberryAddCart);
		
		JButton btnLemonAddCart = new JButton("");
		btnLemonAddCart.setIcon(new ImageIcon("C:\\Users\\ASUS PC\\Desktop\\CoffeeShop\\image\\addcart2.jpg"));
		btnLemonAddCart.setBounds(731, 685, 26, 23);
		getContentPane().add(btnLemonAddCart);
		
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
		
		Dessert dessert = new Dessert();
	}


}

