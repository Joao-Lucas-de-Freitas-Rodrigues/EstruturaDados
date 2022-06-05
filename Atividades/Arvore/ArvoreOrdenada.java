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
            System.out.println("A raíz sera o valor: " + valor);
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
            System.out.println("O nó " + valor + " não existe na árvore");
            return no;
        }
        if (valor == no.valor) {
            System.out.println("O nó " + valor + " existe na árvore");
            return no;
        }
        return valor < no.valor
                ? buscarNoRecursivo(no.esquerda, valor)
                : buscarNoRecursivo(no.direita, valor);
    }

    // public static void removerNoSFilhos(int valor) {
    // raiz = removerNoSemFilhos(valor);
    // }

    // public static ArvoreOrdenada removerNoSemFilhos(int valor) {
    // ArvoreOrdenada no = buscarNo(valor);
    // if (no.esquerda == null && no.direita == null) {
    // return null;
    // } else if (no.esquerda == null || no.direita == null) {
    // return no.esquerda == null ? no.direita : no.esquerda;
    // }
    // int menorValor = buscarMenorValor(no.direita);
    // no.valor = menorValor;
    // no.direita = removerNoSemFilhos(no.valor);
    // return no;
    // }

    private static int buscarMenorValor(ArvoreOrdenada no) {
        return no.esquerda == null ? no.valor : buscarMenorValor(no.esquerda);
    }

    public static void removerNoSFilhos(int valor) {
        raiz = removerNoSemFilhos(raiz, valor);
    }

    public static ArvoreOrdenada removerNoSemFilhos(ArvoreOrdenada no, int valor) {
        if (no == null) {
            return null;
        } else if (valor < no.valor) {
            no.esquerda = removerNoSemFilhos(no.esquerda, valor);
            return no;
        } else if (valor > no.valor) {
            no.direita = removerNoSemFilhos(no.direita, valor);
            return no;
        } else {
            if (no.esquerda == null && no.direita == null) {
                return null;
            } else if (no.esquerda == null || no.direita == null) {
                return no.esquerda == null ? no.direita : no.esquerda;
            }
            no.valor = buscarMenorValor(no.direita);
            no.direita = removerNoSemFilhos(no.direita, no.valor);
            return no;
        }
    }

    public static void imprimirEmOrdem(ArvoreOrdenada raiz){
        if(raiz == null){
            return;
        }
        imprimirEmOrdem(raiz.esquerda);
        System.out.print(raiz.valor + "\t");
        imprimirEmOrdem(raiz.direita);
    }

    public static void main(String[] args) {
        add(1);
        add(2);
        add(20);
        add(10);
        add(9);
        add(15);
        add(14);
        add(13);
        add(12);
        add(16);
        imprimirEmOrdem(raiz);
        buscarNo(10);
        removerNoSFilhos(10);
        buscarNo(10);
        imprimirEmOrdem(raiz);
        
    }
}
