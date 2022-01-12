package ITA.HandsOnInterfaceComparable;

public class Candidato implements Comparable<Candidato>{

    private int nota;
    private boolean pcd;
    private  int idade;

    public Candidato(int nota, boolean pcd, int idade) {
        this.nota = nota;
        this.pcd = pcd;
        this.idade = idade;
    }

    public int getNota() {
        return nota;
    }

    public boolean isPcd() {
        return pcd;
    }

    public int getIdade() {
        return idade;
    }

    @Override
    public int compareTo(Candidato outro) {
        if (nota == outro.getNota()){
            if (pcd == outro.isPcd()){
                return idade - outro.getIdade();

            }else {
                if (pcd)
                    return 1;
                else
                    return -1;
            }

        } else{
            return nota - outro.getNota();
        }
    }

    @Override
    public String toString() {
        return "Candidato{" +
                "nota=" + nota +
                ", pcd=" + pcd +
                ", idade=" + idade +
                '}';
    }
}
