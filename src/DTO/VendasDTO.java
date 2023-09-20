/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

import java.math.BigDecimal;

/**
 *
 * @author NEX
 */
public class VendasDTO {
    private int id;
    private String produtos;
    private BigDecimal valor;
    private String DataVenda;
    private int quantidade;

    public VendasDTO(int id, String produtos,BigDecimal valor, String DataVenda, int quantidade) {
        this.id = id;
        this.produtos = produtos;
        this.DataVenda = DataVenda;
        this.quantidade = quantidade;
        this.valor = valor;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    
    
    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    
    
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProdutos() {
        return produtos;
    }

    public void setProdutos(String produtos) {
        this.produtos = produtos;
    }

    public String getDataVenda() {
        return DataVenda;
    }

    public void setDataVenda(String DataVenda) {
        this.DataVenda = DataVenda;
    }

    
    
}