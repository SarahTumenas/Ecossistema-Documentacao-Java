package ITA.HandsOnHeranca;

import org.junit.Before;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestContaEspecial extends TestContaCorrente{
    @Before
    public void inicializaConta(){
        cc = new ContaEspecial(100);
        cc.depositar(200);

    }


    @Test
    public void saqueSemSaldoSuficiente(){
        int valorSacado = cc.sacar(350);
        assertEquals(cc.saldo, 200);
        assertEquals(valorSacado, 0);
    }

    @Test
    public void maiorQueSaldoDentroLimite(){
        int valorSacado = cc.sacar(250);
        assertEquals(cc.saldo, -50);
        assertEquals(valorSacado, 250);
    }

}
