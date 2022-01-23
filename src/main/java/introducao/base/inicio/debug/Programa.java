package introducao.base.inicio.debug;

import introducao.base.inicio.debug.imc.CalculadorDeImc;
import introducao.base.inicio.debug.pessoa.Pessoa;

public class Programa {
    public static void main(String[] args) {
        final Pessoa pessoa = new Pessoa("Sarah", 1.7, 68.70);

        final var calculadorDeImc = new CalculadorDeImc();
        final var imc = calculadorDeImc.calcula(pessoa);

        System.out.printf("IMC = %.2f", imc);
    }
}
