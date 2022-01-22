package introducao.base.inicio.caracteristicaslinguagem.classes.pessoa;

import introducao.base.inicio.caracteristicaslinguagem.classes.usuario.SuperUsuario;

public class ProgramaDoUsuario {
    public static void main(String[] args) {
        final var vader = new SuperUsuario("vader", "1234$%@");
        vader.getLogin();
        //vader.getSenha (); ERRO
        //String nomeDoCliente = vader.nome; ERRo
    }
}
