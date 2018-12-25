import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class DripCoffee extends JFrame implements ActionListener{
	
	private JButton btnGoBack = new JButton("Go Back to Home");
	private JButton btnShoppingCart = new JButton("Shopping Cart");
	private JMenuItem item1 = new JMenuItem("Drip Coffee");
	private JMenuItem item2 = new JMenuItem("Frappe");
	private JMenuItem item3 = new JMenuItem("Iced Coffee");
	private JMenuItem item4 = new JMenuItem("Tea");
	private JMenuItem item5 = new JMenuItem("Sandwich");
	private JMenuItem item6 = new JMenuItem("Dessert");

	DripCoffee() {
		getContentPane().setBackground(SystemColor.info);
		
		setTitle("Drip Coffee");
		setBounds(100, 100, 1024, 768);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		getContentPane().setLayout(null);
		setResizable(false);
		
		JLabel lblDrip = new JLabel("DRIP COFFEE");
		lblDrip.setForeground(SystemColor.info);
		lblDrip.setFont(new Font("Yu Gothic", Font.PLAIN, 75));
		lblDrip.setBounds(240, 237, 594, 132);
		getContentPane().add(lblDrip);
		
		JLabel lblDripCover = new JLabel("");
		lblDripCover.setIcon(new ImageIcon("C:\\Users\\ASUS PC\\Desktop\\CoffeeShop\\image\\Drip2.jpg"));
		lblDripCover.setBounds(-6, 86, 1017, 391);
		getContentPane().add(lblDripCover);
		
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
				
		JLabel imgDripCoffee = new JLabel("");
		imgDripCoffee.setIcon(new ImageIcon("C:\\Users\\ASUS PC\\Desktop\\CoffeeShop\\image\\dripcoffee.jpg"));
		imgDripCoffee.setBounds(73, 523, 143, 137);
		getContentPane().add(imgDripCoffee);
		
		JLabel imgMisto = new JLabel("");
		imgMisto.setIcon(new ImageIcon("C:\\Users\\ASUS PC\\Desktop\\CoffeeShop\\image\\misto.jpg"));
		imgMisto.setBounds(272, 523, 143, 140);
		getContentPane().add(imgMisto);
		
		JLabel lblDripCoffee = new JLabel("Drip Coffee");
		lblDripCoffee.setFont(new Font("Yu Gothic", Font.BOLD, 15));
		lblDripCoffee.setBounds(73, 670, 143, 23);
		getContentPane().add(lblDripCoffee);
		
		JLabel lblMisto = new JLabel("Caffee Misto");
		lblMisto.setFont(new Font("Yu Gothic", Font.BOLD, 15));
		lblMisto.setBounds(272, 670, 143, 23);
		getContentPane().add(lblMisto);
		
		btnGoBack.setBackground(SystemColor.info);	
		btnGoBack.setFont(new Font("Yu Gothic", Font.BOLD, 13));
		btnGoBack.setBounds(800, 675, 170, 25);
		getContentPane().add(btnGoBack);
		ImageIcon lblGoBackIcon = new ImageIcon("C:\\Users\\ASUS PC\\Desktop\\CoffeeShop\\image\\Undo.png");
		btnGoBack.setIcon(lblGoBackIcon);
		
		JButton btnDripAddCart = new JButton("");
		btnDripAddCart.setIcon(new ImageIcon("C:\\Users\\ASUS PC\\Desktop\\CoffeeShop\\image\\addcart2.jpg"));
		btnDripAddCart.setBounds(190, 685, 26, 23);
		getContentPane().add(btnDripAddCart);
		
		JButton btnMistoAddCart = new JButton("");
		btnMistoAddCart.setIcon(new ImageIcon("C:\\Users\\ASUS PC\\Desktop\\CoffeeShop\\image\\addcart2.jpg"));
		btnMistoAddCart.setBounds(396, 685, 26, 23);
		getContentPane().add(btnMistoAddCart);
		

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
		
		DripCoffee dripcoffee = new DripCoffee();
		
	}

}
