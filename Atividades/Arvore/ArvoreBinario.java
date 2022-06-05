package Atividades.Arvore;

public class ArvoreBinario {
	private NoBinario raiz;

	public ArvoreBinario() {
		super();
		this.raiz = new NoBinario(0);
	}

	public ArvoreBinario(NoBinario raiz) {
		super();
		if (raiz == null) {
			this.raiz = new NoBinario(0);
		} else {
			this.raiz = raiz;
		}
	}

	public void addNo(int valor) {
		raiz = addNoRecursivo(raiz, valor);
	}

	private NoBinario addNoRecursivo(NoBinario no, int valor){
		if(no.getDireita() == null && no.getEsquerda() == null){
			raiz = new NoBinario(valor);
		}
		if(valor < no.getValor()){
			no.setEsquerda(addNoRecursivo(no.getEsquerda(), valor));
			//NoBinario esquerda = addNoRecursivo(no.getEsquerda(), valor);
		}else if(valor > no.getValor()){
			no.setDireita(addNoRecursivo(no.getDireita(), valor));
		}else{
			return no;
		}
		return no;
	}

	// private NoBinario addRecursive(NoBinario no, int valor) {
	// 	if (no == null) {
	// 		return new NoBinario(valor);
	// 	}
	
	// 	if (valor < no.getvalor()) {
	// 		no. = addRecursive(no.getEsquerda, value);
	// 	} else if (value > current.value) {
	// 		no.right = addRecursive(no.right, value);
	// 	} else {
	// 		// value already exists
	// 		return no;
	// 	}
	
	// 	return no;
	// }

	// public void addNo(int Add, String posicao, NoBinario noPai) {
	// addNo(new NoBinario(Add), posicao, noPai);
	// }

	// public void addNo(NoBinario noToAdd, String posicao, NoBinario noPai) {
	// if (noPai == null) {
	// addFilho(noToAdd, posicao, raiz);
	// } else {
	// addFilho(noToAdd, posicao, noPai);
	// }
	// }

	// private void addFilho(NoBinario noToAdd, String posicao, NoBinario pai) {
	// if (posicao.equals("direita")) {
	// pai.setDireita(noToAdd);
	// } else {
	// pai.setEsquerda(noToAdd);
	// }
	// }

	// public NoBinario search(NoBinario root, int valor) {
	// 	if (root == null || root.getvalor() == valor) {
	// 		System.out.println("Encontrado");
	// 		return root;
	// 	}

	// 	if (root.getvalor() < valor) {
	// 		return search(root.getDireita(), valor);
	// 	}
	// 	return search(root.getEsquerda(), valor);
	// }

	// public void removerNo(String descricao){
	// NoBinario no = buscarNo(descricao, raiz);
	// if(no != null){
	// if(no.getPai().getEsquerda() == no){
	// no.getPai().setEsquerda(null);
	// }else {
	// no.getPai().setDireita(null);
	// }

	// System.out.println("O nó foi removido.");
	// }else{
	// System.out.println("Não foi possivel encontrar o nó.");
	// }
	// }

	// public String buscarNoDescricao(String descricao) {
	// NoBinario no = buscarNo(descricao, raiz);
	// if(no != null) {
	// return no.getDescricao() + " foi encontrado na arvore.";
	// } else {
	// return descricao + " não foi encontrado na arvore.";
	// }
	// }

	// public NoBinario buscarNo(String descricao, NoBinario no){
	// if(no == null){
	// return null;
	// }
	// if(descricao == no.getDescricao()){
	// return no;
	// }
	// NoBinario noEsquerda = buscarNo(descricao, no.getEsquerda());
	// NoBinario noDireita = buscarNo(descricao, no.getDireita());

	// if(noEsquerda != null){
	// return noEsquerda;
	// }else{
	// return noDireita;
	// }

}
