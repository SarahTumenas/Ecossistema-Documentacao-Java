package introducao.base.OrientacaoObjetos.Carro;

public class RodarAplicacao {
    public static void main(String[] args) {

        Carro carro1 = new Carro();

        carro1.setCor("azul");
        carro1.setModelo("BMW");
        carro1.setCapacidadeTanque(60);

        System.out.println(carro1.getModelo());
        System.out.println(carro1.getCor());
        System.out.println(carro1.getCapacidadeTanque());
        System.out.println(carro1.totalValorTanque(5.89));

        Carro carro2 = new Carro("preto", "Fiat", 55);
        System.out.println(carro2.getModelo());
        System.out.println(carro2.getCor());
        System.out.println(carro2.getCapacidadeTanque());
        System.out.println(carro2.totalValorTanque(4.99));

    }
}
