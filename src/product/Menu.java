package product;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Menu extends JFrame{
	public Menu(){
		setSize(280, 220);
		setTitle("Principal");
		JMenuBar mnbar = new JMenuBar();
		setJMenuBar(mnbar);
		JMenu Menu1 = new JMenu("Cadastros");
		JMenuItem fileMenu1 = new JMenuItem("Cliente");
		JMenuItem fileMenu2 = new JMenuItem("Fornecedor");
		JMenuItem fileMenu3 = new JMenuItem("Produto");
		mnbar.add(Menu1);
		Menu1.add(fileMenu1);
		Menu1.add(fileMenu2);
		Menu1.add(fileMenu3);
		
		fileMenu1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				new Cliente_Form().setVisible(true);
				
			}
		});
		fileMenu2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				new Fornecedor_Form().setVisible(true);
				
			}
		});
		fileMenu3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				new Product_Form().setVisible(true);
				
			}
		});
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Menu m1 = new Menu();
		EventQueue.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				m1.setVisible(true);
			}
		});
	}

}
