package ITA.ViolacaoEncapsulamento;

import java.util.Locale;

public class Principal {
    public static void main(String[] args) {
        Pilha p = new Pilha(10);
        p.empilhar("Maria");
        p.empilhar("José");
        p.empilhar("Paula");
        System.out.println(p.topo());
        System.out.println(p.tamanho());

        System.out.println("----------------------");
        System.out.println(p.desempilhar());
        System.out.println(p.topo());
        System.out.println(p.tamanho());

        System.out.println("----------------------");

        System.out.println(p.desempilhar().toString().toUpperCase());
        System.out.println(p.topo().toString().toUpperCase());
        System.out.println(p.tamanho());


    }
}
