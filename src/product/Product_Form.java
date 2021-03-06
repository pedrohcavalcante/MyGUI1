package product;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
/**
 * Essa classe define a janela de cadastro dos produtos
 * @author pedrohbcavalcante
 * @version 0.1
 * 
 */
public class Product_Form extends JInternalFrame{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private ArrayList<Produto> listaProdutos;
	JLabel lcodigo = new JLabel("C�digo.: ");
	JLabel lnome = new JLabel("Nome.: ");
	JLabel lunidade = new JLabel("Unidade.: ");
	
	final JTextField tcodigo = new JTextField();
	final JTextField tnome = new JTextField();
	final JTextField tunidade = new JTextField();
	
	JButton b1 = new JButton("Submeter");
	JButton b2 = new JButton("Limpar");
	JButton b3 = new JButton("Listar");
	/**
	 * 
	 * @param str nome da janela
	 * Classe construtora que contem todos os campos de cadastro do produto
	 */
	public Product_Form(String str){
		super(str,false, true);
		listaProdutos = new ArrayList<Produto>();
		Container produto = this.getContentPane();
		produto.setLayout(null);
		
		
		lcodigo.setBounds(10, 10, 100, 30);
		lcodigo.setForeground(Color.blue);
		tcodigo.setBounds(60, 10, 280, 25);
		lnome.setBounds(10, 40, 100, 30);
		lnome.setForeground(Color.blue);
		tnome.setBounds(60, 40, 280, 25);
		lunidade.setBounds(10, 70, 100, 30);
		lunidade.setForeground(Color.blue);
		tunidade.setBounds(63, 70, 277, 25);
		b1.setBounds(10 ,140,100,30);
		b1.setMnemonic('S');
		b2.setBounds(120,140,100,30);
		b2.setMnemonic('L');
		b3.setBounds(230,140,100,30);
		b3.setMnemonic('s');
		
		produto.add(lcodigo);
		produto.add(tcodigo);
		produto.add(lnome);
		produto.add(tnome);
		produto.add(lunidade);
		produto.add(tunidade);
		produto.add(b1);
		produto.add(b2);
		produto.add(b3);
		
		setSize(350,230);
		setTitle(str);
		setResizable(false);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		b1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				int confirmacao = JOptionPane.showConfirmDialog(null,"Deseja cadastrar o produto?");
				if (confirmacao == JOptionPane.YES_OPTION){
					Produto p1 = new Produto(Integer.parseInt(tcodigo.getText()), tnome.getText(), tunidade.getText());
					listaProdutos.add(p1);
					tcodigo.setText("");
					tnome.setText("");
					tunidade.setText("");
				}
			}
		});
		
		b2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				int confirmacao = JOptionPane.showConfirmDialog(null,"Deseja limpar o formul�rio?");
				if (confirmacao == JOptionPane.YES_OPTION){
					tcodigo.setText("");
					tnome.setText("");
					tunidade.setText("");
				}
			}
		});
		
		b3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				int confirmacao = JOptionPane.showConfirmDialog(null,"Deseja limpar o formul�rio?");
				if (confirmacao == JOptionPane.YES_OPTION){
					try{
						for (Produto p : listaProdutos){
							System.out.println("****************************************");
							System.out.println("C�digo: " + p.getID() + " Nome: " + p.getNome() + " Unidade de Medida: " 
									+ p.getUnidade());
						}
					}catch (NullPointerException exception){
						System.out.println("N�o foram encontrados produtos no sistema");
					}
				}
			}
		});
	}
}
