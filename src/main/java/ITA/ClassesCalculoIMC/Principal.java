package ITA.ClassesCalculoIMC;

public class Principal {
    public static void main(String[] args) {
        Paciente p1 = new Paciente(75.0,1.75);
        System.out.println(p1.calculaIMC());

        Paciente p2 = new Paciente(120.0, 1.78);
        System.out.println(p2.calculaIMC());

        Paciente p3 = new Paciente(62.3, 1.80);
        System.out.println(p3.calculaIMC());

    }
}
