package ITA.ClassesCalculoIMC;

public class Paciente {
    double peso;
    double altura;
    private transient double imc;


    public Paciente(double peso, double altura) {
        this.peso = peso;
        this.altura = altura;
        this.imc = imc;
    }

    public double getPeso() {
        return peso;
    }

    public double getAltura() {
        return altura;
    }

    public double getImc() {
        return imc;
    }

    public String calculaIMC() {

        double imc;
        imc = peso / (altura * altura);

        if (imc < 16) {
            return "Baixo peso muito grave ";
        } else if ( imc <= 16.99){
            return "Baixo peso grave";
        } else if ( imc <= 18.49){
            return "Baixo peso";
        } else if ( imc <= 29.99){
        return "Sobrepeso";
        }else if (imc <= 34.99){
        return "Obesidade grau I";
        }else if (imc <= 39.99){
        return "Obesidade grau II";
        }else if (imc  >= 40){
        return "Obesidade grau III (obesidade mórbida";
        } else
        return "Peso normal";
    }

}
