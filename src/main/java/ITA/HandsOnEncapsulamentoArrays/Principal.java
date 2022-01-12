package ITA.HandsOnEncapsulamentoArrays;

import ITA.HandsOnViolacaoEncapsulamento.Pilha;

import java.util.Arrays;

public class Principal {
    public static void main(String[] args) {
        ITA.HandsOnViolacaoEncapsulamento.Pilha p = new Pilha(10);
        p.empilhar("Maria");
        p.empilhar("José");
        p.empilhar("Paula");
        System.out.println(p.topo());
        System.out.println(p.tamanho());

        Object [] arrayElementos = p.getElementos();
        System.out.println(Arrays.toString(arrayElementos));
        arrayElementos[1] = "OUTRO";

        System.out.println("----------------------");
        System.out.println(p.desempilhar());
        System.out.println(p.topo());
        System.out.println(p.tamanho());

        System.out.println(p.getElementos().length);

    }
}
