package introducao.base.inicio.datas.javaLocalDate;

import java.time.LocalTime;

/**
 * Exemplo de como manioular LocalTime
 */

public class Exemplo013 {
    public static void main(String[] args) {

        LocalTime agora = LocalTime.now();

        System.out.println(agora);
        // 11:55:59.102055

        LocalTime maisUmaHora = agora.plusHours(1);

        System.out.println(maisUmaHora);
        // 12:55:59.102055

    }
}
