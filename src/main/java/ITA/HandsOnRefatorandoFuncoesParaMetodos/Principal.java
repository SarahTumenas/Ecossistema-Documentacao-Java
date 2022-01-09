package ITA.HandsOnRefatorandoFuncoesParaMetodos;

public class Principal {
    public static void main(String[] args) {
        Aluno lucas = new Aluno();
        lucas.bim1 = 70;
        lucas.bim2 = 60;
        lucas.bim3 = 80;
        lucas.bim4 = 70;

        /*se utilizar as funções
        System.out.println(VerificadoraNotas.mediaAluno(lucas));
        System.out.println(VerificadoraNotas.passouDeAno(lucas));*/

        System.out.println(lucas.media());
        System.out.println(lucas.passouDeAno());
    }
}