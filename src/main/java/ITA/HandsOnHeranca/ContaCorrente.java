package ITA.HandsOnHeranca;

public class ContaCorrente {
    double saldo;

    public int sacar(int valor){
        if (valor > saldo) {
            return 0;
        } else{
            saldo -= valor;
            return valor;
        }
    }

    public void depositar(int valor){
        saldo += valor;
    }


}
