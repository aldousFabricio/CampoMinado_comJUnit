package br.com.cavalcanti.cm.modelo;

import java.util.ArrayList;
import java.util.List;

public class Campo {
	
	private boolean aberto;
	private boolean marcado;
	private boolean minado;
	private final int linha;
	private final int coluna;
	
	private List<Campo> vizinhos = new ArrayList<>();
	
	
	public Campo(int linha, int coluna) {
		this.linha = linha;
		this.coluna = coluna;
	}

}
