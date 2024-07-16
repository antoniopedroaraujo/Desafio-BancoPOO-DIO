public abstract class Conta implements IConta{

    protected int agencia;
    protected int numero;
    protected double saldo;
    private Cliente cliente;
    private Banco banco;

    private final static int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL;

    public Conta(Cliente cliente, Banco banco) {
        this.agencia = AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.cliente = cliente;
        this.banco = banco;
        this.banco.adicionarCliente(cliente);
    }


    @Override
    public void sacar(double valor) {
        saldo -= valor;
    }

    @Override
    public void depositar(double valor) {
        this.saldo += valor;
    }

    @Override
    public void transferir(double valor, Conta contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);
    }

    protected void imprimirInfosComuns(){
        System.out.println("Titular: " + this.cliente.getNome());
        System.out.println(String.format("Agencia: %d",agencia));
        System.out.println(String.format("Numero: %d",numero));
        System.out.println(String.format("Saldo: %.2f",saldo));
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }
}
