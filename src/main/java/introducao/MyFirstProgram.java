package introducao;


import introducao.base.Order;

import java.math.BigDecimal;

public class MyFirstProgram {
    public static void main(String[] args) {
        Order order = new Order ("code1234", new BigDecimal("0.99"));


        System.out.println(order);
    }
}
