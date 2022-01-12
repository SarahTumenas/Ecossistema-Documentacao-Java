package ITA.HandsOnTesteException;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class TestAutenticador {

    @Test
    public void loginComSucesso() throws LoginException {

        Autenticador a= new Autenticador();
        Usuario u = a.logar("Kenobi", "senhaKenobi");
        assertEquals ("Kenobi", u.getLogin());

    }

    @Test(expected = LoginException.class)
    public void loginFalha() throws LoginException {

        Autenticador a= new Autenticador();
        Usuario u = a.logar("Kenobi", "senhaJarJar");
    }

    @Test
    public void loginInformaErro()  {

        Autenticador a= new Autenticador();
        try {
            Usuario u = a.logar("Kenobi", "senhaJarJar");
            fail();
        } catch (LoginException e) {
            assertEquals ("Kenobi", e.getLogin());
        }
    }


}
