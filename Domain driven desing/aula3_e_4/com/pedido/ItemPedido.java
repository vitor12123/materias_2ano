package com.pedido;

public class ItemPedido {

    private final String nomeItem;
    private final int quantidade;
    private final double precoUnitario;

    public ItemPedido(String nomeItem, int quantidade, double precoUnitario) {
        if( quantidade < 1) {
            throw new IllegalArgumentException("tem que ter pelo menos 1 item");
        }
        this.nomeItem = nomeItem;
        this.quantidade = quantidade;
        this.precoUnitario = precoUnitario;
    }
    public double calculoTotalPreco() {
        return quantidade * precoUnitario;
    }

    public String getNomeItem() {
        return nomeItem;
    }
    public int getQuantidade() {
        return quantidade;
    }
    public double getPrecoUnitario() {
        return precoUnitario;
    }

}
