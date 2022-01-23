package introducao.base.inicio.caracteristicasliguagem2.strings;

import java.util.Arrays;

public class StringBuilder {
    public static void main(String[] args) {

        var nome = "Sarah";

        final var builder = new java.lang.StringBuilder(nome);
        System.out.println(builder.append("Lucas"));

        final var reverse = builder.reverse();

        System.out.println(reverse);

        final var insert = reverse.insert(0, "#").insert(reverse.length(), "#");
        System.out.println(insert);

        System.out.println("A B C D E F G".toCharArray());
        System.out.println(Arrays.toString("Aula de Java".split(" ")));
        System.out.println("Aula".concat(" de Java"));


        System.out.println("1234 asda qw".replaceAll("[0,9]","S"));

    }

}
