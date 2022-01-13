package introducao.base.OrientacaoObjetos.HerancaAssociacaoInterface;

public class Main {
    public static void main(String[] args) {
        Funcionario funcionario =new Funcionario();

        //Upcast
        Funcionario gerente = new Gerente();
        Funcionario vendedor = new Vendedor();
        Funcionario faxineiro =new Faxineiro();

        //DownCast deve ser evitado
        Vendedor vendedor1 = (Vendedor) new Funcionario();
    }
}
