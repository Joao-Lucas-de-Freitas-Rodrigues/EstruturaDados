package Atividades.Arvore;

public class ArvoreOrdenada {
    int valor;
    ArvoreOrdenada esquerda;
    ArvoreOrdenada direita;

    public static ArvoreOrdenada raiz;

    public ArvoreOrdenada(int valor) {
        this.valor = valor;
    }

    public static void add(int valor) {
        addRecursivo(raiz, valor);
    }

    public static void addRecursivo(ArvoreOrdenada no, int valor) {
        if (no == null) {

            raiz = new ArvoreOrdenada(valor);
        } else {
            if (valor < no.valor) {
                if (no.esquerda != null) {
                    addRecursivo(no.esquerda, valor);
                } else {
                    System.out.println("O valor " + valor + " será inserido na esquerda do " + no.valor);
                    no.esquerda = new ArvoreOrdenada(valor);
                }
            } else {
                if (no.direita != null) {
                    addRecursivo(no.direita, valor);
                } else {
                    System.out.println("O valor " + valor + " será inserido na direita do " + no.valor);
                    no.direita = new ArvoreOrdenada(valor);
                }
            }
        }

    }

    public static ArvoreOrdenada buscarNo(int value) {
        return buscarNoRecursivo(raiz, value);
    }

    private static ArvoreOrdenada buscarNoRecursivo(ArvoreOrdenada no, int valor) {
        if (no == null) {
            //System.out.println("O nó " + valor + " não existe na árvore");
            return no;
        }
        if (valor == no.valor) {
            //System.out.println("O nó " + valor + " existe na árvore");
            return no;
        }
        return valor < no.valor
                ? buscarNoRecursivo(no.esquerda, valor)
                : buscarNoRecursivo(no.direita, valor);
    }

    public static void removerNoSFilhos(int valor) {
        raiz = removerNoSemFilhos(valor);
    }

    public static ArvoreOrdenada removerNoSemFilhos(int valor) {
        ArvoreOrdenada no = buscarNo(valor);
        if (no.esquerda == null && no.direita == null) {
            return null;
        } else if (no.esquerda == null || no.direita == null) {
            return no.esquerda == null ? no.direita : no.esquerda;
        }
        int menorValor = buscarMenorValor(no.direita);
        no.valor = menorValor;
        no.direita = removerNoSemFilhos(menorValor);
        return no;
    }

    private static int buscarMenorValor(ArvoreOrdenada no) {
        return no.esquerda == null ? no.valor : buscarMenorValor(no.esquerda);
    }

    // public static void removerNo(int valor) {
    // raiz = removerNoFilhos(raiz,valor);
    // }

    // public static ArvoreOrdenada removerNoFilhos(ArvoreOrdenada no,int valor) {
    // if(no == null){
    // return null;
    // }
    // if(no.valor == valor){
    // if (no.esquerda == null && no.direita == null) {
    // return null;
    // }
    // }
    // if(valor < no.valor){
    // no.esquerda = removerNoFilhos(no.esquerda, valor);
    // return no;
    // }
    // no.direita = removerNoFilhos(no.direita, valor);
    // return no;
    // }

    public static void main(String[] args) {
        add(2);
        add(6);
        add(7);
        add(4);
        add(3);
        add(5);
        // buscarNo(2);
        // buscarNo(10);
        // buscarNo(4);
        removerNoSFilhos(4);
        buscarNo(6);
        buscarNo(3);
    }
}
