package ITA.HandsOnRefatorandoFuncoesParaMetodos;
//Métodos
public class Aluno {
    float bim1;
    float bim2;
    float bim3;
    float bim4;

    public float media (){
        float total = 0;
        total += bim1;
        total += bim2;
        total += bim3;
        total += bim4;

        return  total / 4;
    }

    public  boolean passouDeAno (){
          if ( media ()>= 60.0)
            return true;
        return false;
    }
}
