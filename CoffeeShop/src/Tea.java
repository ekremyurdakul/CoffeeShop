import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Tea extends JFrame implements ActionListener{
	
	private JButton btnGoBack = new JButton("Go Back to Home");
	private JButton btnShoppingCart = new JButton("Shopping Cart");
	private JMenuItem item1 = new JMenuItem("Drip Coffee");
	private JMenuItem item2 = new JMenuItem("Frappe");
	private JMenuItem item3 = new JMenuItem("Iced Coffee");
	private JMenuItem item4 = new JMenuItem("Tea");
	private JMenuItem item5 = new JMenuItem("Sandwich");
	private JMenuItem item6 = new JMenuItem("Dessert");

	Tea(){
		
		getContentPane().setBackground(SystemColor.info);
		setTitle("Tea");
		setBounds(100, 100, 1024, 768);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		getContentPane().setLayout(null);
		setResizable(false);
		
		JLabel lblTea = new JLabel("TEA");
		lblTea.setForeground(SystemColor.info);
		lblTea.setFont(new Font("Yu Gothic", Font.PLAIN, 75));
		lblTea.setBounds(410, 237, 180, 132);
		getContentPane().add(lblTea);
		
		JLabel lblTeaCover = new JLabel("");
		lblTeaCover.setIcon(new ImageIcon("C:\\Users\\ASUS PC\\Desktop\\CoffeeShop\\image\\teaCover.jpg"));
		lblTeaCover.setBounds(-6, 86, 1017, 391);
		getContentPane().add(lblTeaCover);
		
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
		
		JLabel imgEarlGrey = new JLabel("");
		imgEarlGrey.setIcon(new ImageIcon("C:\\Users\\ASUS PC\\Desktop\\CoffeeShop\\image\\EarlGrey.jpg"));
		imgEarlGrey.setBounds(73, 523, 143, 137);
		getContentPane().add(imgEarlGrey);
			
		JLabel imgChaiTea = new JLabel("");
		imgChaiTea.setIcon(new ImageIcon("C:\\Users\\ASUS PC\\Desktop\\CoffeeShop\\image\\ChaiTea.jpg"));
		imgChaiTea.setBounds(249, 523, 143, 140);
		getContentPane().add(imgChaiTea);
		
		JLabel imgMintTea = new JLabel("");
		imgMintTea.setIcon(new ImageIcon("C:\\Users\\ASUS PC\\Desktop\\CoffeeShop\\image\\SpearmintGreenTea.jpg"));
		imgMintTea.setBounds(415, 523, 143, 140);
		getContentPane().add(imgMintTea);
		
		JLabel imgChaiTeaLatte = new JLabel("");
		imgChaiTeaLatte.setIcon(new ImageIcon("C:\\Users\\ASUS PC\\Desktop\\CoffeeShop\\image\\ChaiTeaLatte.jpg"));
		imgChaiTeaLatte.setBounds(583, 523, 143, 140);
		getContentPane().add(imgChaiTeaLatte);
		
		btnGoBack.setBackground(SystemColor.info);
		btnGoBack.setFont(new Font("Yu Gothic", Font.BOLD, 13));
		btnGoBack.setBounds(800, 675, 170, 25);
		getContentPane().add(btnGoBack);
		ImageIcon lblGoBackIcon = new ImageIcon("C:\\Users\\ASUS PC\\Desktop\\CoffeeShop\\image\\Undo.png");
		btnGoBack.setIcon(lblGoBackIcon);
		
		JLabel lblEarlGrey = new JLabel("Earl Grey");
		lblEarlGrey.setFont(new Font("Yu Gothic", Font.BOLD, 15));
		lblEarlGrey.setBounds(73, 670, 143, 23);
		getContentPane().add(lblEarlGrey);
		
		JLabel lblChaiTea = new JLabel("Chai Tea");
		lblChaiTea.setFont(new Font("Yu Gothic", Font.BOLD, 15));
		lblChaiTea.setBounds(249, 670, 143, 23);
		getContentPane().add(lblChaiTea);
		
		JLabel lblMintGreenTea = new JLabel("Mint Green Tea");
		lblMintGreenTea.setFont(new Font("Yu Gothic", Font.BOLD, 15));
		lblMintGreenTea.setBounds(415, 670, 143, 23);
		getContentPane().add(lblMintGreenTea);
		
		JLabel lblChaiTeaLatte = new JLabel("Chai Tea Latte");
		lblChaiTeaLatte.setFont(new Font("Yu Gothic", Font.BOLD, 15));
		lblChaiTeaLatte.setBounds(583, 670, 186, 23);
		getContentPane().add(lblChaiTeaLatte);
		
		JButton btnEarlGreyAddCart = new JButton("");
		btnEarlGreyAddCart.setIcon(new ImageIcon("C:\\Users\\ASUS PC\\Desktop\\CoffeeShop\\image\\addcart2.jpg"));
		btnEarlGreyAddCart.setBounds(190, 685, 26, 23);
		getContentPane().add(btnEarlGreyAddCart);
		
		JButton btnChaiTeaAddCart = new JButton("");
		btnChaiTeaAddCart.setIcon(new ImageIcon("C:\\Users\\ASUS PC\\Desktop\\CoffeeShop\\image\\addcart2.jpg"));
		btnChaiTeaAddCart.setBounds(365, 685, 26, 23);
		getContentPane().add(btnChaiTeaAddCart);
		
		JButton btnMintAddCart = new JButton("");
		btnMintAddCart.setIcon(new ImageIcon("C:\\Users\\ASUS PC\\Desktop\\CoffeeShop\\image\\addcart2.jpg"));
		btnMintAddCart.setBounds(533, 685, 26, 23);
		getContentPane().add(btnMintAddCart);
		
		JButton btnChaiLatteAddCart = new JButton("");
		btnChaiLatteAddCart.setIcon(new ImageIcon("C:\\Users\\ASUS PC\\Desktop\\CoffeeShop\\image\\addcart2.jpg"));
		btnChaiLatteAddCart.setBounds(700, 685, 26, 23);
		getContentPane().add(btnChaiLatteAddCart);
		

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
