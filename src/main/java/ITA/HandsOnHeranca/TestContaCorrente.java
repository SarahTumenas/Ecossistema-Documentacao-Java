package ITA.HandsOnHeranca;

import org.junit.Before;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestContaCorrente {
    ContaCorrente cc;

    @Before
    public void inicializaConta(){
         cc = new ContaCorrente();
        cc.depositar(200);

    }

    @Test
    public void deposito(){
       assertEquals(cc.saldo, 200);
    }

    @Test
    public void saque(){
        int valorSacado = cc.sacar(50);
        assertEquals(cc.saldo, 150);
        assertEquals(valorSacado, 50);
    }

    @Test
    public void saqueSemSaldoSuficiente(){
        int valorSacado = cc.sacar(250);
        assertEquals(cc.saldo, 200);
        assertEquals(valorSacado, 0);
    }


}
