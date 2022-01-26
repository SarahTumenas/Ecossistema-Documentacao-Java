package ITA.ClassesCalculoIMC;

public class Paciente {
    double peso;
    double altura;

    public Paciente(double peso, double altura) {
        this.peso = peso;
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public double getAltura() {
        return altura;
    }


    public String calculaIMC() {

        double imc = peso / (altura * altura);

        if (imc < 16) {
            return ("Baixo peso muito grave: " + getPeso()) ;
        } else if ((imc == 16) | (imc < 17)){
            return ("Baixo peso grave: " + getPeso());
        } else if ((imc == 17) | (imc < 18.5)){
            return ("Baixo peso: " +getPeso());
        } else if ((imc == 18.5) | (imc < 25.0)){
            return ("Baixo peso: " +getPeso());
        } else if ((imc == 25) | (imc < 30)){
        return ("Sobrepeso: " + getPeso());
        }else if ((imc == 30) | (imc < 35)){
        return ("Obesidade grau I: " + getPeso());
        }else if ((imc == 35) | (imc < 40)){
        return ("Obesidade grau II: " + getPeso());
        }else if (imc >= 40){
        return ("Obesidade grau III (obesidade mórbida): " + getPeso());
        } else
        return ("Informar os dados de peso e altura ");
    }

}
