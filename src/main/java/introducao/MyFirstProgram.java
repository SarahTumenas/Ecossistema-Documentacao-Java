package introducao;


import introducao.base.Order;

public class MyFirstProgram {
    public static void main(String[] args) {
        Order order = new Order("code 1234", 110);


        System.out.println(order);
    }
}
