package ITA.HandsOnTesteException;

public class Autenticador {

    public Usuario logar(String login, String senha) throws LoginException{
            if (login.equals("Kenobi") && senha.equals("senhaKenobi")){
                return new Usuario(login);
            }
            throw  new LoginException("O usuário e senha não estão corretos!", login);
    }
}
