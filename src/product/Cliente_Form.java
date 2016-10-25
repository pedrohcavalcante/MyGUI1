package product;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.*;
import javax.swing.text.MaskFormatter;
/**
 * Essa classe implementa uma janela com campos para cadastro de clientes
 * @author pedrohbcavalcante
 * @version 0.1
 */
public class Cliente_Form extends JInternalFrame {
	private static final long serialVersionUID = 1L;
	private ArrayList<Cliente> listaClientes;
	
	JLabel lnome = new JLabel("Nome.: ");
	JLabel lidade = new JLabel("Idade.:");
	JLabel lcpf =   new JLabel("CPF..:");
	JLabel lrg =    new JLabel("RG...:");
	final JTextField tnome  = new JTextField();
	final JTextField tidade = new JTextField();
	JButton b1 = new JButton("Submeter");
	JButton b2 = new JButton("Limpar");
	JButton b3 = new JButton("Listar");
	MaskFormatter text_cpf = null;
	final JFormattedTextField tcpf;
	final JTextField trg;
	
	/**
	 * Classe construtora
	 * @param str nome que ir� aparecer na janela
	 *
	 */
	public Cliente_Form(String str){
		super(str, false, true);
		
		
		Container form_container = this.getContentPane();
		listaClientes = new ArrayList<Cliente>();
		
		form_container.setLayout(null);
		
		
		
		
		try{
			text_cpf = new MaskFormatter("###.###.###-##");
			
		}catch (Exception e){
			System.out.println("error");
		}
		
		tcpf =  new JFormattedTextField(text_cpf);	
		
		trg    = new JTextField();
		lnome.setBounds(10,10,100,30);
		lnome.grabFocus();
		lnome.setForeground(Color.blue);
		tnome.setBounds(55,10,280,25);
		lidade.setBounds(10,40,100,30);
		lidade.setForeground(Color.blue);
		tidade.setBounds(55,40,22,25);
		lcpf.setBounds(10,70,100,30);
		lcpf.setForeground(Color.blue);
		tcpf.setBounds(55,70,100,25);
		lrg.setBounds(10,100,100,30);
		lrg.setForeground(Color.blue);
		trg.setBounds(55,100,60,25);

		b1.setBounds(10 ,140,100,30);
		b1.setMnemonic('S');
		b2.setBounds(120,140,100,30);
		b2.setMnemonic('L');
		b3.setBounds(230,140,100,30);
		b3.setMnemonic('t');
		
		form_container.add(lnome);
		form_container.add(tnome);
		form_container.add(lidade);
		form_container.add(tidade);
		form_container.add(lcpf);
		form_container.add(tcpf);
		form_container.add(lrg);
		form_container.add(trg);
		form_container.add(b1);
		form_container.add(b2);
		form_container.add(b3);
		
		setSize(350,230);
		setTitle(str);
		setResizable(false);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		
		/**
		 * a��es do action listener do bot�o de cadastrar
		 */
		b1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				int confirmacao = JOptionPane.showConfirmDialog(null,"Deseja cadastrar o cliente?");
				if (confirmacao == JOptionPane.YES_OPTION){
					Cliente c1 = new Cliente(tnome.getText(), tidade.getText(), tcpf.getText(), trg.getText());
					listaClientes.add(c1);
					tnome.setText("");
					tidade.setText("");
					tcpf.setText("");
					trg.setText("");
				}
				
			}
		});
		/**
		 * A��es do action Listener do bot�o de limpar
		 */
		b2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				int confirmacao = JOptionPane.showConfirmDialog(null,"Deseja limpar o formul�rio?");
				if (confirmacao == JOptionPane.YES_OPTION){
					tnome.setText("");
					tidade.setText("");
					tcpf.setText("");
					trg.setText("");
				}
				
			}
		});
		/**
		 * A��es do bot�o de listar os clientes cadastrados
		 */
		b3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				int confirmacao = JOptionPane.showConfirmDialog(null,"Deseja listar os clientes?");
				if (confirmacao == JOptionPane.YES_OPTION){
					try{
						for (Cliente c : listaClientes){
							System.out.println("****************************************");
							System.out.println("Nome: " + c.getNome() + " Idade: " + c.getIdade()
							+ " CPF: " + c.getCPF() + " RG: " + c.getRG());
						}
					}catch (NullPointerException exception){
						System.out.println("N�o foram encontrados clientes no systema");
					}
				}
				// TODO Auto-generated method stub
				
			}
		});
	}

}
