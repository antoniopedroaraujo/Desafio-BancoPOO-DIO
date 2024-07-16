import java.util.ArrayList;
import java.util.List;

public class Banco {
    private String nome;
    private List<Cliente> clienteList = new ArrayList<>();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void adicionarCliente(Cliente cliente) {
        if (!this.clienteList.contains(cliente))
            this.clienteList.add(cliente);
    }

    public void listarClientes() {
        System.out.println("\nLISTA DE CLIENTES DO BANCO: " + this.nome);
        System.out.println("==========================================");
        clienteList.forEach(cliente -> System.out.println(cliente.getNome()));
    }
}
