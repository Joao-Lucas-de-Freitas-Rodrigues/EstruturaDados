package Atividades.Arvore;

public class ArvoreBinario {
	private NoBinario raiz;

	public ArvoreBinario() {
		super();
		this.raiz = new NoBinario("raiz");
	}

	public ArvoreBinario(NoBinario raiz) {
		super();
		if (raiz == null) {
			this.raiz = new NoBinario("raiz");
		} else {
			this.raiz = raiz;
		}
	}

	public void addNo(String Add, String posicao, NoBinario noPai) {
		addNo(new NoBinario(Add), posicao, noPai);
	}

	public void addNo(NoBinario noToAdd, String posicao, NoBinario noPai) {
		if (noPai == null) {
			addFilho(noToAdd, posicao, raiz);
		} else {
			addFilho(noToAdd, posicao, noPai);
		}
	}

	private void addFilho(NoBinario noToAdd, String posicao, NoBinario pai) {
		noToAdd.setPai(pai);
		if (posicao.equals("direita")) {
			pai.setDireita(noToAdd);
		} else {
			pai.setEsquerda(noToAdd);
		}
	}

	public void removerNo(String descricao){
		NoBinario no = buscarNo(descricao, raiz);
		if(no != null){
			if(no.getPai().getEsquerda() == no){
				no.getPai().setEsquerda(null);
			}else {
				no.getPai().setDireita(null);
			}
			
			System.out.println("O nó foi removido.");
		}else{
			System.out.println("Não foi possivel encontrar o nó.");
		}
	}

	public String buscarNoDescricao(String descricao) {
		NoBinario no = buscarNo(descricao, raiz);
		if(no != null) {
			return no.getDescricao() + " foi encontrado na arvore.";
		} else {
			return descricao + " não foi encontrado na arvore.";
		}
	}	

	public NoBinario buscarNo(String descricao, NoBinario no){
		if(no == null){
			return null;
		}
		if(descricao == no.getDescricao()){
			return no;
		}
		NoBinario noEsquerda = buscarNo(descricao, no.getEsquerda());
		NoBinario noDireita = buscarNo(descricao, no.getDireita());

		if(noEsquerda != null){
			return noEsquerda;
		}else{
			return noDireita;
		}

	}

	// public NoBinario removerComFilho(NoBinario node, String description) {
	// 	if (node == null) {
	// 		return node; // void(0);
	// 	}

	// 	if (description == node.getDescricao() && node.getEsquerda() == null && node.getDireita() == null) {
	// 		node = null;
	// 		return node;
	// 	} else {
	// 		removerComFilho(node.getEsquerda(), node.getEsquerda().getDescricao());

	// 		if (node.getEsquerda() == null) {
	// 			node.setEsquerda(null); // Apago à referência em memória à esquerda
	// 			return node.getEsquerda();
	// 		}

	// 		removerComFilho(node.getDireita(), node.getDireita().getDescricao());

	// 		if (node.getDireita() == null) {
	// 			node.getDireita(); // Apago à referência em memória à direita
	// 			return node.getDireita();
	// 		}
	// 		System.out.println("Apagando " + node.getDescricao());
	// 		node = null;
	// 		System.out.print(node);
	// 		return node;
	// 	}
	// }

}
