package introducao.base.inicio.datas.javaDate;

import java.util.Date;

/**
 *  Exemplo de utilização do construtor com passagem de parametro em milisegundos
 */

public class Exemplo002 {
    public static void main(String[] args) {

        Long currentTimeMillis = System.currentTimeMillis();

        System.out.println(currentTimeMillis);
        // 1642949110867

        Date novaData = new Date(currentTimeMillis);

        System.out.println(novaData);
        // Sun Jan 23 11:45:10 BRT 2022

    }
}
