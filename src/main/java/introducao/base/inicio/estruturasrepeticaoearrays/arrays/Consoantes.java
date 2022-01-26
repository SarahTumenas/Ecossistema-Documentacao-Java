package introducao.base.inicio.estruturasrepeticaoearrays.arrays;

/*
Faça um Programa que leia um vetor de 6 caracteres,
e diga quantas consoantes foram lidas.
Imprima as consoantes.
*/

import java.util.Scanner;

public class Consoantes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] consoantes = new String[6];

        int count = 0;
        int quantidadeDeConsoantes = 0;

        do {
            System.out.print("Letra: ");
            String letra = scan.next();
            if (!(letra.equalsIgnoreCase("a") |
                    letra.equalsIgnoreCase("e") |
                    letra.equalsIgnoreCase("i") |
                    letra.equalsIgnoreCase("o") |
                    letra.equalsIgnoreCase("u"))) {
                      consoantes[count] = letra;
                      quantidadeDeConsoantes++;
              }
            count++;
        } while (count < consoantes.length);
        System.out.print("Consoantes: ");
        for (String consoante : consoantes) {
            if (consoante != null)
                System.out.print(consoante + " ");
        }
        System.out.println("Quantidade de consoantes: " + quantidadeDeConsoantes);
    }
}
