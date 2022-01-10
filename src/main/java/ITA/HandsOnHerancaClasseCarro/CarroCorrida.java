package ITA.HandsOnHerancaClasseCarro;

public abstract class CarroCorrida {

   protected int velocidade;
   protected int velocidadeMaxima;
   protected String nome;

    public CarroCorrida(int velocidadeMaxima, String nome) {
        this.velocidade = 0;
        this.velocidadeMaxima = velocidadeMaxima;
        this.nome = nome;
    }
    public abstract void  acelerar();

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
