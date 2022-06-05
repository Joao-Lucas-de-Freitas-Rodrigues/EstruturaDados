package Atividades.Arvore;

public class NoBinario {
    private int valor;
    private NoBinario direita;
    private NoBinario esquerda;
    //private NoBinario pai;

    public NoBinario(int valor) {
        this.direita = null;
        this.esquerda = null;
        //this.pai = null;
        this.valor = valor;
    }

    public NoBinario(int valor,
            NoBinario direita, NoBinario esquerda) {
        super();
        //this.pai = pai;
        this.valor = valor;
        this.direita = direita;
        this.esquerda = esquerda;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public NoBinario getDireita() {
        return direita;
    }

    public void setDireita(NoBinario direita) {
        this.direita = direita;
    }

    public NoBinario getEsquerda() {
        return esquerda;
    }

    public void setEsquerda(NoBinario esquerda) {
        this.esquerda = esquerda;
    }

    // public NoBinario getPai() {
    //     return pai;
    // }

    // public void setPai(NoBinario pai) {
    //     this.pai = pai;
    // }
}
