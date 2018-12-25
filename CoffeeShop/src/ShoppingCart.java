import javax.swing.*;
import java.awt.*;
import java.util.Vector;

public class ShoppingCart extends JFrame{
	private JTable table;

	ShoppingCart(){
		
		getContentPane().setBackground(SystemColor.info);
		setTitle("Shopping Cart");
		setBounds(100, 100, 1024, 768);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		getContentPane().setLayout(null);
		setResizable(false);
		
		JLabel lblLogo2 = new JLabel("");
		lblLogo2.setIcon(new ImageIcon("C:\\Users\\ASUS PC\\Desktop\\CoffeeShop\\image\\logo2.jpg"));
		lblLogo2.setBounds(64, 96, 70, 70);
		getContentPane().add(lblLogo2);
		
		JLabel lblLogin = new JLabel("Your Shopping Cart");
		lblLogin.setFont(new Font("Yu Gothic", Font.BOLD, 18));
		lblLogin.setBounds(146, 95, 229, 71);
		getContentPane().add(lblLogin);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(114, 254, 581, 338);
		getContentPane().add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		
		ShoppingCart shoppingcart = new ShoppingCart();
	}
}