package introducao.base.inicio.estruturasrepeticaoearrays.loops;

/*
Faça um programa que peça N números inteiros,
calcule e mostre a quantidade de números pares
e a quantidade de números impares.
*/


import java.util.Scanner;

public class ParEImpar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Quantidade de números: ");
        int quantidadeDeNumeros = scan.nextInt();

        int quantPar = 0, quantImpar = 0;

        int count = 0;

        do {
            System.out.println("Número: ");
            int numero = scan.nextInt();
            if (numero % 2 == 0) quantPar++;
            else quantImpar++;
            count++;
        } while (count < quantidadeDeNumeros);

        System.out.println("Quantidade números pares: " + quantPar + "\nQuantidade números ímpares: " + quantImpar);
    }
}
