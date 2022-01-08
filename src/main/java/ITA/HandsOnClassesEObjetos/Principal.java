package ITA.HandsOnClassesEObjetos;

public class Principal {
    public static void main(String[] args) {
        Carro c1 = new Carro();
        c1.potencia = 10;
        c1.nome = "Corcel";
        c1.velocidade = 0;
        c1.imprimir();
        c1.acelerar();
        c1.imprimir();
        c1.acelerar();
        c1.acelerar();
        c1.acelerar();
        c1.frear();
        c1.imprimir();

        Carro c2 = new Carro();
        c2.potencia = 100;
        c2.nome = "Ferrari";
        c2.velocidade = 0;
        c2.imprimir();
        c2.acelerar();
        c2.imprimir();
        c2.acelerar();
        c2.acelerar();
        c2.acelerar();
        c2.frear();
        c2.imprimir();

        System.out.println("Carros : " + c1.nome + " e " + c2.nome);

    }
}
