package ITA.HandsOnHeranca;

public class ContaEspecial extends ContaCorrente{
    double limite;

    public ContaEspecial(double limite) {
        this.limite = limite;
    }

    public int sacar(int valor){
        if (valor > (saldo + limite)) {
            return 0;
        } else{
            saldo -= valor;
            return valor;
        }
    }
}
