package product;

import javax.swing.*;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Menu extends JFrame implements ActionListener{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JDesktopPane dtop = new JDesktopPane();
	JMenuBar mnbar = new JMenuBar();
	JMenu Menu1 = new JMenu("Cadastros");
	JMenuItem fileMenu1 = new JMenuItem("Cliente");
	JMenuItem fileMenu2 = new JMenuItem("Fornecedor");
	JMenuItem fileMenu3 = new JMenuItem("Produto");
	public Menu(){
		Container ct = this.getContentPane();
		ct.setLayout(new BorderLayout());
		setSize(280, 220);
		setTitle("Principal");
		mnbar.add(Menu1);
		Menu1.add(fileMenu1);
		Menu1.add(fileMenu2);
		Menu1.add(fileMenu3);
		
		setJMenuBar(mnbar);
		ct.add(BorderLayout.CENTER, dtop);
		setSize(800,600);
		setResizable(false);
		setTitle("Sistema de Controle de Vendas");
		
		
		fileMenu1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				Cliente_Form tlCliente = new Cliente_Form("Cliente");
				dtop.add(tlCliente).setVisible(true);
				
			}
		});
		fileMenu2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				Fornecedor_Form tlForn = new Fornecedor_Form("Fornecedor");
				dtop.add(tlForn).setVisible(true);
				
			}
		});
		fileMenu3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				Product_Form tlProd = new Product_Form("Produtos");
				dtop.add(tlProd).setVisible(true);
				
			}
		});
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	

}
