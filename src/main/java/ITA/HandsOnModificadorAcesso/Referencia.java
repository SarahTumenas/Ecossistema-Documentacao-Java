package ITA.HandsOnModificadorAcesso;

public class Referencia {
    int modificadorDefault;
    public int modificadorPublico;
    protected int modificadorProtegido;
    private int modificadorPrivado;

    public void propriaClasse(){
        modificadorDefault = 0;
        modificadorPublico =0;
        modificadorProtegido =0;
        modificadorPrivado = 0;
    }

}
