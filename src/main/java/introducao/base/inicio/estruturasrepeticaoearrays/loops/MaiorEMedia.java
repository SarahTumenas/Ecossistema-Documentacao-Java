package introducao.base.inicio.estruturasrepeticaoearrays.loops;
/*
Faça um programa que leia 5 números, informe o maior número
e a média desses números.
*/

import java.util.Scanner;

public class MaiorEMedia {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double maior = 0;
        double soma = 0;
        double media;
        int count = 0;

        do {
            System.out.println("Número: ");
            double numero = scan.nextDouble();
            if (numero > maior) {
                maior = numero;
            }
            soma += numero;
            count ++;
        } while (count < 5);

        media = soma / 5;

        System.out.println("Maior número informado: " + maior + " - Média: " + media);
    }
}
