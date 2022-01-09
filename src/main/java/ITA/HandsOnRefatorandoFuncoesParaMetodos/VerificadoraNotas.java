package ITA.HandsOnRefatorandoFuncoesParaMetodos;
//Funções Estruturadas
public class VerificadoraNotas {
    public static float mediaAluno (Aluno a){
        float total = 0;
        total += a.bim1;
        total += a.bim2;
        total += a.bim3;
        total += a.bim4;

        return  total / 4;
    }

    public static boolean passouDeAno (Aluno a){
        float media = mediaAluno(a);
        if ( media >= 60.0)
            return true;
        return false;
    }
}
