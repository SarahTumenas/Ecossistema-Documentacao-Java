package ITA.HandsOnHerancaClasseCarro;

public class Main {
    public static void main(String[] args) {

        Corrida corridaDaAmizade = new Corrida(2000);

        corridaDaAmizade.adicionaCarro(new CarroSoma(10,110,"CarroA"));
        corridaDaAmizade.adicionaCarro(new CarroSoma(8,140,"CarroB"));
        corridaDaAmizade.adicionaCarro(new CarroMulti(100,1.7,"CarroC"));
        corridaDaAmizade.adicionaCarro(new CarroMulti(110,1.4,"CarroD"));

        corridaDaAmizade.umDoisTresEJa();
    }
}
