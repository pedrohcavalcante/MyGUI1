package product;

import javax.swing.*;
import java.awt.*;

public class Fornecedor_Form extends JFrame{

	public Fornecedor_Form(){
		Container forn = this.getContentPane();
		forn.setLayout(null);
		JLabel lcodigo = new JLabel("Código.: ");
		JLabel lnome = new JLabel("Nome.: ");
		JLabel lcnpj = new JLabel("CNPJ.: ");
		
		final JTextField tcodigo = new JTextField();
		final JTextField tnome = new JTextField();
		final JTextField tcnpj = new JTextField();
		
		JButton b1 = new JButton("Submeter");
		JButton b2 = new JButton("Limpar");
		JButton b3 = new JButton("Listar");
		
		lcodigo.setBounds(10, 10, 100, 30);
		tcodigo.setBounds(60, 10, 280, 25);
		lnome.setBounds(10, 40, 100, 30);
		tnome.setBounds(60, 40, 280, 25);
		lcnpj.setBounds(10, 70, 100, 30);
		tcnpj.setBounds(60, 70, 280, 25);
		b1.setBounds(10 ,140,100,30);
		b2.setBounds(120,140,100,30);
		b3.setBounds(230,140,100,30);
		
		forn.add(lcodigo);
		forn.add(tcodigo);
		forn.add(lnome);
		forn.add(tnome);
		forn.add(lcnpj);
		forn.add(tcnpj);
		forn.add(b1);
		forn.add(b2);
		forn.add(b3);
		
		setSize(350,230);
		setTitle("Formulario Fornecedor");
		setResizable(false);
		//setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

}
