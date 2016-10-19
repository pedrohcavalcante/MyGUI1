package product;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Fornecedor_Form extends JFrame{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private ArrayList<Fornecedor> listaFornecedores;
	
	public Fornecedor_Form(){
		listaFornecedores = new ArrayList<Fornecedor>();
		Container forn = this.getContentPane();
		forn.setLayout(null);
		JLabel lcodigo = new JLabel("Código.: ");
		JLabel lnome = new JLabel("Nome.: ");
		JLabel lcnpj = new JLabel("CNPJ.: ");
		
		final JTextField tcodigo = new JTextField();
		final JTextField tnome = new JTextField();
		final JTextField tcnpj = new JTextField();
		final JTextField listagem = new JTextField();
		
		JButton b1 = new JButton("Submeter");
		JButton b2 = new JButton("Limpar");
		JButton b3 = new JButton("Listar");
		
		lcodigo.setBounds(10, 10, 100, 30);
		lcodigo.setForeground(Color.blue);
		tcodigo.setBounds(60, 10, 280, 25);
		lnome.setBounds(10, 40, 100, 30);
		lnome.setForeground(Color.blue);
		tnome.setBounds(60, 40, 280, 25);
		lcnpj.setBounds(10, 70, 100, 30);
		lcnpj.setForeground(Color.blue);
		tcnpj.setBounds(60, 70, 280, 25);
		listagem.setBounds(25, 170, 300, 300);
		b1.setBounds(10 ,140,100,30);
		b1.setMnemonic('S');
		b2.setBounds(120,140,100,30);
		b2.setMnemonic('L');
		b3.setBounds(230,140,100,30);
		b3.setMnemonic('s');
		
		forn.add(lcodigo);
		forn.add(tcodigo);
		forn.add(lnome);
		forn.add(tnome);
		forn.add(lcnpj);
		forn.add(tcnpj);
		forn.add(b1);
		forn.add(b2);
		forn.add(b3);
		forn.add(listagem);
		
		setSize(350,500);
		setTitle("Formulario Fornecedor");
		setResizable(false);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		b1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				Fornecedor f1 = new Fornecedor(Integer.parseInt(tcodigo.getText()), tnome.getText(), tcnpj.getText());
				listaFornecedores.add(f1);
				tcodigo.setText("");
				tnome.setText("");
				tcnpj.setText("");
			}
		});
		b2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				tcodigo.setText("");
				tnome.setText("");
				tcnpj.setText("");
				listagem.setText("");
			}
		});
		b3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				listagem.setText("teste");
				try{
					
					for (Fornecedor f : listaFornecedores){
						listagem.setText("****************************************\n");
						listagem.setText("Codigo: " + f.getCodigo() + " Nome: " + f.getNome() + " CNPJ: " + f.getCNPJ() + "\n");
					}
				}catch (NullPointerException exception){
					System.out.println("Erro. Não existe fornecedores cadastrados");
				}
			}
		});
	}

}
