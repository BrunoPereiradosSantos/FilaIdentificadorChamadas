package view;

import javax.swing.JOptionPane;

import controller.TelefoneController;
import model.Fila;

public class Principal {

	public static void main(String[] args) {
		Fila f = new Fila();
		TelefoneController tc = new TelefoneController();
		int opc = 0;
		while(opc != 9) {
			opc = Integer.parseInt(JOptionPane.showInputDialog("Escolha uma opção: \n"
					+ "1 - Inserir uma nova ligação \n Ex: DDD+111111111 \n"
					+ "2 - Consultar Ligações \n"
					+ "3 - Quantidade de Ligações \n"
					+ "4 - Remover Ligação já visualizada \n"
					+ "9 - Sair"));
			switch(opc) {
				case 1:
					String numero = JOptionPane.showInputDialog("Digite um telefone");
					tc.insereLigacao(f, numero);
					break;
				case 2: 
					try {
						if(f.size() == 0) {
							JOptionPane.showMessageDialog(null, "Não há Registros de Ligações");
						}else {
							 tc.consultaLigacao(f);
						}
						
					} catch (Exception e) {
						e.printStackTrace();
					}
					break;
				case 3:
					tc.quantidadeLigacoes(f);
					break;
				
				case 4:
				try {
					tc.removerLicacao(f);
				} catch (Exception e) {
					e.printStackTrace();
				}
					break;
				case 9:
					System.exit(0);
			}
		}

	}

}
