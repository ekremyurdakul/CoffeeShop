import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Frappe extends JFrame implements ActionListener{

	private JButton btnGoBack = new JButton("Go Back to Home");
	private JButton btnShoppingCart = new JButton("Shopping Cart");
	private JMenuItem item1 = new JMenuItem("Drip Coffee");
	private JMenuItem item2 = new JMenuItem("Frappe");
	private JMenuItem item3 = new JMenuItem("Iced Coffee");
	private JMenuItem item4 = new JMenuItem("Tea");
	private JMenuItem item5 = new JMenuItem("Sandwich");
	private JMenuItem item6 = new JMenuItem("Dessert");
	
	public Frappe(){
		getContentPane().setBackground(SystemColor.info);
		
		setTitle("Frappe");
		setBounds(100, 100, 1024, 768);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		getContentPane().setLayout(null);
		setResizable(false);
		
		JLabel lblFrappe = new JLabel("FRAPPE");
		lblFrappe.setForeground(SystemColor.info);
		lblFrappe.setFont(new Font("Yu Gothic", Font.PLAIN, 75));
		lblFrappe.setBounds(330, 237, 337, 132);
		getContentPane().add(lblFrappe);
		
		JLabel lblFrappeCover = new JLabel("");
		lblFrappeCover.setIcon(new ImageIcon("C:\\Users\\ASUS PC\\Desktop\\CoffeeShop\\image\\Frappe.jpg"));
		lblFrappeCover.setBounds(-6, 86, 1017, 391);
		getContentPane().add(lblFrappeCover);
		
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
		
		JLabel imgVanillaFrappe = new JLabel("");
		imgVanillaFrappe.setIcon(new ImageIcon("C:\\Users\\ASUS PC\\Desktop\\CoffeeShop\\image\\vanillafrappe.jpg"));
		imgVanillaFrappe.setBounds(73, 523, 143, 137);
		getContentPane().add(imgVanillaFrappe);
		
		JLabel imgMochaFrappe = new JLabel("");
		imgMochaFrappe.setIcon(new ImageIcon("C:\\Users\\ASUS PC\\Desktop\\CoffeeShop\\image\\mochafrappe.jpg"));
		imgMochaFrappe.setBounds(249, 523, 143, 140);
		getContentPane().add(imgMochaFrappe);
		
		JLabel imgChocoFrappe = new JLabel("");
		imgChocoFrappe.setIcon(new ImageIcon("C:\\Users\\ASUS PC\\Desktop\\CoffeeShop\\image\\chocofrappe.jpg"));
		imgChocoFrappe.setBounds(415, 523, 143, 140);
		getContentPane().add(imgChocoFrappe);
		
		JLabel imgStrawberryFrappe = new JLabel("");
		imgStrawberryFrappe.setIcon(new ImageIcon("C:\\Users\\ASUS PC\\Desktop\\CoffeeShop\\image\\strawberriesfrappe.jpg"));
		imgStrawberryFrappe.setBounds(593, 523, 143, 140);
		getContentPane().add(imgStrawberryFrappe);
		
		btnGoBack.setBackground(SystemColor.info);
		btnGoBack.setFont(new Font("Yu Gothic", Font.BOLD, 13));
		btnGoBack.setBounds(800, 675, 170, 25);
		getContentPane().add(btnGoBack);
		ImageIcon lblGoBackIcon = new ImageIcon("C:\\Users\\ASUS PC\\Desktop\\CoffeeShop\\image\\Undo.png");
		btnGoBack.setIcon(lblGoBackIcon);
		
		JLabel lblVanillaFrappe = new JLabel("Vanilla Frappe");
		lblVanillaFrappe.setFont(new Font("Yu Gothic", Font.BOLD, 15));
		lblVanillaFrappe.setBounds(73, 670, 143, 23);
		getContentPane().add(lblVanillaFrappe);
		
		JLabel lblMochaFrappe = new JLabel("Mocha Frappe\r\n");
		lblMochaFrappe.setFont(new Font("Yu Gothic", Font.BOLD, 15));
		lblMochaFrappe.setBounds(249, 670, 143, 23);
		getContentPane().add(lblMochaFrappe);
		
		JLabel lblChocoFrappe = new JLabel("Chocolate Frappe");
		lblChocoFrappe.setFont(new Font("Yu Gothic", Font.BOLD, 15));
		lblChocoFrappe.setBounds(415, 670, 143, 23);
		getContentPane().add(lblChocoFrappe);
		
		JLabel lblStrawberryFrappe = new JLabel("Strawberry Frappe");
		lblStrawberryFrappe.setFont(new Font("Yu Gothic", Font.BOLD, 15));
		lblStrawberryFrappe.setBounds(593, 676, 143, 23);
		getContentPane().add(lblStrawberryFrappe);
		
		JButton btnVanillaAddCart = new JButton("");
		btnVanillaAddCart.setIcon(new ImageIcon("C:\\Users\\ASUS PC\\Desktop\\CoffeeShop\\image\\addcart2.jpg"));
		btnVanillaAddCart.setBounds(190, 685, 26, 23);
		getContentPane().add(btnVanillaAddCart);
		
		JButton btnMochaAddCart = new JButton("");
		btnMochaAddCart.setIcon(new ImageIcon("C:\\Users\\ASUS PC\\Desktop\\CoffeeShop\\image\\addcart2.jpg"));
		btnMochaAddCart.setBounds(372, 685, 26, 23);
		getContentPane().add(btnMochaAddCart);
		
		JButton btnChocoAddCart = new JButton("");
		btnChocoAddCart.setIcon(new ImageIcon("C:\\Users\\ASUS PC\\Desktop\\CoffeeShop\\image\\addcart2.jpg"));
		btnChocoAddCart.setBounds(547, 685, 26, 23);
		getContentPane().add(btnChocoAddCart);
		
		JButton btnStrawberryAddCart = new JButton("");
		btnStrawberryAddCart.setIcon(new ImageIcon("C:\\Users\\ASUS PC\\Desktop\\CoffeeShop\\image\\addcart2.jpg"));
		btnStrawberryAddCart.setBounds(735, 685, 26, 23);
		getContentPane().add(btnStrawberryAddCart);
		

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
		
		Frappe frappe = new Frappe();
				
	}

}
