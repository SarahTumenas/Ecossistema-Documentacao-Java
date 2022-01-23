package introducao.base.inicio.datas.javaLocalDate;


import java.time.LocalDateTime;

/**
 * Exemplo de como manipular LocalDateTime
 */

public class Exemplo014 {
    public static void main(String[] args) {

        LocalDateTime agora = LocalDateTime.now();

        System.out.println(agora);
        // 2022-01-23T11:56:56.075138100

        LocalDateTime futuro = agora.plusHours(1).plusDays(2).plusSeconds(12);

        System.out.println(futuro);
        // 2022-01-25T12:57:08.075138100

    }
}
