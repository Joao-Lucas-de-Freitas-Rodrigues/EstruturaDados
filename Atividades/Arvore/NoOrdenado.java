package Atividades.Arvore;

public class NoOrdenado {
    int valor;
    NoOrdenado esquerda;
    NoOrdenado direita;

    public static NoOrdenado raiz;

    public NoOrdenado(int valor) {
        this.valor = valor;
    }

    public static void add(int valor) {
        addRecursivo(raiz, valor);
    }

    public static void addRecursivo(NoOrdenado no, int valor) {
        if (no == null) {

            raiz = new NoOrdenado(valor);
        } else {
            if (valor < no.valor) {
                if (no.esquerda != null) {
                    addRecursivo(no.esquerda, valor);
                } else {
                    System.out.println("O valor " + valor + " será inserido na esquerda do " + no.valor);
                    no.esquerda = new NoOrdenado(valor);
                }
            } else {
                if (no.direita != null) {
                    addRecursivo(no.direita, valor);
                } else {
                    System.out.println("O valor " + valor + " será inserido na direita do " + no.valor);
                    no.direita = new NoOrdenado(valor);
                }
            }
        }

    }

    public static boolean searchNo(int value) {
        return searchNoRecursivo(raiz, value);
    }

    private static boolean searchNoRecursivo(NoOrdenado no, int valor) {
        if (no == null) {
            System.out.println("O nó " + valor + " não existe na árvore");
            return false;
        }
        if (valor == no.valor) {
            System.out.println("O nó " + valor + " existe na árvore");
            return true;
        }
        return valor < no.valor
                ? searchNoRecursivo(no.esquerda, valor)
                : searchNoRecursivo(no.direita, valor);
    }

    public static void main(String[] args) {
        add(2);
        add(6);
        add(4);
        add(3);
        searchNo(2);
        searchNo(10);
    }
}
