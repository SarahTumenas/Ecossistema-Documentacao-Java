package introducao.base.inicio.caracteristicaslinguagem.statics;

public class Programa {
    public static void main(String[] args) {
        final Cachorro pitbull = new Cachorro();
        Cachorro.zoologia = "Bipede";

        final Cachorro viraLatas = new Cachorro();

        System.out.println(pitbull.zoologia);
        System.out.println(viraLatas.zoologia);

        String late = Cachorro.late();

    }
}
