package introducao.base.inicio.estruturasrepeticaoearrays.loops;

/*
Faça um programa que calcule o fatorial de um número inteiro fornecido pelo usuário.
Ex.: 5!=5.4.3.2.1=120
*/

import java.util.Scanner;

public class Fatoriais {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Número: ");
        int numero = scan.nextInt();
        int multiplicacao = 1;
        System.out.print(numero + "!= ");

        for(int i = numero; i > 0; i--) {
            multiplicacao *= i;
            if (i != 1) {
                System.out.print(i + ".");
            } else {
                 System.out.print(i + " = " + (multiplicacao));
            }
        }
    }
}
