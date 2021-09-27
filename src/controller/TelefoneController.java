package controller;

import javax.swing.JOptionPane;

import model.Fila;

public class TelefoneController {
	Fila f = new Fila();
	
	public void insereLigacao(Fila f, String numeroTelefone) {
		
		if(numeroTelefone.length() == 10) {
			f.insert(numeroTelefone);
		}else {
			JOptionPane.showMessageDialog(null, "O n�mero deve ter 10 d�gitos Ex: Ex: DDD+111111111");
		}
		
	}
	
	public void consultaLigacao(Fila f) throws Exception {
		if(f.isEmpty()) {
			throw new Exception("Fila vazia");
		}
		
		f.list();
	}
	
	public void quantidadeLigacoes(Fila f) {
		int qtd = f.size();
		if(qtd > 1) {
			System.out.println("Voc� tem " + qtd + " liga��es");
		}else {
			System.out.println("Voc� tem " + qtd + " liga��o");
		}
	}
	
	public void removerLicacao(Fila f) throws Exception {
		if(!f.isEmpty()) {
			f.remove();
		}else {
			JOptionPane.showMessageDialog(null, "Todas as Liga��es j� foram visualizadas");
		}
	}
}
