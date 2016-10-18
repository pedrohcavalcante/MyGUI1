package product;

import javax.swing.*;
import java.awt.*;

public class Product_Form extends JFrame{
	public Product_Form(){
		Container produto = this.getContentPane();
		produto.setLayout(null);
		JLabel lcodigo = new JLabel("Código.: ");
		JLabel lnome = new JLabel("Nome.: ");
		JLabel lunidade = new JLabel("Unidade.: ");
		
		final JTextField tcodigo = new JTextField();
		final JTextField tnome = new JTextField();
		final JTextField tunidade = new JTextField();
		
		JButton b1 = new JButton("Submeter");
		JButton b2 = new JButton("Limpar");
		JButton b3 = new JButton("Listar");
		
		lcodigo.setBounds(10, 10, 100, 30);
		tcodigo.setBounds(60, 10, 280, 25);
		lnome.setBounds(10, 40, 100, 30);
		tnome.setBounds(60, 40, 280, 25);
		lunidade.setBounds(10, 70, 100, 30);
		tunidade.setBounds(63, 70, 277, 25);
		b1.setBounds(10 ,140,100,30);
		b2.setBounds(120,140,100,30);
		b3.setBounds(230,140,100,30);
		
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
		setTitle("Formulario Rroduto");
		setResizable(false);
	}
}
