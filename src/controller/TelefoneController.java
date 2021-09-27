package controller;

import javax.swing.JOptionPane;

import model.Fila;

public class TelefoneController {
	Fila f = new Fila();
	
	public void insereLigacao(Fila f, String numeroTelefone) {
		
		if(numeroTelefone.length() == 10) {
			f.insert(numeroTelefone);
		}else {
			JOptionPane.showMessageDialog(null, "O número deve ter 10 dígitos Ex: Ex: DDD+111111111");
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
			System.out.println("Você tem " + qtd + " ligações");
		}else {
			System.out.println("Você tem " + qtd + " ligação");
		}
	}
	
	public void removerLicacao(Fila f) throws Exception {
		if(!f.isEmpty()) {
			f.remove();
		}else {
			JOptionPane.showMessageDialog(null, "Todas as Ligações já foram visualizadas");
		}
	}
}
