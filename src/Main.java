public class Main {
    public static void main(String[] args) {
        
        Cliente antonio = new Cliente();
        antonio.setNome("Antonio");

        Banco santander = new Banco();
        santander.setNome("Santander");

        Conta cc =new ContaCorrente(antonio,santander);
        cc.depositar(100);

        Conta poupanca = new ContaPoupanca(antonio,santander);

        cc.transferir(100,poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();

        santander.listarClientes();

    }
}
