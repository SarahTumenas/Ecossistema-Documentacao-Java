package introducao.base.inicio;

import java.math.BigDecimal;
/**
 * @author Sarah Tumenas
 * @version 1.0.0
 * @see BigDecimal
 * @since Release 1.0.0

 */
public class Order {

    // representa o código do pedido
    public final String code;
    public final BigDecimal totalValue ;

    /**
     * Construtor da Classe pedido
     * @param code Código do pedido
     * @param totalValue valor total do pedido
     */
    public Order(String code, BigDecimal totalValue) {
        this.code = code;
        this.totalValue = totalValue;
    }

    /**
     * Calcula a taxa de acordo com o valor total do pedido. Se o pedido for maior que R$100,00 uma taxa será cobrada
     * @return Valor total do pedido com as taxas
     * @throws RuntimeException Se o valor do pedido for negativo
     */

    public BigDecimal calculateFee () throws RuntimeException {
        if (this.totalValue.signum() < 0){
            throw  new RuntimeException("O pedido não pode ter valor negativo");
        }
     if (this.totalValue.compareTo(new BigDecimal("100.00")) > 100){
         return this.totalValue.multiply(new BigDecimal("0.99"));
     }else {
         return this.totalValue;
     }
    }

   /* switch Case
    private  final int totalValue;

    public double calulateFee (){
        switch (this.totalValue){
            case 100:
                return totalValue * 0.99;
            case 200:
                return totalValue * 1.99;
            default:
                return totalValue;
        }
    }
    */


/*
Estruturas de repetição

    private String [] items;

    public void printItems (){
        int i = 0;

        while (i < items.length){
            System.out.println(items [i]);
            i++;
        }
    }

    public void  printItem (){
        int i = 0;

        do {
            System.out.println(items[i]);
            i++;
        }while (i < items.length);
    }

    public void  printItems1(){
        for (int i = 0; i < items.length; i++){
            System.out.println(items[i]);
        }
    }

    public void printItems2 (){
        for (String i: items) {
            System.out.println(i);
        }
    }

 */
}
