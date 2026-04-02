package com.pedido;

import java.util.ArrayList;
import java.util.List;
import com.delivery.Cliente;
import com.delivery.Endereco;



public class Pedido {
    private final String id;
    private final String clienteId;
    private final Endereco enderecoEntrega;
    private final List<ItemPedido> itens;
    private String status;

    public Pedido(String id, String clienteId, Endereco enderecoEntrega, List itens) {
        this.id = id;
        this.clienteId = clienteId;
        this.enderecoEntrega = enderecoEntrega;
        this.itens = new ArrayList<>();
        this.status = "Criado!";

        System.out.println("predido cridado, ID: " + this.id);
    }
}
