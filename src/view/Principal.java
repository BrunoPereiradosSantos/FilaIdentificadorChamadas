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
			opc = Integer.parseInt(JOptionPane.showInputDialog("Escolha uma op��o: \n"
					+ "1 - Inserir uma nova liga��o \n Ex: DDD+111111111 \n"
					+ "2 - Consultar Liga��es \n"
					+ "3 - Quantidade de Liga��es \n"
					+ "4 - Remover Liga��o j� visualizada \n"
					+ "9 - Sair"));
			switch(opc) {
				case 1:
					String numero = JOptionPane.showInputDialog("Digite um telefone");
					tc.insereLigacao(f, numero);
					break;
				case 2: 
					try {
						if(f.size() == 0) {
							JOptionPane.showMessageDialog(null, "N�o h� Registros de Liga��es");
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
