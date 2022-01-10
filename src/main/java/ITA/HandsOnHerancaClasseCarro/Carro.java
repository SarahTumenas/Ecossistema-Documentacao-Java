package ITA.HandsOnHerancaClasseCarro;

public class Carro {
    private int potencia;
    private int velocidade;
    private int velocidadeMaxima;
    private String nome;

    public Carro(int potencia, int velocidadeMaxima, String nome) {
        this.potencia = potencia;
        this.velocidade = 0;
        this.velocidadeMaxima = velocidadeMaxima;
        this.nome = nome;
    }

    public void acelerar(){

        velocidade += potencia;
        if (velocidade > velocidadeMaxima)
            velocidade = velocidadeMaxima;
    }

    public void frear(){
        velocidade = velocidade/2;

    }

    public int getVelocidade (){

        return velocidade;
    }

    public String getNome() {
        return nome;
    }
}
