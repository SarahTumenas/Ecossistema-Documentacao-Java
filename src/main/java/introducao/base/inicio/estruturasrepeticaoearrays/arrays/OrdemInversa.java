package introducao.base.inicio.estruturasrepeticaoearrays.arrays;

/*
Crie um vetor de 6 números inteiros
e mostre-os na ordem inversa.
*/

public class OrdemInversa {
    public static void main(String[] args) {
        int[] vetor = {5, 8, 9, 6, 11, -1};

        System.out.print("Vetor: ");
        for (int elemento : vetor) {
            System.out.print(elemento + " ");
        }

        int count = (vetor.length - 1);
        System.out.print("\nVetor Inverso: ");
        while (count >= 0) {
            System.out.print(vetor[count] + " ");
            count--;
        }
    }
}
