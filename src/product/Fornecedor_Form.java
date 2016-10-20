package product;

import javax.swing.*;
import javax.swing.text.MaskFormatter;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Fornecedor_Form extends JInternalFrame{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private ArrayList<Fornecedor> listaFornecedores;
	
	JLabel lcodigo = new JLabel("Código.: ");
	JLabel lnome = new JLabel("Nome.: ");
	JLabel lcnpj = new JLabel("CNPJ.: ");
	
	final JTextField tcodigo = new JTextField();
	final JTextField tnome = new JTextField();
	final JTextField tcnpj = new JTextField();
	MaskFormatter text_cnpj = null;
	final JFormattedTextField formatted_cnpj;
	
	JButton b1 = new JButton("Submeter");
	JButton b2 = new JButton("Limpar");
	JButton b3 = new JButton("Listar");
	
	public Fornecedor_Form(String str){
		super(str, false, true);
		listaFornecedores = new ArrayList<Fornecedor>();
		Container forn = this.getContentPane();
		forn.setLayout(null);
		
		lcodigo.setBounds(10, 10, 100, 30);
		lcodigo.setForeground(Color.blue);
		tcodigo.setBounds(60, 10, 280, 25);
		lnome.setBounds(10, 40, 100, 30);
		lnome.setForeground(Color.blue);
		tnome.setBounds(60, 40, 280, 25);
		lcnpj.setBounds(10, 70, 100, 30);
		lcnpj.setForeground(Color.blue);
		tcnpj.setBounds(60, 70, 280, 25);
		
		try{
			text_cnpj = new MaskFormatter("##.###.###/####-##");
		}catch (Exception e){
			System.out.println("error");
		}
		
		formatted_cnpj = new JFormattedTextField(text_cnpj);
		formatted_cnpj.setBounds(60, 70, 280, 25);
		
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
		forn.add(formatted_cnpj);
		forn.add(b1);
		forn.add(b2);
		forn.add(b3);
		
		setSize(350,230);
		setTitle(str);
		setResizable(false);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		b1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				int confirmacao = JOptionPane.showConfirmDialog(null,"Deseja realmente cadastrar o fornecedor");
				if (confirmacao == JOptionPane.YES_OPTION){
					try{
						Fornecedor f1 = new Fornecedor(Integer.parseInt(tcodigo.getText()), tnome.getText(), formatted_cnpj.getText());
						listaFornecedores.add(f1);
						tcodigo.setText("");
						tnome.setText("");
						formatted_cnpj.setText("");
					}catch (NumberFormatException exception){
						System.out.println("Formato errado");
					}
				}
			}
		});
		b2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				int confirmacao = JOptionPane.showConfirmDialog(null,"Deseja limpar o formulário?");
				if (confirmacao == JOptionPane.YES_OPTION){
					tcodigo.setText("");
					tnome.setText("");
					formatted_cnpj.setText("");
				}
				
			}
		});
		b3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				// TODO Auto-generated method stub
				int confirmacao = JOptionPane.showConfirmDialog(null,"Deseja listar o formulário?");
				if(confirmacao == JOptionPane.YES_OPTION){
					try{
						
						for (Fornecedor f : listaFornecedores){
							System.out.println("****************************************\n");
							System.out.println("Codigo: " + f.getCodigo() + " Nome: " + f.getNome() + " CNPJ: " + f.getCNPJ());
						}
					}catch (NullPointerException exception){
						System.out.println("Erro. Não existe fornecedores cadastrados");
					}
				}
					
			}
		});
	}

}
