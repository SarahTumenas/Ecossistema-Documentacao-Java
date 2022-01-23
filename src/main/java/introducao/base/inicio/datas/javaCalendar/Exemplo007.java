package introducao.base.inicio.datas.javaCalendar;

import java.util.Calendar;

/**
 *  Algumas conversões de data
 */

public class Exemplo007 {
    public static void main(String[] args) {

        Calendar agora = Calendar.getInstance();

        System.out.printf("%tc\n", agora);
        //Dom jan 23 20:58:11 BRT 2022

        System.out.printf("%tF\n", agora);
        //2022-01-23

        System.out.printf("%tD\n", agora);
        //01/23/22

        System.out.printf("%tr\n", agora);
        //11:43:36 AM

        System.out.printf("%tT\n", agora);
        //11:43:36

    }
}
