package introducao.base.inicio.datas.javaCalendar;

import java.util.Calendar;

/**
 *  Exemplo de utilização da classe Calendar
 */

public class Exemplo006 {
    public static void main(String[] args) {

        Calendar agora = Calendar.getInstance();

        System.out.println("A data corrente é : " + agora.getTime());
        // A data corrente é : Sun Jan 23 11:44:01 BRT 2022

        agora.add(Calendar.DATE, -15);
        System.out.println("15 dias atrás: " + agora.getTime());
        // 15 dias atrás: Sat Jan 08 11:44:01 BRT 2022

        agora.add(Calendar.MONTH, 4);
        System.out.println("4 meses depois: " + agora.getTime());
        // 4 meses depois: Sun May 08 11:44:01 BRT 2022

        agora.add(Calendar.YEAR, 2);
        System.out.println("2 anos depois: " + agora.getTime());
        // 2 anos depois: Wed May 08 11:44:01 BRT 2024

    }
}
