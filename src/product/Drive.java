package product;

import java.awt.EventQueue;
/**
 * Classe que inicializa o projeto
 * @author pedrohbcavalcante
 * @version 0.1
 */
public class Drive {
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
