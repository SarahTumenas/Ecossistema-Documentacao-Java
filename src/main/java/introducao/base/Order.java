package introducao.base;

import java.math.BigDecimal;

public class Order {
    public final String code;
    public final double totalValue ;


    public Order(String code, double totalValue) {
        this.code = code;
        this.totalValue = totalValue;
    }

    public double calculateFee (){
     if (this.totalValue > 100){
         return this.totalValue * 0.99;
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




}
