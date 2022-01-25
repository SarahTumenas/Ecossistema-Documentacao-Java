package introducao.base.inicio.estruturasrepeticaoearrays.loops;

/*
Desenvolva um gerador de tabuada,
capaz de gerar a tabuada de qualquer número inteiro entre 1 a 10.
O usuário deve informar de qual numero ele deseja ver a tabuada.
A saída deve ser conforme o exemplo abaixo:
Tabuada de 5:
5 X 1 = 5
5 X 2 = 10
...
5 X 10 = 50
*/

import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Número: ");
        int numero = scan.nextInt();

        System.out.println("Tabuada de " + numero + ":");

        for (int i = 0; i < 11; i++) {
            System.out.println(numero + " X " + i + " = " + (numero * i));
        }
    }
}
