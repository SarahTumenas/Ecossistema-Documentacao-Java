package introducao.base.inicio.caracteristicaslinguagem.finals;

public class Programa {
    public static void main(String[] args) {
        final HardCoreGamer hardcoreGamer = new HardCoreGamer();

        final Gamer gamer = new Gamer();

        final CasualGamer casualGamer = new CasualGamer();

        final var game = "PUBG";

        //game = "WoW";

        System.out.println(casualGamer.play(game));


    }

}
