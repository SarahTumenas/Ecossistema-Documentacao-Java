package introducao.base.inicio.caracteristicaslinguagem.classes.pessoa;

import introducao.base.inicio.caracteristicaslinguagem.classes.cliente.Cliente;

public class ProgramaDoCliente {
    public static void main(String[] args) {
        final var cliente = new Cliente(18);
        cliente.getIdade();
        cliente.getPeso();
        System.out.println(cliente.relatorio()); //ok
    }
}
