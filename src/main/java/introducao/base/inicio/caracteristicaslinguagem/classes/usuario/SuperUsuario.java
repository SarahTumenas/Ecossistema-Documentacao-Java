package introducao.base.inicio.caracteristicaslinguagem.classes.usuario;

public class SuperUsuario {
    private String login;
    private String senha;
    String nome;

    public SuperUsuario(String login, String senha) {
        this.login = login;
        this.senha = senha;
    }

    public String getLogin() {
        return login;
    }

    protected String getSenha() {
        return senha;
    }
}
