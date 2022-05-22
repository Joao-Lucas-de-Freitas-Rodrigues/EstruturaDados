package Atividades.Arvore;

public class Main {

    public static void main(String[] args) {
        // Árvore Binária
        //    1
        //  2   3
        // 4 5 6 7

        NoBinario folha1 = new NoBinario("1");
        NoBinario folha2 = new NoBinario("2");
        NoBinario folha3 = new NoBinario("3");
        NoBinario folha4 = new NoBinario("4");
        NoBinario folha5 = new NoBinario("5");
        NoBinario folha6 = new NoBinario("6");
        NoBinario folha7 = new NoBinario("7");

        ArvoreBinario arvoreBinaria = new ArvoreBinario(folha1);
        arvoreBinaria.addNo(folha2, "esquerda", folha1);
        arvoreBinaria.addNo(folha3, "direita", folha1);
        arvoreBinaria.addNo(folha4, "esquerda", folha2);
        arvoreBinaria.addNo(folha5, "direita", folha2);
        arvoreBinaria.addNo(folha6, "esquerda", folha3);
        arvoreBinaria.addNo(folha7, "direita", folha3);
        
        System.out.println(arvoreBinaria.buscarNoDescricao("2"));
        arvoreBinaria.removerNo("2");
        System.out.println(arvoreBinaria.buscarNoDescricao("2"));
        
    }

}
