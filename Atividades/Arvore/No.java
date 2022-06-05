package Atividades.Arvore;

public class No {
	private int valor;
	private No[] filhos;// N Filhos
	private No pai;

	public No(int valor) {
		this.valor = valor;
		filhos = null;
	}

	public No(int valor, No[] filhos) {
		super();
		this.valor = valor;
		this.filhos = filhos;
	}
}
