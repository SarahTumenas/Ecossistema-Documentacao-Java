package introducao.base.inicio.caracteristicaslinguagem.classes.pessoa;

public class Pessoa {
    private Integer idade;
    private Float  peso;

    public Pessoa() {
    }

    public Pessoa(Integer idade) {
        this.idade = idade;
    }

    public Pessoa(Integer idade, Float peso) {
        this.idade = idade;
        this.peso = peso;
    }

    public Integer getIdade() {
        return idade;
    }

    public Float getPeso() {
        return peso;
    }

    protected String relatorio (){
        return "Idade: " + idade+ " e Peso: " + peso;
    }
}
