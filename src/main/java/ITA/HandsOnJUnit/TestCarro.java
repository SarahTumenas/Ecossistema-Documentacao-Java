package ITA.HandsOnJUnit;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestCarro {

    @Test
    public void testCarroParado(){
        Carro c = new Carro();
        assertEquals(0, c.getVelocidade());
    }

    @Test
    public void testAcelerar(){
        Carro c = new Carro();
        c.potencia = 10;
        c.acelerar();
        assertEquals(10, c.getVelocidade());
    }

    @Test
    public void testFrear(){
        Carro c = new Carro();
        c.potencia = 10;
        c.acelerar();
        c.frear();
        assertEquals(5, c.getVelocidade());
    }

    @Test
    public void testFrearAteZero(){
        Carro c = new Carro();
        c.potencia = 10;
        c.acelerar();
        c.frear();
        c.frear();
        c.frear();
        c.frear();
        assertEquals(0, c.getVelocidade());
    }
}
