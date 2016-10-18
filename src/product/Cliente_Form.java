package product;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.*;

public class Cliente_Form extends JFrame{
	private ArrayList<Cliente> listaClientes;
	public Cliente_Form(){
		listaClientes = new ArrayList<Cliente>();
		Container form_container = this.getContentPane();
		form_container.setLayout(null);
		JLabel lnome = new JLabel("Nome.: ");
		JLabel lidade = new JLabel("Idade.:");
		JLabel lcpf =   new JLabel("CPF..:");
		JLabel lrg =    new JLabel("RG...:");
		
		final JTextField tnome  = new JTextField();
		final JTextField tidade = new JTextField();
		final JTextField tcpf   = new JTextField();
		final JTextField trg    = new JTextField();
				
		JButton b1 = new JButton("Submeter");
		JButton b2 = new JButton("Limpar");
		JButton b3 = new JButton("Listar");
		
		lnome.setBounds(10,10,100,30);
		tnome.setBounds(55,10,280,25);
		lidade.setBounds(10,40,100,30);
		tidade.setBounds(55,40,22,25);
		lcpf.setBounds(10,70,100,30);
		tcpf.setBounds(55,70,100,25);
		lrg.setBounds(10,100,100,30);
		trg.setBounds(55,100,60,25);

		b1.setBounds(10 ,140,100,30);
		b2.setBounds(120,140,100,30);
		b3.setBounds(230,140,100,30);
		
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
		setTitle("Formulario Cliente");
		setResizable(false);
		//setDefaultCloseOperation(EXIT_ON_CLOSE);
		b1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				Cliente c1 = new Cliente(tnome.getText(), tidade.getText(), tcpf.getText(), trg.getText());
				listaClientes.add(c1);
				tnome.setText("");
				tidade.setText("");
				tcpf.setText("");
				trg.setText("");
			}
		});
		
		b2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				tnome.setText("");
				tidade.setText("");
				tcpf.setText("");
				trg.setText("");
			}
		});
		
		b3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
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
		});
	}

}
