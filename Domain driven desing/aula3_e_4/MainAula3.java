import cliente.Cliente;
import cliente.Endereco;

import java.util.ArrayList;

public class MainAula3 {
    public static void main(String[] args) {

        ArrayList<String> lista = new ArrayList();
        Cliente clientes = new Cliente("vitor","email@email.com","11 99021-1003");
        Endereco endereco = new Endereco("silvios santosos","60","globoTv","globolandia","123globo456");

        System.out.println(clientes.getNome());
        System.out.println(clientes.getEmail());
        System.out.println(clientes.getTelefone());

        System.out.println(endereco.getTudo());
    }
}