package introducao.base.inicio.datas.javaDateFormat;

import java.text.DateFormat;
import java.util.Date;

/**
 * Exemplo de formatação de data com DateFormat
 */

public class Exemplo008 {
    public static void main(String[] args) {

        Date agora = new Date();

        String dateToStr = DateFormat.getInstance().format(agora);
        System.out.println(dateToStr);
        // 23/01/2022 11:50

        dateToStr = DateFormat.getDateTimeInstance(DateFormat.LONG,DateFormat.SHORT).format(agora);
        System.out.println(dateToStr);
        // 23 de janeiro de 2022 11:50


        dateToStr = DateFormat.getDateTimeInstance(DateFormat.LONG,DateFormat.LONG).format(agora);
        System.out.println(dateToStr);
        // 23 de janeiro de 2022 11:50:06 BRT

    }
}
